<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>新感觉,新体验</title>
</head>
<body>
	<div class="container">
		<div class="row myhead">
			<h3>网站正在建设中，敬请期待...</h3>
			<p>由于本人工作繁忙，预计网站的开发时间在下半年，为了更好的浏览本站，请使用Chrome,Safari,Firefox浏览器</p>
		</div>
		<!--  
		<div class="row">
		<h3 style="margin-bottom:0;padding:0">
		<span style="color:#F6C811">祝</span>
		<span style="color:#F4373B">你</span>
		<span style="color:#ED38E2">生</span>
		<span style="color:#38B6ED">日</span>
		<span style="color:#57D40E">快</span>
		<span style="color:#F6C811">乐</span>
		<span style="color:red">,</span>
		<span style="color:#F4373B">亲</span>
		<span style="color:#ED38E2">爱</span>
		<span style="color:#38B6ED">的</span>
		<span style="color:#57D40E">张</span>
		<span style="color:#F6C811">威</span>
				<img src="Images/happy-birthday.jpg" width="100%" height="100%"/>
		</div>
		<div class="row demo-tiles">
			<div class="col-xs-3 my-col-xs-3">
				<div class="tile zw-tile-1">
					<img src="Js/Flat-UI-master/images/icons/svg/compas.svg"
						alt="Compas" class="tile-image">
					<h6>个性导航</h6>
				</div>
			</div>
			<div class="col-xs-3 my-col-xs-3">
				<div class="tile zw-tile-2">
					<img src="Js/Flat-UI-master/images/icons/svg/loop.svg"
						alt="Infinity-Loop" class="tile-image">
					<h6>同学汇</h6>
				</div>
			</div>
			<div class="col-xs-3 my-col-xs-3">
				<div class="tile zw-tile-3">
					<img src="Js/Flat-UI-master/images/icons/svg/pencils.svg"
						alt="Pensils" class="tile-image">
					<h6>我的博客</h6>
				</div>
			</div>
			<div class="col-xs-3 my-col-xs-3">
				<div class="tile tile-hot zw-tile-4">
					<img src="Js/Flat-UI-master/images/icons/svg/chat.svg" alt="Chat"
						class="tile-image">
					<h6>明星1+1</h6>
				</div>
			</div>
		</div>
-->
		<div class="flexslider">
			<ul class="slides">
				<li
					style="background: url(http://images.apple.com/cn/itunes/features/images/features_player_gallery1.jpg) 50% 0 no-repeat;"></li>
				<li
					style="background: url(http://images.apple.com/cn/itunes/features/images/features_player_gallery2.jpg) 50% 0 no-repeat;"></li>
			</ul>
		</div>

		<div class="row myrow">
			<div class="col-md-6">
				<h6 class="featurette-heading">个性导航</h6>
				<p>以前在大学的时候我就跟一位同学说(他的名字叫杨宝):我想做个收集常用的网址个性导航，他不以为然的说：现在很多的网站都有，比如：hao123，
					但是我觉得那没有实现个性化需求，最后我还是没有做。n年后，百度推出了个性导航，我才发现我是有远见之明的.</p>
			</div>

			<div class="col-md-6">
				<img alt=""
					src="http://images.apple.com/cn/itunes/features/images/features_player_organize_screen.jpg">
			</div>
		</div>
		<div class="row myrow">
			<div class="col-md-6">
				<img alt=""
					src="http://images.apple.com/cn/itunes/features/images/features_player_genius_screen.jpg">
			</div>
			<div class="col-md-6">
				<h6 class="featurette-heading">同学汇</h6>
				<p>我觉得我在网上跟别人交流最多的就是自己从小学到大学的同学，这让我有想做个类似于facebook那样的交友网站，
					但是这个网站只服务于我和我的同学，而且如果以后做成功了再推广吧.</p>
			</div>
		</div>
		<div class="row myrow">
			<div class="col-md-6">
				<h6 class="featurette-heading">我的博客</h6>
				<p>之前在博客园和Blogger上也开通了自己的博客，但是这次和之前的不一样，之前在博客园上的博客都是写有关技术方面的内容，
					而在Blogger上却是有关生活方面的，我想综合这两方面以服务自己为目的的博客系统.</p>
			</div>
			<div class="col-md-6">
				<img alt=""
					src="http://images.apple.com/cn/itunes/features/images/features_whatson_appstore_hero.png">
			</div>
		</div>
		<div class="row myrow">
			<div class="col-md-6">
				<img alt="" width="580" height="341"
					src="http://images.apple.com/cn/itunes/features/images/features_everywhere_ipod_hero.jpg">
			</div>
			<div class="col-md-6">
				<h6 class="featurette-heading">明星1+1</h6>
				<p>很早我的脑海里就有这样的冲动了，就是为自己喜欢的明星做个网站，这样的网站很特别，他是一个人崇拜自己偶像的地方，
					我会把它打造成一个让所有影迷和歌迷共同维护这块神圣之地的地方.</p>
			</div>

		</div>
	</div>
	<script type="text/javascript"
		src="js/flexslider/js/jquery.flexslider-min.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.flexslider').flexslider({
				directionNav : true,
				pauseOnAction : false
			});
		});
	</script>
</body>
</html>