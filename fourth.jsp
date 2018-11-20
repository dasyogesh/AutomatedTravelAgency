<html>
<head>
     <meta charset="UTF-8">
     <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	function func()
	{	
	document.getElementById("task1").action();
	}
</script>
     <title>Hoopla</title>
     	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
/*-----Background-----*/

body{
	background-image: url("https://isorepublic.com/wp-content/uploads/2016/11/night-drive-1000x750.jpg");
	 background-repeat:no-repeat;
	 background-size:cover;
	 width:100%;
	 height:100%;
	 overflow:auto;
	 
}

/*-----for border----*/
.container{
	 font-family:Roboto,sans-serif;
	 background-image:url(https://image.freepik.com/free-vector/dark-blue-blurred-background_1034-589.jpg) ;
     border-style: 1px solid grey;
     margin: 0 auto;
     text-align: center;
     opacity: 0.6;
     margin-top: 7px;
   	 box-shadow: 2px 5px 5px 0px #aaa;
     max-width: 800px;
     padding-top: 20px;
     padding-left: 120px;
     height: 735px;
     margin-top: 30px;
}
/*--- for label of first and last name---*/
.lastname{
	 margin-left: 1px;
     font-family: sans-serif;
     font-size: 14px;
     color: white;
     margin-top: 10px;
}
.firstname{
	 margin-left: 1px;
     font-family: sans-serif;
     opacity: 0.9;
     font-size: 14px;
     color: white;
     margin-top: 5px;
}
#lname{
	 margin-top:5px;
}
	  

/*---for heading-----*/
.heading{
	 text-decoration:bold;
	 text-align : center;
	 font-size:30px;
	 color:#F96;
	 padding-top:10px;
}
/*-------for email----------*/
  /*------label----*/
#email{
	  margin-top: 5px;
}
/*-----------for Password--------*/
     /*-------label-----*/
.mail{
	 margin-left: 44px;
     font-family: sans-serif;
     color: white;
     font-size: 14px;
     margin-top: 13px;
}
.pass{
	 color: white;
     margin-top: 9px;
     font-size: 14px;
     font-family: sans-serif;
     margin-left: 6px;
     margin-top: 9px;
}
#password{
 margin-top: 6px;
}
/*------------for phone Number--------*/
      /*----------label--------*/
.pno{
	 font-size: 18px;
     margin-left: -13px;
     margin-top: 10px;
     color: #ff9;
	
}	

/*--------------for Gender---------------*/
     /*--------------label---------*/
.gender {
	 color: white;
     font-family: sans-serif;
     font-size: 14px;
     margin-left: 28px;
     margin-top: 8px;
}

     /*---------- for Input type--------*/
.col-xs-4.male{
	 color: white;
     font-size: 13px;
     margin-top: 9px;
     padding-bottom: 16px;
}
.col-xs-4.female {
     color: white;
     font-size: 13px;
     margin-top: 9px;
     padding-bottom: 16px;
	 padding-right: 95px;
}	
/*------------For submit button---------*/
.sbutton{
	 color: white;
     font-size: 20px;
     border: 1px solid white;
     background-color: #080808;
     width: 32%;
     margin-left: 41%;
     margin-top: 16px;
	 box-shadow: 0px 2px 2px 0px white;
  	   
   }
.btn.btn-warning:hover {
    box-shadow: 2px 1px 2px 3px #99ccff;
	background:#5900a6;
	color:#fff;
	transition: background-color 1.15s ease-in-out,border-color 1.15s ease-in-out,box-shadow 1.15s ease-in-out;
	
}
</style>
<body>
 <div class="container">
  <div class=form-group>
   	<div class="row ">
         <div class="col-sm-8">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">Add Vehicle:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="addVehicle"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Add Vehicle"></form>
             	 </div>
             	 
             	 <div class="col-xs-4">
          	         <label class="firstname">Delete Vehicle:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="deleteVehicle"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Delete vehicle"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">View Vehicle:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewVehicle"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View Vehicle"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Modify Vehicle:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="modifyVehicle"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Modify Vehicle"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Add Driver:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="addDriver"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Add Driver"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Delete Driver:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="deleteDriver"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Delete Driver"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Allot Driver:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="allotDriver"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Allot Driver"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Modify Driver:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="modifyDriver"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Modify Driver"></form>
             	 </div>
             	  <div class="col-xs-4">
          	         <label class="firstname">Add Route:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="addRoute"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Add Route"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Delete Route:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="deleteRoute"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Delete Route"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">View Route:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewRoute"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View Route"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">View Booking Details:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewBooking"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View Booking Details"></form>
             	 </div>
             	 <br/>
             </div>
         </div>
     </div>
 </div>
 </div>
</body>
</html>
 
             
             	