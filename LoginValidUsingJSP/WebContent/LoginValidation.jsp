<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="lobj" class="mypojo.Login">
<jsp:setProperty name="lobj" property="login" param="tLogin"/>
<jsp:setProperty name="lobj" property="pass" param="tPassword"/>
</jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red" size="6" >Login Validation</form>
<%-- <%
String login=request.getParameter("tLogin");
String pass=request.getParameter("tPassword");
if(login.equals("admin")&&pass.equals("admin")){
%>

<jsp:forward page="Welcome.jsp"/>
<%
}else{
 %>
<jsp:include page="Login.html"/>
 <%
 out.println("Wrong ID or Password");
}
 %> --%>
 
 
 <%=lobj.display() %>
</body>
</html>