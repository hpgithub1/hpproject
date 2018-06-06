<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="views/assets/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="views/assets/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="views/assets/css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->

</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎你</h3>
						<form action="#" name="f" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input id="username" name="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input id="password" name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2"><a class="act-but submit" onclick="login()" style="color: #FFFFFF;cursor:pointer;">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="views/assets/js/jquery-1.10.2.min.js"></script>
		<script src="views/assets/js/login_js/TweenLite.min.js"></script>
		<script src="views/assets/js/login_js/EasePack.min.js"></script>
		<script src="views/assets/js/login_js/rAF.js"></script>
		<script src="views/assets/js/login_js/demo-1.js"></script>
		<div style="text-align:center;">
</div>
<script>
	function login() {
		var url = 'rest/web/login';
	   
		$.post(url,{
			username:$("#username").val(),
			password:$("#password").val()
		},function(data){
			console.log(data);
			if(data.code=="0"){
				window.location.href='main.jsp';
			}
			else{
				alert("账号密码错误");
				$("#username").val("");
				$("#password").val("")
			}
			
		})
		
	}
</script>
	</body>
	
</html>