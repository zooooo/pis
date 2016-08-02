package Parking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParkingInfoSelectAction implements CommandAction {

	private Connection getConnection() throws Exception {
		String jdbcDriver = "jdbc:apache:commons:dbcp:/pool";
		return DriverManager.getConnection(jdbcDriver);

	}

	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		Connection conn = null;
		PreparedStatement pstmt = null, pstmt2 = null;
		ResultSet rs = null, rs2 = null;
		Vector<SearchInfoBean> vecList = new Vector<SearchInfoBean>();
		request.setCharacterEncoding("utf-8");

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select parking_code,parking_name,addr,tel from park_info where addr like '%"
							+ request.getParameter("addr") + "%'",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			// 검색 결과 값이 있따면
			while (rs.next()) {
				SearchInfoBean searchList = new SearchInfoBean();
				searchList.setParking_code(rs.getInt(1));
				searchList.setParking_name(rs.getString(2));
				searchList.setAddr(rs.getString(3));
				searchList.setTel(rs.getString(4));
				pstmt2 = conn
						.prepareStatement("select lat ,lng from park_location where parking_code = " + rs.getInt(1));
				rs2 = pstmt2.executeQuery();
				if (rs2.next()) {
					searchList.setLat(rs2.getString(1));
					searchList.setLng(rs2.getString(2));
				}
				vecList.add(searchList);
			}
			request.setAttribute("search", vecList);
			request.setAttribute("result", request.getParameter("addr"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (rs2 != null) {
					rs2.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (pstmt2 != null) {
					pstmt2.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return "/test/maptest2.jsp";

	}

}
