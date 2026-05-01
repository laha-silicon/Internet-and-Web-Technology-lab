<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Question_2.jsp" method="post">
	Employee ID: <input type="text" name="empid"><br>
	Employee Name: <input type="text" name="empname"><br>
	Mobile: <input type="text" name="mobile"><br>
	E-mail: <input type="email" name="email"><br>
	Gender: <input type="radio" name="gender" value="Male">Male
			<input type="radio" name="gender" value="Female">Female<br>
	Date of Birth: <input type="date" name="dob"><br>
	Address: <textarea name="address"></textarea><br>
	Country: <select name="country">
				<option value="India">India</option>
				<option value="Other Country">Foreign Country</option></select><br>
	Languages Known: <input type="checkbox" name="lang" value="English">English
	<input type="checkbox" name="lang" value="Hindi">Hindi
	<input type="checkbox" name="lang" value="Bengali">Bengali
	<input type="checkbox" name="lang" value="Marathi">Marathi
	<input type="checkbox" name="lang" value="Odia">Odia
	<input type="submit" name="submit">
	</form>
	<%
	String s1 = request.getParameter("empid");
	String s2 = request.getParameter("empname");
	String s3 = request.getParameter("mobile");
	String s4 = request.getParameter("email");
	String s5 = request.getParameter("gender");
	String s6 = request.getParameter("dob");
	String s7 = request.getParameter("address");
	String s8 = request.getParameter("country");
	String s9 = request.getParameter("lang");
	try
	{
		out.println("Employee ID: ");
		out.println(s1+"<br>");
		out.println("Employee Name: ");
		out.println(s2+"<br>");
		out.println("Mobile Number: ");
		out.println(s3+"<br>");
		out.println("Employee E-mail ID: ");
		out.println(s4+"<br>");
		out.println("Gender: ");
		out.println(s5+"<br>");
		out.println("Employee DOB: ");
		out.println(s6+"<br>");
		out.println("Employee Address: ");
		out.println(s7+"<br>");
		out.println("Employee Country: ");
		out.println(s8+"<br>");
		out.println("Languages Known: ");
		out.println(s9+"<br>");
		
	}
	catch(Exception e)
	{
		out.println(e);
	}
	
	%>
	
</body>
</html>