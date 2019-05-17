<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red" size="6">Welcome to JSP</font>
<%! %>
<%java.util.Date d1=new java.util.Date(); %>
Current Date is: <%=d1.getDate()  %>:<%=d1.getMonth() %>
<h1>Learn how to use JSP</h1>
</body>
</html>