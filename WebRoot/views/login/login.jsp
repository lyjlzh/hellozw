<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
</head>
<body>
<div class="container" id="content-h">
	<div class="login">
		<div class="login-screen">
			<div class="login-icon">
				<img src="js/Flat-UI-master/images/login/icon.png"
					alt="Welcome to Mail App">
				<h4>
					欢迎登入<small>HelloZw</small>
				</h4>
			</div>

			<div class="login-form">
				<div class="form-group">
					<input type="text" class="form-control login-field" value=""
						placeholder="用户名" id="login-name"> <label
						class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="form-group">
					<input type="password" class="form-control login-field" value=""
						placeholder="密码" id="login-pass"> <label
						class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<a class="btn btn-primary btn-lg btn-block" href="#">登 录</a> <a
					class="login-link" href="#">忘记密码？</a>
			</div>
		</div>
	</div>
</div>
</body>
</html>