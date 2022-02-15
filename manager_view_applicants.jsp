<!DOCTYPE html>
<html>
<body bgcolor = "#ccc">
<h1 align="center">Applicants</h1>
<br><br><br>
<%@page import="java.sql.*"%>
<table align="center" width="800",height="400" border="2">
<tr><td>Id</td><td>EmployeeName</td><td>FromDate</td><td>ToDate</td><td>NoOfLeaves</td><td>TotalLeaves</td><td>Status</td><td>Action</td></tr>
<%
Connection connection = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mondee";
connection = DriverManager.getConnection(url,"root","Soumya@07");
String manager = (String)session.getAttribute("department"); 
PreparedStatement ps = connection.prepareStatement("select * from leaves where mname=?");
ps.setString(1,manager);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td><td><%=rs.getString("ename") %><td><%=rs.getString("fromDate")%></td>
</td><td><%=rs.getString("toDate") %><td><%=rs.getInt("noofleaves")%></td><td><%=rs.getInt("totalleaves")%></td><td><%=rs.getString("status") %></td>
<td><a href="manager_action.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
</tr>
<%} %>
</table>
</body>
</html> 