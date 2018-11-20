
<html>
<head>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<style>
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


</style>


</head>


<script>

function func()
{	
document.getElementById("aaa").action();
}


function func1()
{	
document.getElementById("xyz").action();
}

</script>

<body>
<!------ Include the above in your HEAD tag ---------->

    <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Sign up to continue</strong>
					</div>
					<div class="panel-body">
						<form role="form" action="registerUser" id="aaa" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://i.imgur.com/dGo8DOk.jpg" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="Password"  name="pass" type="password">
											</div>
										</div>
										
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Register" onclick="func()">
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
	
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Sign in to continue</strong>
					</div>
					<div class="panel-body">
						<form role="form" action="loginuser" id="xyz" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://i.imgur.com/dGo8DOk.jpg" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="Username"  name="userid" type="text" autofocus>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="Password"  name="pass" type="password">
											</div>
										</div>
										
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in" onclick="func1()">
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