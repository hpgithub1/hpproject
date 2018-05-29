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

<style type="text/css">
.code 
{
 background:url(code_bg.jpg);
 font-family:Arial;
 font-style:italic;
 color:blue;
 font-size:30px;
 border:0;
 padding:2px 3px;
 letter-spacing:3px;
 font-weight:bolder;
 float:left;
 cursor:pointer;
 width:150px;
 height:60px;
 line-height:60px;
 text-align:center;
 vertical-align:middle;
}
a 
{
 text-decoration:none;
 font-size:12px;
 color:#288bc4;
}
a:hover 
{
 text-decoration:underline;
}
</style>
<script type="text/javascript">
var code;
function createCode() 
{
 code = "";
 var codeLength = 6; //验证码的长度
 var checkCode = document.getElementById("checkCode");
 var codeChars = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
      'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'); //所有候选组成验证码的字符，当然也可以用中文的
 for(var i = 0; i < codeLength; i++) 
 {
  var charNum = Math.floor(Math.random() * 52);
  code += codeChars[charNum];
 }
 if(checkCode) 
 {
  checkCode.className = "code";
  checkCode.innerHTML = code;
 }
}
function validateCode() 
{
 var inputCode=document.getElementById("inputCode").value;
 if(inputCode.length <= 0) 
 {
  alert("请输入验证码！");
 }
 else if(inputCode.toUpperCase() != code.toUpperCase()) 
 {
   alert("验证码输入有误！");
   createCode();
 }
 else 
 {
  alert("验证码正确！");
 }    
}  
</script>
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
								<input id="name" name="name" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input id="id" name="id" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							
							<div class="input_outer">
								
								<table border="0" cellspacing="5" cellpadding="5" >
								   <tr>
								    	<td></td>   
								    	<td><div class="code" id="checkCode" onclick="createCode()" ></div></td>
								    	<td><a href="#" onclick="createCode()">看不清换一张</a></td>
								   </tr>
								   <tr>
								    	<td>验证码：</td>
								    	<td><input style="float:left;" type="text"  id="inputCode" /></td>
								    	<td>请输入验证码</td>
								   </tr>
								   <tr>
								    <td></td>
								    	<td><input id="Button1" onclick="validateCode();" type="button" value="确定" /></td>
								    <td></td>
								   </tr>
  									</table></div>
							
							<div class="mb2"><a class="act-but submit" onclick="login()" style="color: #FFFFFF">登录</a></div>
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
			id:$("#id").val(),
			name:$("#name").val()
		},function(data){
			console.log(data);
			if(data.code=="0"){
				window.location.href='views/index.jsp';
			}
			else{
				alert("账号密码错误");
				$("#id").val("");
				$("#name").val("")
			}
			
		})
		
	}
</script>
	</body>
	
</html>