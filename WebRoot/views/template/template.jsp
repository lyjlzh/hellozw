<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property="title" /></title>
<!-- Loading Bootstrap -->
<link href="${path}/js/Bootstrap/css/bootstrap.min.css" rel="stylesheet"></link>
<link href="${path}/css/common.css" rel="stylesheet"></link>
<link href="${path}/css/social-buttons.css" rel="stylesheet"></link>
<link href="${path}/views/template/template.css" rel="stylesheet"></link>
<link href="${path}/js/zw-bootstrap/zw-bootstrap.css" rel="stylesheet"></link>
<link href="${path}/js/octicons/octicons.css" rel="stylesheet"></link>
<link rel="shortcut icon"
	href="http://static.bootcss.com/www/assets/ico/favicon.png"></link>
<script src="${path}/js/jquery-1.11.2.min.js"></script>
<script src="${path}/js/Bootstrap/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${path}/js/zw-bootstrap/zw-bootstrap.js"></script>
<script src="${path}/js/common.js"></script>
<sitemesh:write property="head" />
</head>
<body>

	<nav class="navbar navbar-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"
				style="font-weight: bold; color: #333;"> HelloZw </a>
		</div>

		<div class="collapse navbar-collapse" id="navbar-collapse-01">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="/HelloZw" class="header-nav-link">首页</a></li>
				<li><a href="indexMain" class="header-nav-link">个性导航</a></li>
				
				<li><a href="#" class="header-nav-link">Resume</a></li>
				<li class="dropdown"><a href="#"
					class="dropdown-toggle header-nav-link" data-toggle="dropdown">生活
						<b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#"><span class="octicon octicon-milestone"></span>&nbsp;&nbsp;心情</a></li>
						<li><a href="#"><span class="octicon octicon-book"></span>&nbsp;&nbsp;读书</a></li>
					</ul></li>
				<li class="dropdown"><a href="#"
					class="dropdown-toggle header-nav-link" data-toggle="dropdown">娱乐
						<b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#"><span class="glyphicon glyphicon-picture"></span>&nbsp;&nbsp;照片</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-music"></span>&nbsp;&nbsp;音乐</a></li>
						<li><a href="#"><span
								class="glyphicon glyphicon-facetime-video"></span>&nbsp;&nbsp;电影</a></li>
					</ul></li>

			</ul>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="aboutme" class="header-nav-link"
					data-toggle="tooltip" data-placement="bottom"
					title="<div style='width:30px;'>登录 </div>"> <span
						class="octicon octicon-sign-in"></span>&nbsp;
				</a></li>
				<!--  <li><a href="aboutme" class="header-nav-link"
					data-toggle="tooltip" data-placement="bottom"
					title="<div style='width:30px;'>消息  </div>"> <span
						class="glyphicon glyphicon-comment"></span>&nbsp;
				</a></li>-->
				<li><a href="aboutme" class="header-nav-link"
					data-toggle="tooltip" data-placement="bottom"
					title="<div style='width:30px;'>关于
         </div>"> <span
						class="octicon octicon-person"></span>&nbsp;
				</a></li>
			</ul>
		</div>
	</div>
	<!-- /.navbar-collapse --> </nav>
	<!-- /navbar -->

	<sitemesh:write property="body" />
	<footer>
	<div class="myclearfix">
		<span>©2015 hellozw <a href="http://www.miitbeian.gov.cn/">皖ICP备14011269号-1</a></span>
	</div>
	</footer>

	<!-- /menu -->
</body>
</html>