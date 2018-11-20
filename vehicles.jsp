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
<%VehicleBean eb=(VehicleBean)request.getAttribute("vbb"); %>
<table border="4">
<tr><th>VEHICLEID</th><th>NAME</th><th>TYPE</th><th>REGISTRATIONNUMBER</th><th>SEATINGCAPACITY</th><th>FAREPERKM</th></tr>

	<tr><td><%=eb.getVEHICLEID() %></td><td><%=eb.getNAME() %></td><td><%=eb.getTYPE()%></td><td><%=eb.getREGISTRATIONNUMBER()%></td><td><%=eb.getSEATINGCAPACITY()%></td><td><%=eb.getFAREPERKM()%></td></tr>
	
</body>
</html>