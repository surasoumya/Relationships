<html>
<body bgcolor ="#aaa">
<%@page import="java.sql.*"%>
<%
Connection connection = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
connection = DriverManager.getConnection(url,"root","Soumya@07");
String username = request.getParameter("name");
String password = request.getParameter("pwd");
String sql = "select * from manager where name=? and password=?";
ps = connection.prepareStatement(sql);
ps.setString(1, username);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next())
	session.setAttribute("mid",rs.getInt(1));
	session.setAttribute("department",rs.getString(4));
	response.sendRedirect("manager_homepage.html");
%>
<h1>Login Successfully</h1>
</body>
</html> 