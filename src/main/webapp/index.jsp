<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>index</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
        <form action="Process" method="get">
            <input type="text" name="op1"/>
            <input type="text" name="op2"/>
            <input type="submit" value="add" name="action"/>
            <input type="submit" value="subtract" name="action"/>
        </form>
    <br/>
    <hr/>
    <p>The result is :<%=request.getAttribute("result") %></p>
    </body>
</html>