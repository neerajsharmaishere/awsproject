<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border=1>
<c:forEach items="${data}" var="data">
	<tr>
	<td>${data.name}</td>
	<%-- <td>${data.custName}</td> --%>
	</tr> 
 </c:forEach>
 </table>
 
 
</body>
</html>