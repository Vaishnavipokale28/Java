<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>This is first.jsp</h2>
<%--a=<%= request.getAttribute("a") %>  --%>

email=<%=session.getAttribute("email") %>
</body>
</html>