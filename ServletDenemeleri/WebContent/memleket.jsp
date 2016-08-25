<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="_Controller5.Il_Bilgisi" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HT
ML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
<p><%out.println("****getAtt ile**** ");%></p>
<%= ((Il_Bilgisi)request.getAttribute("sehirReq")).getMeshur()%>
<%= ((Il_Bilgisi)request.getAttribute("sehirReq")).getBolge()%>
<%= ((Il_Bilgisi)request.getAttribute("sehirReq")).getMemleket().getPlaka()%>
<%= ((Il_Bilgisi)request.getAttribute("sehirReq")).getMemleket().getIl()%>
</p>
<p>
<p><%out.println("****Use Bean ile **** ");%></p>
<jsp:useBean id="sehirReq" class="_Controller5.Il_Bilgisi" scope="request"></jsp:useBean>
<jsp:getProperty property="meshur" name="sehirReq"/>
<jsp:getProperty property="bolge" name="sehirReq"/>
<%-- <jsp:getProperty property="memleket.plaka" name="sehirReq"/> --%>
</p>

<p>
<p><%out.println("****Expression ile **** ");%></p>
${sehirReq.meshur}
${sehirReq.bolge} 
${sehirReq.memleket.plaka} 
${sehirReq.memleket.il} 
</p>


</body>
</html>