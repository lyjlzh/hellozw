var tab = 1;
$(function() {
	getNavList("navList1", 1);
	btn_click("402881fc4bcf3608014bcf502c970000");

	$("#mytitle")
			.popover(
					{
						title : '选择要添加的内容<button type="button" class="close" aria-label="Close" onclick="closepopover()"><span aria-hidden="true" style="line-height:.8">&times;</span></button>',
						content : '<ul class="list-group"><li class="list-group-item"><span class="octicon octicon-plus" style="margin-right:5px;color:#666"></span><a href="#" data-toggle="modal" onclick="showNavMode();">新建导航列表</a></li><li class="list-group-item"><span class="octicon octicon-plus" style="margin-right:5px;color:#666"></span><a href="#" data-toggle="modal" onclick="showLinkMode();">新建链接内容</a></li></ul>',
						html : true
					});

	$('a[data-toggle="tab"]').on('shown.bs.tab', function(e) {
		// 获取已激活的标签页的名称
		var activeTab = $(e.target).text();
		// 获取前一个激活的标签页的名称
		// var previousTab = $(e.relatedTarget).text();
		switch (activeTab) {
		case "技术社区":
			tab = 1;
			getNavList("navList1", 1);
			break;
		case "社交邮箱":
			tab = 2;
			getNavList("navList2", 2);
			break;
		case "生活娱乐":
			tab = 3;
			getNavList("navList3", 3);
			break;
		case "更多":
			tab = 4;
			getNavList("navList4", 4);
			break;
		default:
			break;
		}
	});
});

// 获取导航菜单
var getNavList = function(id, type) {
	$("#" + id).empty();
	var html = '';
	$
			.getJSON(
					'json/loadNavListMainActionJson.action',
					{
						"personalNav.type" : type
					},
					function(data) {
						var count = data.navList.length;
						$(".badge").text(count);
						for (var i = 0; i < count; i++) {
							html += '<li class="list-group-item"><span class="repo-icon octicon octicon-repo" style="margin-right:10px;"></span>'
									+ '<a href="#" onclick="btn_click(\''
									+ data.navList[i].id
									+ '\')"><b>'
									+ data.navList[i].name
									+ '</b><input class="hidd" type="hidden" value="'
									+ data.navList[i].id
									+ '"></a><div class="pull-right">'
									+ '<span class="octicon octicon-pencil show-nav-list a-help navPopover'
									+ data.navList[i].id
									+ '" data-container="body" data-toggle="popover" data-placement="bottom" style="margin:0 10px;"></span>'
									+ '<span class="octicon octicon-x show-nav-list a-help" title="删除" onclick="delNav(\''
									+ data.navList[i].id + '\')"></span></li>';

						}
						$("#" + id).append(html);

						for (var i = 0; i < count; i++) {
							$(".navPopover" + data.navList[i].id)
									.popover(
											{
												title : '编辑导航<button type="button" class="close" aria-label="Close" onclick="closepopover2(\'navPopover'
														+ data.navList[i].id
														+ '\')"><span aria-hidden="true" style="line-height:.8">&times;</span></button>',
												content : '<div style="margin:5px 10px;"><input class="form-control navPopover2'
														+ data.navList[i].id
														+ '" type="text" class="form-control" value="'
														+ data.navList[i].name
														+ '"> </input></div><div style="margin:5px 10px;">'
														+ '<select class="form-control selnav'
														+ data.navList[i].id
														+ '"><option value="1">技术社区</option>'
														+ '<option value="2">社交邮箱</option>'
														+ '<option value="3">生活娱乐</option>'
														+ '<option value="4">更多</option>'
														+ '</select></div><div style="margin:5px 10px;"><button class="btn btn-primary form-control" type="button" onclick="editNav(\''
														+ data.navList[i].id
														+ '\');">修改</button></div>',
												html : true
											});
						}
						toggleEditClass();
					});
};

// 编辑导航
var editNav = function(id) {
	var name = $(".navPopover2" + id).val();
	var sel = $(".selnav" + id).val();
	$.ajax({
		type : 'POST',
		contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		url : "json/updateNavMainActionJson.action",
		data : {
			"personalNav.id" : id,
			"personalNav.name" : name,
			"personalNav.type" : sel
		},
		success : function(obj) {
			// alert("更新成功");
			$("span[class*='navPopover']").popover("hide");
			getNavList("navList" + tab, tab);
		}
	});
};

