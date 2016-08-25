<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Request ile :<%=request.getParameter("ad") %></p>
<p>param ile :   ${param.ad }   </p>
<!-- param maptir -->
<!-- scopelerde maptir -->
<p>${param.takim }</p>
<p>${paramValues.check[0]}</p>
<p>${paramValues.check[1]}</p>

</body>
</html>