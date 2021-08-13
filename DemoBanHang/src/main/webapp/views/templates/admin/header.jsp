<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/layout/admin/css/reset.css"/> " media="screen" />
    <link rel="stylesheet" type="text/css" href="<c:url value="/layout/admin/css/text.css "/>" media="screen" />
    <link rel="stylesheet" type="text/css" href=" <c:url value="/layout/admin/css/grid.css "/>" media="screen" />
    <link rel="stylesheet" type="text/css" href=" <c:url value="/layout/admin/css/layout.css "/>" media="screen" />
    <link rel="stylesheet" type="text/css" href=" <c:url value="/layout/admin/css/nav.css "/>" media="screen" />
    <link href=" <c:url value="/layout/admin/css/table/demo_page.css "/>" rel="stylesheet" type="text/css" />
    <!-- BEGIN: load jquery -->
    <script src=" <c:url value="/layout/admin/js/jquery-1.6.4.min.js "/>" type="text/javascript"></script>
    <script type="text/javascript" src=" <c:url value="/layout/admin/js/jquery-ui/jquery.ui.core.min.js "/>"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.ui.widget.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.ui.accordion.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.effects.core.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.effects.slide.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.ui.mouse.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/jquery-ui/jquery.ui.sortable.min.js "/>" type="text/javascript"></script>
    <script src=" <c:url value="/layout/admin/js/table/jquery.dataTables.min.js "/>" type="text/javascript"></script>
    <!-- END: load jquery -->
    <script type="text/javascript" src=" <c:url value="/layout/admin/js/table/jquery.dataTables.min.js "/>"></script>
    <script src=" <c:url value="/layout/admin/js/setup.js "/>" type="text/javascript"></script>
	 <script type="text/javascript">
        $(document).ready(function () {
            setupLeftMenu();
		    setSidebarHeight();
        });
    </script>

</head>
<body>
    <div class="container_12">
        <div class="grid_12 header-repeat">
            <div id="branding">
                <div class="floatleft logo">
                    <img src=" <c:url value="/layout/admin/img/livelogo.png "/>" alt="Logo" />
				</div>
				<div class="floatleft middle">
					<h1>Trang quản lý</h1>
					
				</div>
                <div class="floatright">
                    <div class="floatleft">
                        <img src=" <c:url value="/layout/admin/img/img-profile.jpg "/>" alt="Profile Pic" /></div>
                    <div class="floatleft marginleft10">
                        <ul class="inline-ul floatleft">
                            <li>${ Admin.name}</li>
                            <li><a href="#">Đăng xuất</a></li>
                        </ul>
                    </div>
                </div>
                <div class="clear">
                </div>
            </div>
        </div>
        <div class="clear">
        </div>
        <div class="grid_12">
            <ul class="nav main">
                <li class="ic-dashboard"><a href="<c:url value="/quan-tri/home "/>"><span>Trang chủ</span></a> </li>
                <li class="ic-form-style"><a href=""><span>Tài khoản </span></a></li>
				<li class="ic-typography"><a href=""><span>Đổi mật khẩu</span></a></li>
				<li class="ic-grid-tables"><a href="<c:url value="/quan-tri/list-order "/>"><span>Đơn Hàng</span></a></li>
                <li class="ic-charts"><a href=""><span>Trang user</span></a></li>
            </ul>
        </div>
        <div class="clear">
        </div>