<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%request.setAttribute("Deger", 100);%>
<%request.setAttribute("BooleanName", false);%>
Toplama : <p>${Deger+10}</p>
Mod alma: <p>${Deger mod 10}</p>
Equals  : <p>${Deger eq 10}</p>
And     : <p>${booleanName and true}</p>
Or      : <p>${booleanName or true}</p>
 <p>***Patlayan, patlamayan kodlar***</p>

sifir hatasi: ${1/0}
<p>Olmayan bir sey hata dondurmez : ${denemedeneme}</p>

<!-- mod0 hata döndürür.  -->

<p>Olmayan deger toplama : ${OlmayanDeger + 10}</p>
<p>Olmayan deger boolean : ${OlmayanDeger and true}</p>

</body>
</html>