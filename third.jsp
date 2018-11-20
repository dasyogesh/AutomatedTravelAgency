<html>
<head>
     <meta charset="UTF-8">
     <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

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
     margin-top: 200px;
   	 box-shadow: 2px 5px 5px 0px #aaa;
     max-width: 700px;
     padding-top: 30px;
     padding-left: 120px;
     height: 420px;
     margin-top: 46px;
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
          	         <label class="firstname">View vehicles by type:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewVt"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View vehicles by type"></form>
             	 </div>
             	 
             	 <div class="col-xs-4">
          	         <label class="firstname">View vehicles by seats:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewVs"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View vehicles by seats"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">View all routes:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewAr"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View All Routes"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Book vehicle:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="bookV"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Book Vehicle"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">Cancel booking:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="cancelB"><input type="submit" class="btn btn-lg btn-primary btn-block" value="Cancel Booking"></form>
             	 </div>
             	 <div class="col-xs-4">
          	         <label class="firstname">View booking details:</label>
          	     </div>
          	     <div class="col-xs-8">
		             		<form action="viewBd"><input type="submit" class="btn btn-lg btn-primary btn-block" value="View booking details"></form>
             	 </div>
             	 <br/>
             </div>
         </div>
     </div>
 </div>
 </div>
</body>
</html>
 
             
             	