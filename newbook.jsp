
<!------ Include the above in your HEAD tag ---------->

<!Doctype html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script>
function func()
{	
document.getElementById("abc").action();
}
</script>

     <meta charset="UTF-8">
     <title>Hoopla</title>
     	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
/*-----Background-----*/
.background-image{
  filter: blur(8px);
  -webkit-filter: blur(8px);
}

body{
	background-image: url("https://www.autoadvantage.com.au/wp-content/uploads/2018/01/car-dealership.jpg");
	background-repeat:no-repeat;
	background-size:cover;
	width:100%;
	height:100vh;
	overflow:auto;
	 
}

/*-----for border----*/
.container{
	 font-family:Roboto,sans-serif;
	 background-image:url(https://image.freepik.com/free-vector/dark-blue-blurred-background_1034-589.jpg) ;
     border-style: 1px solid grey;
     margin: 0 auto;
     text-align: center;
     opacity: 0.8;
     margin-top: 67px;
   	 box-shadow: 2px 5px 5px 0px #eff;
     max-width: 700px;
     padding-top: 10px;
     height: 520px;
     margin-top: 166px;
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
 <!---heading---->
     <header class="heading">Book your ride</header><hr></hr>
	<!---Form starting----> 
	<form role="form" action="addbook" id="abc"method="POST">
	<div class="row ">
	 <!--- For Name---->
         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">Vehicle Id :</label> </div>
		         <div class="col-xs-8">
		             <input type="text" name="VEHICLEID" placeholder="Enter vehicle ID" class="form-control ">
             </div>
		      </div>
		 </div>
		<br/><br/>
		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="firstname" >Route Id :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="ROUTEID"  placeholder="Enter route ID" class="form-control" >
		         </div>
		     </div>
		 </div>
		 <br/><br/>
		  <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="firstname" >Booking Date :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="BOOKINGDATE" placeholder="Enter Booking date" class="form-control" >
		         </div>
		     </div>
		 </div>
		 <br/><br/>
         		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Date of Journey :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="JOURNEYDATE" placeholder="Enter journey date" class="form-control" >
		         </div>
		     </div>
		 </div>
		 <br/><br/>
		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Booking Status :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="BOOKINGSTATUS" value="1" class="form-control" >
		         </div>
		     </div>
		 </div>
		 	 <br/><br/>
		<div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Fare/km :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="TOTALFARE" value="15"  class="form-control" readonly>
		         </div>
		     </div>
		 </div>
		 	 <br/><br/>
		<div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Boarding Point :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="BOARDINGPOINT" placeholder="Enter boarding point" class="form-control" >
		         </div>
		     </div>
		 </div>
		 	 <br/><br/>
		<div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Drop Point :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="DROPPOINT" placeholder="Enter drop point" class="form-control" >
		         </div>
		     </div>
		 </div>
		 	 <br/><br/>
		  	 </div>
		     <div class="form-control">
							<input type="submit" class="btn btn-lg btn-primary btn-block" value="Book vehicle" onclick="func()">
			</div>
		   </form>
		   <marquee>Your Bill will be generated at the Drop Point</marquee>
		 </div>

</body>		
</html>
	 
	 