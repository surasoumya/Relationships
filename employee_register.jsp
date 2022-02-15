<html>
<body bgcolor ="wheat">
<%@page import="java.sql.*"%>
<%
Connection connection = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
connection = DriverManager.getConnection(url,"root","Soumya@07");
String ename = request.getParameter("name");
String password = request.getParameter("pwd");
String designation = request.getParameter("desig");
String email = request.getParameter("email");
String phone = request.getParameter("mobile");

String sql = "insert into employee(name,password,designation,email,phone)values(?,?,?,?,?)";
ps = connection.prepareStatement(sql);
ps.setString(1, ename);
ps.setString(2, password);
ps.setString(3, designation);
ps.setString(4, email);
ps.setString(5, phone);

int x = ps.executeUpdate();
if(x != 0)
	response.sendRedirect("employee_login.html");
%>
<h1 align="center">Registered Successfully!!</h1>

</html> 