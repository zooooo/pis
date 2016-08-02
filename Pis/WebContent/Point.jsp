<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
<title>포인트 충전</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script>
// 	radio버튼에서 선택된 값 체크하는 함수 
	function pointcheck(){
		if(!document.pointform.point.value){	// 선택된 값이 없을때
			alert("선택된 값이 없습니다.");
			return false;	
		}
		
		if(document.pointform.point.value){		// 선택된 값이 있을때
	      	var check = confirm("결제를 진행하시겠습니까?");	// 확인, 취소 버튼있는 alert창 
	      	
	      	if(check){	// 확인버튼을 눌렀을때 포인트 결제하는 페이지로 이동
	      		url="PointCharge.jsp?"
	      		window.open(url,"post","toolbar=no ,width=500 ,height=300,directories=no,status=yes,scrollbars=yes,menubar=no");
	      	}
	    
		}
		
	}
</script>
<!-- <style type="text/css"> -->
/* tr.hr { */
/* 	border-top: 2px solid #31A0B4; */
/* 	border-bottom: 2px solid #31A0B4; */
/* } */

<!-- </style> -->
</head>
<body>


<p><h1>포인트충전</h1></p>
<form name="pointform" onsubmit="pointcheck()">
<!-- radio 버튼으로 클릭된 값이 on 으로 넘어감 -->
<table>
	<tr class="hr" height="20">
	<td height="10" align="center" width="150">충전캐시</td>
	<td align="center" width="300">적립혜택</td>
	</tr>
	<tr height="30">
	<td align="left" width="200"><input type="radio" name="point" id="1000">1,000원</td>
	<td width="300">1,000P</td>
	</tr>
	<tr height="30">
	<td align="left" width="200"><input type="radio" name="point" id="5000">5,000원</td>
	<td align="left" width="300">5,000P + 1,000P 추가적립</td>
	</tr>
	<tr height="30">
	<td align="left" width="200"><input type="radio" name="point" id="10000">10,000원</td>
	<td align="left" width="300">10,000P + 2,000P 추가적립</td>
	</tr>
	<tr height="30">
	<td align="left" width="200"><input type="radio" name="point" id="50000">50,000원</td>
	<td align="left" width="300">50,000P + 6,000P 추가적립</td>
	</tr>
	<tr height="30">
	<td align="left" width="200"><input type="radio" name="point" id="100000">100,000원</td>
	<td align="left" width="300">100,000P + 20,000P 추가적립</td>
	</tr>
	<tr>
	<td colspan="2" align="right"><input type="submit" value="결제하기"/></td>
	</tr>
</table>
</form>


</body>
</html>