<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
div#right {
	float: right;
	position: absolute;
	top: 5px;
	right: 0px;
	background-color: skyblue;
	width: 340px;
	top: 5px;
	right: 0px;
}

div#map {
	float: center;
	position: absolute;
	top: 5px;
	right: 350px;
}
</style>
<title></title>
<body>
	<div id="map" style="width: 800px; height: 600px;"></div>
	<div id="right">
		<c:if test="${result!=null }">
			<c:forEach var="search" items="${search }" begin="1">

				<ul>
					<li>서울특별시 ${search.addr }</li>
					<li>${search.parking_name }</li>
					<li>${search.tel }</li>
					<input type="button" value="ㄱㄱ"
						onclick="getValue(${search.lat}, ${search.lng })">
				</ul>
				<hr>

			</c:forEach>



		</c:if>



	</div>
	<p id="result"></p>

	<script type="text/javascript"
		src="//apis.daum.net/maps/maps3.js?apikey=421bee34f427ca0e30df2e951e2a3692"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		var map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 지도에 클릭 이벤트를 등록합니다
		// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
		daum.maps.event.addListener(map, 'click', function(mouseEvent) {

			// 클릭한 위도, 경도 정보를 가져옵니다 
			var latlng = mouseEvent.latLng;

			var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
			message += '경도는 ' + latlng.getLng() + ' 입니다';

			var resultDiv = document.getElementById('result');
			resultDiv.innerHTML = message;
			
			map.addOverlayMapTypeId(daum.maps.MapTypeId.TRAFFIC); 

			/* document.write(message); */

		});

		function getValue() {

			var lat = document.getElementById('lat');
			var lng = document.getElementById('lng');

			map.setCenter(new daum.maps.LatLng(parseFloat(lat.value),
					parseFloat(lng.value)));

			var marker = new daum.maps.Marker({
				map : map,
				position : new daum.maps.LatLng(parseFloat(lat.value),
						parseFloat(lng.value))
			});//마커 찍게 하는거
			
			map.addOverlayMapTypeId(daum.maps.MapTypeId.TRAFFIC); 

		}

		function getValue(lat, lng,addr,parking_name,tel) {

			/* var lat = document.getElementById('lat');
			var lng = document.getElementById('lng'); */

			map.setCenter(new daum.maps.LatLng(parseFloat(lat),
					parseFloat(lng)));

			var marker = new daum.maps.Marker({
				map : map,
				position : new daum.maps.LatLng(parseFloat(lat),
						parseFloat(lng))
			});//마커 찍게 하는거
			
			map.addOverlayMapTypeId(daum.maps.MapTypeId.TRAFFIC); 

		}
		
	</script>

	<div id="left">
		<form name="test" method="post" action="test.do">
			P.I.S <input type="text" name="addr"> <input type="submit"
				value="검색"><br>
		</form>
		<br>
		<form>
			주소 : <input type="text" id="addr" readonly="readonly"><br>
			이름 : <input type="text" id="parking_name" readonly="readonly"><br>
			전번 : <input type="text" id="tel" readonly="readonly"> <input
				type="submit" value="예약하기">
		</form>
	</div>
</body>
</html>