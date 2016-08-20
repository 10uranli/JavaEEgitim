<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="BeanID" class="_Controlle.Mekan" scope="session">
		<jsp:setProperty name="BeanID" property="mekanAd" value="MekanAdi"/>
		<jsp:setProperty name="BeanID" property="mekanAdres"
			value="MekanAdresi" />
		<jsp:setProperty name="BeanID" property="mekanId" value="5" />
	</jsp:useBean>
	<jsp:getProperty name="BeanID" property="mekanAd" />
	<jsp:getProperty name="BeanID" property="mekanAdres" />
	<jsp:getProperty name="BeanID" property="mekanId" />
</body>
</html>