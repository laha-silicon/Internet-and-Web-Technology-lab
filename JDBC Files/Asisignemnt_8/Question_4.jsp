<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "Question_4.jsp" method="post">
    Weight(KG): <input type="text" name="w"><br>
    Height(CMS): <input type="text" name="h"><br>
    Age: <input type="text" name="a">
    Gender: <input type="radio" name="g" value="m">Male 
    <input type="radio" name="g" value="f">Female
    <br>
    <input type="submit" name="submit">
    <br>
</form>

<%
	try
	{
        double w1 = Double.parseDouble(request.getParameter("w"));
        double h1 = Double.parseDouble(request.getParameter("h"));
        int a = Integer.parseInt(request.getParameter("a"));
        String g = request.getParameter("g");
        if(g == "m")
        {
        double bmr = (10*w1) + (6.25*h1) - (5*a) + 5;        
        out.println("Your BMR is: " + bmr + " Calories/day");
        }
        else if(g == "f")
        {
        	double bmr = (10*w1) + (6.25*h1) - (5*a) - 161;            
            out.println("Your BMR is: " + bmr + " Calories/day");
        }
    
	}
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>