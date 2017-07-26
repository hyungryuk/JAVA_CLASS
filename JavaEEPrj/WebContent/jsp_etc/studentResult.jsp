<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--@ page import="VO.StudentVO"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage = "common/errorInfo.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생정보 입력된 결과</h1>
	<%
		String str = null;
		out.println(str.length());
	%>
	<%--
		StudentVO vo = (StudentVO)request.getAttribute("student");
		out.println(vo);	
	--%>
	<%--=vo.getS_id() --%>
	<h2> 학번 : ${student.s_id}</h2>
	<h2> 이름 : ${student.s_name}</h2>
	<ul>
		<c:forEach var="s_mj" items="${student.s_major}">
		<li>${s_mj}</li>
		</c:forEach>
	</ul>
</body>
</html>