// 删除导航
var delNav = function(id) {
	$.getJSON('json/delNavMainActionJson.action', {
		"personalNav.id" : id
	}, function(obj) {
		if (obj.zwJson.success) {
			alert(obj.zwJson.msg);
			getNavList("navList" + tab, tab);
		} else {
			alert(obj.zwJson.msg);
		}
	});
};

// 单击导航按钮事件
var btn_click = function(id) {
	$("#showlink").empty();
	var html = "";
	$
			.ajax({
				type : "POST",
				url : 'json/loadLinkByNavIdMainActionJson.action',
				data : {
					"personalNav.id" : id
				},
				success : function(obj) {
					var count = obj.linkList.length;
					html += "<ul class='linkul' id='linkulid'>";
					for (var i = 0; i < count; i++) {
						html += "<li><a target='_blank' style='font-size:14px;' href='"
								+ obj.linkList[i].url
								+ "'><img width='16px' height='16px' style='margin-right:5px;' src='"
								+ obj.linkList[i].icon
								+ "' />"
								+ obj.linkList[i].name
								+ "<input class='hidd2' type='hidden' value='"
								+ obj.linkList[i].id
								+ "'></a><div class='pull-right' style='margin-top:2px'><a href='#' class='show-nav-list' style='margin:0 5px 0 10px;'>"
								+ "<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"bottom\" class='octicon octicon-pencil a-help mylinkpp link"
								+ obj.linkList[i].id
								+ "'></span></a><a class='show-nav-list' href='#'>"
								+ "<span title='删除' class='octicon octicon-x a-help' onclick='delLink(\""
								+ obj.linkList[i].id
								+ "\",\""
								+ id
								+ "\",1)'></span></a></div></li>";
					}
					html += "</ul>";
					$("#showlink").html(html);

					for (var i = 0; i < count; i++) {
						$(".link" + obj.linkList[i].id)
								.popover(
										{
											title : '编辑链接<button type="button" class="close" aria-label="Close" onclick="closepopover3(\'link'
													+ obj.linkList[i].id
													+ '\')"><span aria-hidden="true" style="line-height:.8">&times;</span></button>',
											content : '<div style="margin:5px 10px;"><input class="form-control link2'
													+ obj.linkList[i].id
													+ '" type="text" class="form-control" value="'
													+ obj.linkList[i].name
													+ '"></div><div style="margin:5px 10px;"><input class="form-control link3'
													+ obj.linkList[i].id
													+ '" type="text" class="form-control" value="'
													+ obj.linkList[i].url
													+ '"></div><div style="margin:5px 10px;">'
													+ '<select id="navtypess" class="form-control link4'
													+ obj.linkList[i].id
													+ '"></select></div><div style="margin:5px 10px;"><button class="btn btn-primary form-control" type="button" onclick="editLink(\''
													+ obj.linkList[i].id
													+ '\',\''
													+ id
													+ '\',1);">修改</button></div>',
											html : true
										});
					}
					// 监听link弹出框事件(记住不管是什么框架，必需是等html渲染完成才能进行操作，否则失败)
					$('.mylinkpp').on('shown.bs.popover', function() {
						navdomtoselect();
					});
					toggleEditClass();
				}
			});
};

// 为link弹出框添加select
var navdomtoselect = function() {
	$.ajaxSettings.async = false;
	$.getJSON('json/loadNavListMainActionJson.action', {
		"personalNav.type" : 0
	}, function(obj) {
		for (var i = 0; i < obj.navList.length; i++) {
			$("#navtypess").append(
					"<option value='" + obj.navList[i].id + "'>"
							+ obj.navList[i].name + "</option>");
		}
	});
};

