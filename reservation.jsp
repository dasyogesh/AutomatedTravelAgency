<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ey.ata.bean.*"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>

<body>
<%ReservationBean eb=(ReservationBean)request.getAttribute("vbb"); %>
<table border="4">
<tr><th>RESERVATIONID</th><th>USERID</th><th>VEHICLEID</th><th>ROUTEID</th><th>BOOKINGDATE</th><th>JOURNEYDATE</th><th>DRIVERID</th><th>BOOKINGSTATUS</th><th></th><th>TOTALFARE</th><th>BOARDINGPOINT</th><th>DROPPOINT</th></tr>

	<tr><td><%=eb.getRESERVATIONID() %></td><td><%=eb.getUSERID() %></td><td><%=eb.getVEHICLEID()%></td><td><%=eb.getROUTEID()%></td><td><%=eb.getBOOKINGDATE()%></td><td><%=eb.getJOURNEYDATE()%></td><td><%=eb.getDRIVERID()%></td><td><%=eb.getBOOKINGSTATUS()%></td><td><%=eb.getTOTALFARE()%></td><td><%=eb.getBOARDINGPOINT()%></td><td><%=eb.getDROPPOINT()%></td></tr>
	
</body>
</html>