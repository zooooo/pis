package Park.Controller;

import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class DBCPInit extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {

		try {
			
			String drivers = config.getInitParameter("jdbcdriver");
			StringTokenizer st = new StringTokenizer(drivers, ",");
			while (st.hasMoreTokens()) {
				String jdbcDrvier = st.nextToken();
				Class.forName(jdbcDrvier);
			}

			Class.forName("org.apache.commons.dbcp.PoolingDriver");
			

		}

		catch (Exception ex) {
			throw new ServletException(ex);
		}

	}

}
