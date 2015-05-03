<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>项目经验</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="${path}/views/experience/experience.js"></script>
<style>
.projects-header {
	text-align: center;
}
</style>
</head>

<body>
	<div class="container" id="container-main">
		<div class="row">
			<div class="projects-header page-header">
				<h2>个人相关优质项目品鉴</h2>
				<p>这些项目都是我从众多项目中筛选出来的优质项目，开发周期也都是超过半年以上</p>
				<!-- Single button -->
				<div class="btn-group">
					<button type="button"
						class="btn btn-sm btn-default dropdown-toggle"
						data-toggle="dropdown" aria-expanded="false">
						<span class="octicon octicon-gear"></span> 项目列表管理 <span
							class="caret"></span>
					</button>
					<!-- <ul class="dropdown-menu">
						<li><a href="#">添加项目</a></li>
						<li><a href="#">设置相关操作</a></li>
					</ul> -->
					<div class="dropdown-menu" style="width:300px;">
						<div lass="list-group">
							<a href="#" class="list-group-item"> <span class="octicon octicon-gear"></span>Cras justo odio </a> <a
								href="#" class="list-group-item"><span class="octicon octicon-gear"></span>Dapibus ac facilisis in</a> <a
								href="#" class="list-group-item"><span class="octicon octicon-gear"></span>Morbi leo risus</a> <a href="#"
								class="list-group-item"><span class="octicon octicon-gear"></span>Porta ac consectetur ac</a> <a href="#"
								class="list-group-item"><span class="octicon octicon-gear"></span>Vestibulum at eros</a>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="row">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail">
					<img data-src="holder.js/100%x200" alt="100%x200"
						src="${path}/images/ipmanage.jpg" data-holder-rendered="true"
						style="height: 200px; width: 100%; display: block;">
					<div class="caption">
						<h3 id="thumbnail-label">
							IP管控<a class="anchorjs-link" href="#thumbnail-label"><span
								class="anchorjs-icon"></span></a>
						</h3>
						<p>Cras justo odio, dapibus ac facilisis in, egestas eget
							quam. Donec id elit non mi porta gravida at eget metus. Nullam id
							dolor id nibh ultricies vehicula ut id elit.</p>
						<p>
							<a href="#" class="btn btn-xs btn-primary" role="button">了解更多</a>
							<a href="#" class="btn btn-xs btn-default" role="button">分享</a> <a
								href="#" class="btn btn-xs btn-default" role="button">编辑</a> <a
								href="#" class="btn btn-xs btn-default" role="button">删除</a>
						</p>


					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail">
					<img data-src="holder.js/100%x200" alt="100%x200"
						src="${path}/images/ipmanage.jpg" data-holder-rendered="true"
						style="height: 200px; width: 100%; display: block;">
					<div class="caption">
						<h3 id="thumbnail-label">
							IP管控<a class="anchorjs-link" href="#thumbnail-label"><span
								class="anchorjs-icon"></span></a>
						</h3>
						<p>Cras justo odio, dapibus ac facilisis in, egestas eget
							quam. Donec id elit non mi porta gravida at eget metus. Nullam id
							dolor id nibh ultricies vehicula ut id elit.</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">了解更多</a> <a
								href="#" class="btn btn-default" role="button">分享</a> <a
								href="#" class="btn btn-default" role="button">编辑</a> <a
								href="#" class="btn btn-default" role="button">删除</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail">
					<img data-src="holder.js/100%x200" alt="100%x200"
						src="${path}/images/ipmanage.jpg" data-holder-rendered="true"
						style="height: 200px; width: 100%; display: block;">
					<div class="caption">
						<h3 id="thumbnail-label">
							IP管控<a class="anchorjs-link" href="#thumbnail-label"><span
								class="anchorjs-icon"></span></a>
						</h3>
						<p>Cras justo odio, dapibus ac facilisis in, egestas eget
							quam. Donec id elit non mi porta gravida at eget metus. Nullam id
							dolor id nibh ultricies vehicula ut id elit.</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">了解更多</a> <a
								href="#" class="btn btn-default" role="button">分享</a> <a
								href="#" class="btn btn-default" role="button">编辑</a> <a
								href="#" class="btn btn-default" role="button">删除</a>
						</p>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
