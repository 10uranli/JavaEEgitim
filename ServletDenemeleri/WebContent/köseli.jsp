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
		out.print("****nokta ile map****");
	%>
	<p>${ilMap.Kars }</p>

	<%
		out.print("****kenar ile map****");
	%>

	<p>${ilMap['Kars']}</p>
	<p>${ilMap["Kars"]}</p>
	<p>${ilMap[evaluate]}</p>
	<p>${ilMap["izmir"]}</p>

	<%
		out.print("****kenar ile Array****");
	%>
	<p>${ilArray[0]}</p>
	<p>${ilArray['1']}</p>
	<p>${ilArray["2"]}</p>
	<p>${ilArray[3]}</p>
	<p>${ilArray[4]}</p>
	<p>${ilArray[5]}</p>
	<p>${ilArray[6]}</p>



</body>
</html>