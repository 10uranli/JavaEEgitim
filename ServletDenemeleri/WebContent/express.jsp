<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "Page Scope Value");
	%>
	<p>${name}</p>
	<p>${requestScope.name}</p>
	<p>${sessionScope.name}</p>
	<p>${applicationScope.name}</p>

	<p>***************Farkli Denemeler********************</p>
	<p>${cookie.cookieName.value}</p>
	<p>${header.host}</p>
	<p>${header.accept}</p>
	<p>${initParam.applicationScope.name}</p>



</body>
</html>