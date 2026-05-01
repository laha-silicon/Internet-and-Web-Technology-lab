<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Question_6.jsp">
    Email: <input type="text" name="email"><br>
    Pass: <input type="password" name="pass"><br>
    <input type="submit">
</form>

<%
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    if(email != null) 
    {
        if(email.equals("admin@gmail.com") && pass.equals("admin")) 
        {
            response.sendRedirect("welocme.jsp");
        } 
        else 
        {
            out.print("Invalid Credentials");
        }
    }
%>

</body>
</html>