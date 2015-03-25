<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>个性导航</title>
<script type="text/javascript"
	src="${path}/js/dragsort-0.5.2/jquery.dragsort-0.5.2.js"></script>
<script type="text/javascript" src="${path}/views/main/main.js"></script>
<link href="${path}/js/Font-Awesome-3.2.1/css/font-awesome.css"
	rel="stylesheet"></link>

<style>
#container-main {
	height: 600px;
}

.zw-glyphicon {
	float: right;
}

#input-group-main-1 {
	margin: 20px 0;
}

.panel-body {
	padding: 0;
}

.list-group-item {
	border: 1px solid #ddd;
	padding: 5px 15px;
	font-size: 13px;
}

.list-group-item:last-child,.list-group-item:first-child {
	border-radius: 0;
}

.list-group-item.active,.list-group-item.active:hover,.list-group-item.active:focus
	{
	color: #4183c4;
	background-color: #fff;
	border-color: #ddd;
}

a.list-group-item:link {
	color: #4183c4;
	text-decoration: none;
}

a.list-group-item:visited {
	color: #4183c4;
	text-decoration: none;
}

a.list-group-item:hover {
	text-decoration: underline;
	color: #4183c4;
	background-color: #fff;
}

.panel-title {
	font-weight: bold;
}

.list-group {
	margin: 0;
}

#myTab>li>a {
	padding: 8px;
	font-size: 12px;
}

.nav-tabs>li.active>a,.nav-tabs>li.active>a:hover,.nav-tabs>li.active>a:focus
	{
	border: none;
	border-bottom: 2px solid #d26911;
}

#showlink {
	padding: 10px;
}

.zwinput {
	margin-left: 10px;
	font-size: 12px;
	height: 26px;
	width: 90%;
	border-radius: 12px;
}

.popover-content {
	padding: 0;
}

.popover {
	width: 300px;
}

.arrow {
	display: none !important;
}

.show-nav-list {
	display: none;
}

#showlink {
	background-color: #fafafa;
	min-height: 500px;
	border: solid 1px #ddd;
	margin-top: 10px;
}

.linkul li {
	display: inline-block;
	margin-left: 10px;
	margin-bottom: 10px;
	float: left;
	background-color: #fff;
	text-align: left;
	width: 195px;
	padding: 5px;
	border: solid 1px #ddd;
}

.list-group {
	margin: -1px;
}
</style>
</head>
<body>
	<div class="container" id="container-main">
		<div class="row">
			<div class="col-lg-3" style="padding:0">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							导航列表
							<p class="popover-options pull-right" style="font-size:14px;">
								<a id="mytitle" href="#" data-container="body"
									data-toggle="popover" data-placement="bottom" class="a-help">
									<span class="octicon octicon-plus"></span> <span
									class="octicon octicon-triangle-down"></span>
								</a> <span id="toggleedit" onclick="clickedit()"
									class="octicon octicon-gear a-help"></span>
							</p>
						</h3>
					</div>
					<div class="panel-body">
						<ul id="myTab" class="nav nav-tabs">
							<li class="active"><a href="#home" data-toggle="tab">技术社区</a></li>
							<li><a href="#sjyx" data-toggle="tab">社交邮箱</a></li>
							<li><a href="#shyl" data-toggle="tab">生活娱乐</a></li>
							<li><a href="#more" data-toggle="tab">更多</a></li>
						</ul>
						<div id="myTabContent" class="tab-content">
							<div class="tab-pane fade in active" id="home">
								<ul id="navList1" class="list-group"></ul>
							</div>
							<div class="tab-pane fade" id="sjyx">
								<div id="navList2" class="list-group"></div>
							</div>
							<div class="tab-pane fade" id="shyl">
								<div id="navList3" class="list-group"></div>
							</div>
							<div class="tab-pane fade" id="more">
								<div id="navList4" class="list-group"></div>
							</div>
						</div>

					</div>
				</div>

			</div>

			<div class="col-lg-9">
				<form id="querylink" action="http://www.baidu.com/baidu" target="_blank" class="input-group input-group-sm">
					<input name="tn" type="hidden" value="baidu"> <input
						id="linktxt" name="word" baiduSug="1" type="text"
						class="form-control" placeholder="请输入查询内容"> <span
						class="input-group-btn"> <!-- <button class="btn btn-success" type="button"
							onclick="queryLink()">
							<i class="icon-search" style="margin-right:10px;"></i>
						</button> -->
						<button type="submit" class="btn btn-success">
							<i class="icon-search" style="margin-right:10px;"></i>百度查询
						</button>
						<button type="button" class="btn btn-success dropdown-toggle"
							data-toggle="dropdown" aria-expanded="false">
							<span class="caret"></span> <span class="sr-only">Toggle
								Dropdown</span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#" onclick="queryLink()">链接查询</a></li>
						</ul>
					</span>
				</form>
				<div id="showlink"></div>
			</div>
			<!-- 模态框（Modal添加导航） -->
			<div class="modal fade" id="navModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title">添加导航</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal">
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="navname"
											placeholder="请输入导航名称">
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">类型</label>
									<div class="col-sm-10">
										<select id="navtype" class="form-control">
											<option value="1">技术社区</option>
											<option value="2">社交邮箱</option>
											<option value="3">生活娱乐</option>
											<option value="4">更多</option>
										</select>
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary"
								data-dismiss="modal" onclick="addNav()">保存</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal -->

			<!-- 模态框（Modal添加链接） -->
			<div class="modal fade" id="linkModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title">添加链接</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal">
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="linkname"
											placeholder="请输入链接名称">
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">网址</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="linkurl"
											placeholder="请输入链接网址">
									</div>
								</div>
								<div class="form-group">
									<label for="inputEmail3" class="col-sm-2 control-label">类型</label>
									<div class="col-sm-10">
										<select id="linktype" class="form-control"></select>
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary"
								data-dismiss="modal" onclick="addLink()">保存</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<script charset="gbk" src="http://www.baidu.com/js/opensug.js"></script>
			<!-- /.modal -->
</body>
</html>