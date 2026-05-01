<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Question_3.jsp" method="post">
	Enter a Number: <input type="text" name="num"><br>
	<input type="submit" name="submit">
	</form>
	<%
	try
	{
		
	
	String s1 = request.getParameter("num");
	int num = Integer.parseInt(s1);
	int cnt=0;
	for(int i=1; i<=num; i++)
	{
		if(num%i==0)
		{
			cnt++;
		}
	}
	if(cnt == 2)
	{
		out.println(num + " is a Prime Number: ");
	}
	else
	{
		out.println(num + " is not a Prime Number: ");
	}
	}
	catch(Exception e)
	{
		out.println(e);
	}
	%>
</body>
</html>