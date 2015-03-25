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

</head>

<body>
	<div class="container" id="container-main">
		<div class="row">
			<!-- Single button -->
<div class="btn-group">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
    Action <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
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
