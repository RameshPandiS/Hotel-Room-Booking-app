<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD HOTELS</title>
</head>
<body>
<form action="AddHotelServlet" method="post">
<label for=" addHotel">Hotel</label>
<input type="text" name="hotel" required>
<button type="submit">Submit</button>
</form>
<%
		String errorMessage = request.getParameter("errorMessage");
		if (errorMessage != null) {
			out.println("<font color='red'>" + errorMessage + "</font>");
		}
		%>
</body>
</html>