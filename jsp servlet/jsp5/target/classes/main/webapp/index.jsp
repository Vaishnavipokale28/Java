<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.LinkedList" %>
<html>
<body>
	<center>
		<h2>Student Registration Form</h2>
		<hr color="red">
		<form action="req1" method="get">
			<table>
				<tr>
					<td align="right">SID:</td>
					<td><input type="text" name="sid"></td>
				</tr>
				<tr>
					<td align="right">SNAME:</td>
					<td><input type="text" name="sname"></td>
				</tr>
				<tr>
					<td align="right">SCITY:</td>
					<td><input type="text" name="scity"></td>
				</tr>
				<tr>
					<td align="right">SPERCENTAGE:</td>
					<td><input type="text" name="spercentage"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" name="b1"
						value="Add"> <input type="submit" name="b2" value="Delete">
						<input type="submit" name="b3" value="Display"></td>
				</tr>
			</table>
		</form>
	<%-- <% out.print(a++);%>
		<%!int a=10; %>
	--%>	
	
<%-- 	<%
	request.setAttribute("a",10);
	request.getRequestDispatcher("first.jsp").forward(request, response
);	%>
--%>

	<% 
	session.setAttribute("email","abc@gmail.com");
	response.sendRedirect("first.jsp");
	%>
	</center>
</body>
</html>
