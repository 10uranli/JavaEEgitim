<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanId" class = "_Model.PersonModel" >
<jsp:setProperty name="beanId" property="ad"  value='<%=request.getParameter("ad") %>'/>
<jsp:setProperty name="beanId" property="soyad"  value='<%=request.getParameter("soyad") %>'/>
<jsp:setProperty name="beanId" property="yas"  value='<%=Integer.parseInt(request.getParameter("yas"))%>'/>
</jsp:useBean>
<jsp:getProperty property="ad" name="beanId"/>
<jsp:getProperty property="soyad" name="beanId"/>
<jsp:getProperty property="yas" name="beanId"/>

</body>
</html>