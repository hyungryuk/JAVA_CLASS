<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Customer 상세 정보</h2>
	주민번호 : ${customer.SSN} <br>
	이름 : ${customer.name} <br>
	주소: ${customer.addr} <br>
	포트폴리오 :
		<ol>
			<c:forEach var="shares" items="${customer.portfolio}">
			<li>
				${shares.symbol} - ${shares.quantity}
			</li>
			</c:forEach>
		</ol>
</body>
</html>