// 编辑链接(这个函数有如何获取favicon图标和根据url获取域名以及设置ajax传值不乱码)
var editLink = function(id, navid, type) {
	var name = $(".link2" + id).val();
	var url = $(".link3" + id).val();
	var navtypess = $("#navtypess").val();
	if (url.search("http") != 0) {
		url = "http://" + url;
	}
	var icon = "";
	// 根据url获取域名
	var domain = url.match(/(http|https):\/\/([^\/]+)\//i);
	if (domain == null) {
		icon = url + "/favicon.ico";
	} else {
		icon = domain[0] + "favicon.ico";
	}
	$.ajax({
		type : 'POST',
		contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		url : "json/updateLinkLinkAction.action",
		data : {
			"link.id" : id,
			"link.name" : name,
			"link.icon" : icon,
			"link.url" : url,
			"personalNav.id" : navtypess
		},
		success : function(obj) {
			// alert("更新成功");
			$("span[class*='link']").popover("hide");
			if (type == 1) {
				btn_click(navid);
			} else {
				queryLink();
			}

		}
	});
};

// 删除链接
var delLink = function(id, navid, type) {
	$.getJSON('json/delLinkLinkAction.action', {
		"link.id" : id
	}, function(obj) {
		// alert("删除成功");
		if (type == 1) {
			btn_click(navid);
		} else {
			queryLink();
		}
	});
};

// 保存导航
var addNav = function() {
	var name = $("#navname").val();
	var navtype = $("#navtype").val();
	$.ajax({
		type : 'POST',
		url : 'json/saveNavMainActionJson.action',
		data : {
			"personalNav.name" : name,
			"personalNav.type" : navtype
		},
		contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		success : function(data) {
			// 这个判断是为了解决tab页刷新不了当前页的解决方法
			if (tab == navtype) {
				getNavList("navList" + navtype, navtype);
			} else {
				$('#myTab li:eq(' + (parseInt(navtype) - 1) + ') a')
						.tab('show');
			}
			$("#navname").val("");
		}
	});
};

// 绑定模态框select下拉列表选项
var addLinkTypeDOM = function() {
	$("#linktype").empty();
	$.getJSON('json/loadNavListMainActionJson.action', {
		"personalNav.type" : 0
	}, function(obj) {
		// obj.navList[i].id,name
		for (var i = 0; i < obj.navList.length; i++) {
			$("#linktype").append(
					"<option value='" + obj.navList[i].id + "'>"
							+ obj.navList[i].name + "</option>");
		}
	});
};

// 添加链接
var addLink = function() {
	var linkname = $("#linkname").val();
	var linkurl = $("#linkurl").val();
	var linktype = $("#linktype").val();

	if (linkurl.search("http") != 0) {
		linkurl = "http://" + linkurl;
	}
	var icon = "";
	// 根据url获取域名
	var domain = linkurl.match(/(http|https):\/\/([^\/]+)\//i);
	if (domain == null) {
		icon = linkurl + "/favicon.ico";
	} else {
		icon = domain[0] + "favicon.ico";
	}
	$.ajax({
		type : 'POST',
		url : 'json/saveLinkLinkAction.action',
		data : {
			"link.name" : linkname,
			"link.url" : linkurl,
			"link.icon" : icon,
			"personalNav.id" : linktype
		},
		contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		success : function(data) {
			// alert("添加成功");
		}
	});
};

var showNavMode = function() {
	$('#navModal').modal('show');
	closepopover();
};

var showLinkMode = function() {
	$('#linkModal').modal('show')
	addLinkTypeDOM();
	closepopover();
};

// 关闭弹出框
var closepopover = function() {
	$(".popover-options a").popover("hide");
};

// 关闭弹出框
var closepopover2 = function(name) {
	$("." + name).popover("hide");
};

// 关闭弹出框
var closepopover3 = function(name) {
	$("." + name).popover("hide");
};

// 点击编辑按钮
var clickedit = function() {
	if ($("#toggleedit").hasClass("octicon-gear")) {
		$("#toggleedit").removeClass("octicon-gear").addClass(
				"octicon-mail-reply");
		dragNavAndLink();
	} else {
		$("#toggleedit").removeClass("octicon-mail-reply").addClass(
				"octicon-gear");
		destoryDragNav();

	}
	$(".show-nav-list").toggle();
};

// 代码切换点击编辑按钮
var toggleEditClass = function() {
	if ($("#toggleedit").hasClass("octicon-gear")) {
		$(".show-nav-list").hide();

	} else {
		$(".show-nav-list").show();
	}
};

// 设置拖动nav和link
var dragNavAndLink = function() {
	$("ul[id*='navList']").dragsort({
		dragSelector : "li",
		dragEnd : function() {
			var data = $("input[class='hidd']").map(function() {
				return $(this).val();
			}).get();
			for (var i = 0; i < data.length; i++) {
				$.getJSON('json/updateNavMainActionJson.action', {
					"personalNav.level" : (i + 1),
					"personalNav.id" : data[i]
				}, function(obj) {

				});
			}
		},
		dragBetween : false
	});

	$("ul[id*='linkulid']").dragsort({
		dragSelector : "li",
		dragEnd : function() {
			var data = $("input[class='hidd2']").map(function() {
				return $(this).val();
			}).get();
			for (var i = 0; i < data.length; i++) {
				$.getJSON('json/updateLinkLinkAction.action', {
					"link.level" : (i + 1),
					"link.id" : data[i]
				}, function(obj) {

				});
			}
		},
		dragBetween : false
	});
};

// 销毁拖动nav和link
var destoryDragNav = function() {
	$("ul[id*='navList']").dragsort("destroy");
	$("ul[id='linkulid']").dragsort("destroy");
};

// 查询链接
var queryLink = function() {
	$("#showlink").empty();
	$
			.getJSON(
					"json/QueryLinkByNameLinkAction.action",
					{
						"link.name" : $("#linktxt").val()
					},
					function(obj) {
						var count = obj.linkList.length;
						var html = "<ul class='linkul' id='linkulid'>";
						for (var i = 0; i < count; i++) {
							html += "<li><a target='_blank' style='font-size:14px;' href='"
									+ obj.linkList[i].url
									+ "'><img width='16px' height='16px' style='margin-right:5px;' src='"
									+ obj.linkList[i].icon
									+ "' />"
									+ obj.linkList[i].name
									+ "<input class='hidd2' type='hidden' value='"
									+ obj.linkList[i].id
									+ "'></a><div class='pull-right' style='margin-top:2px'><a href='#' class='show-nav-list' style='margin:0 5px 0 10px;'>"
									+ "<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"bottom\" class='octicon octicon-pencil a-help mylinkpp link"
									+ obj.linkList[i].id
									+ "'></span></a><a class='show-nav-list' href='#'>"
									+ "<span title='删除' class='octicon octicon-x a-help' onclick='delLink(\""
									+ obj.linkList[i].id
									+ "\",\""
									+ obj.linkList[i].personalNav.id
									+ "\",2)'></span></a></div></li>";
						}
						html += "</ul>";
						$("#showlink").html(html);

						for (var i = 0; i < count; i++) {
							$(".link" + obj.linkList[i].id)
									.popover(
											{
												title : '编辑链接<button type="button" class="close" aria-label="Close" onclick="closepopover3(\'link'
														+ obj.linkList[i].id
														+ '\')"><span aria-hidden="true" style="line-height:.8">&times;</span></button>',
												content : '<div style="margin:5px 10px;"><input class="form-control link2'
														+ obj.linkList[i].id
														+ '" type="text" class="form-control" value="'
														+ obj.linkList[i].name
														+ '"></div><div style="margin:5px 10px;"><input class="form-control link3'
														+ obj.linkList[i].id
														+ '" type="text" class="form-control" value="'
														+ obj.linkList[i].url
														+ '"></div><div style="margin:5px 10px;">'
														+ '<select id="navtypess" class="form-control link4'
														+ obj.linkList[i].id
														+ '"></select></div><div style="margin:5px 10px;"><button class="btn btn-primary form-control" type="button" onclick="editLink(\''
														+ obj.linkList[i].id
														+ '\',\''
														+ obj.linkList[i].personalNav.id
														+ '\',2);">修改</button></div>',
												html : true
											});
						}
						// 监听link弹出框事件(记住不管是什么框架，必需是等html渲染完成才能进行操作，否则失败)
						$('.mylinkpp').on('shown.bs.popover', function() {
							navdomtoselect();
						});
						toggleEditClass();
					})
};
