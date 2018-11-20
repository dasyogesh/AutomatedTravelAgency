<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ey.ata.bean.*"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  height: 100%;
}
body {
  margin: 0;
  background: -webkit-linear-gradient(45deg, #49a09d, #5f2c82);
  background: linear-gradient(45deg, #49a09d, #5f2c82);
  font-family: sans-serif;
  font-weight: 100;
}
.container {
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}
table {
  width: 800px;
  border-collapse: collapse;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}
th,
td {
  padding: 15px;
  background-color: rgba(255, 255, 255, 0.2);
  color: #fff;
}
th {
  text-align: left;
}
thead th {
  background-color: #55608f;
}
tbody tr:hover {
  background-color: rgba(255, 255, 255, 0.3);
}
tbody td {
  position: relative;
}
tbody td:hover:before {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: -9999px;
  bottom: -9999px;
  background-color: rgba(255, 255, 255, 0.2);
  z-index: -1;
}
</style>
</head>
<body>
<%ReservationBean eb=(ReservationBean)request.getAttribute("vbb"); %>
<table border="4">
<tr><th>RESERVATIONID</th><th>USERID</th><th>VEHICLEID</th><th>ROUTEID</th><th>BOOKINGDATE</th><th>JOURNEYDATE</th><th>DRIVERID</th><th>BOOKINGSTATUS</th><th>TOTALFARE</th><th>BOARDINGPOINT</th><th>DROPPOINT</th></tr>
	<tr><td><%=eb.getRESERVATIONID()%></td><td><%=eb.getUSERID()%></td><td><%=eb.getVEHICLEID()%></td><td><%=eb.getROUTEID()%></td><td><%=eb.getBOOKINGDATE()%></td><td><%=eb.getJOURNEYDATE()%></td><td><%=eb.getDRIVERID()%></td><td><%=eb.getBOOKINGSTATUS()%></td><td><%=eb.getTOTALFARE()%></td><td><%=eb.getBOARDINGPOINT()%></td><td><%=eb.getDROPPOINT()%></td></tr>
</body>
</html>