<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<style>
------------------------------------------------------------------------------------------
.background{
  filter: blur(8px);
  -webkit-filter: blur(8px);
}

body{
  position: absolute;
  width: 100%;
  height: 100%;
background: #cfd8dc;
background: -moz-linear-gradient(-45deg,  #cfd8dc 0%, #607d8b 100%, #b0bec5 100%); /* FF3.6-15 */
background: -webkit-linear-gradient(-45deg,  #cfd8dc 0%,#607d8b 100%,#b0bec5 100%); /* Chrome10-25,Safari5.1-6 */
background: linear-gradient(135deg,  #cfd8dc 0%,#607d8b 100%,#b0bec5 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */

filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#cfd8dc', endColorstr='#b0bec5',GradientType=1 ); /* IE6-9 fallback on horizontal gradient */

}




/*-----------------------------------------------------------------------------------------*/

/*-----for border----*/


.profile-img:hover {
  opacity: 0.6;
}

.panel-heading {
    padding: 5px 15px;
}

.panel-footer {
	padding: 1px 15px;
	color: #A0A0A0;
}

.profile-img {
	width: 96px;
	height: 96px;
	margin: 0 auto 10px;
	display: block;
	-moz-border-radius: 50%;
	-webkit-border-radius: 50%;
	border-radius: 50%;
}
.col-xs-4 female {
margin: 0 auto 10px;
}
/* .col-xs-4 male {
margin: 0 auto 10px;
}
 */
</style>


</head>

<script>
function func()
{	
	var x=document.getElementById("utype").checked;
	var y=document.getElementById("utype1").checked;
	if(x==true)
		{
document.getElementById("abc").action();
	}
	else
		{
		document.getElementById("xyz").action();
		}
		}

</script>

<body>
<!------ Include the above in your HEAD tag ---------->

    <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong>Welcome Admin</strong>
					</div>
					<div class="panel-body">
						<form role="form" action="Admin/Login" id="abc"method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://cdn3.iconfinder.com/data/icons/web-ui-color/128/Lock_green-512.png" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Continue>>" onclick="func()">
										</div>

									</div>
								</div>
							</fieldset>
						</form>
					</div>
					
                </div>
			</div>
		</div>

	
	
<!--------------------------Customer------------------------>
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong>Welcome Customer</strong>
					</div>
					<div class="panel-body">
						<form role="form" action="Customer/Register" id="xyz" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://www.directlink.coop/img/icons/avatars/145841-avatar-set/png/man-3.png" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">

										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Continue>>" onclick="func()">
										</div>

									</div>
								</div>
							</fieldset>
						</form>
					</div>
					
                </div>
			</div>
		</div>
	</div>

</body>

</html>