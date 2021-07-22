<%--
  Created by IntelliJ IDEA.
  User: Leslie
  Date: 2021/7/17
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>index</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<jsp:include page="main_top.jsp"></jsp:include>
<jsp:include page="main_left.jsp"></jsp:include>
<!--=============================================================================================================================================================================-->
<!--main-container-part-->
<div id="content" style="margin-right: 100px;margin-top: 40px;">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb">
            <a title="主页" class="tip-bottom" href="<%=basePath%>admin/indexs"><i class="icon-home"></i>主页</a>
        </div>
    </div>
    <!--End-breadcrumbs-->

    <!-- 主要内容 -->
    <div class="container-fluid">
        <div class="quick-actions_homepage">
            <ul class="quick-actions">
                <li class="bg_lb">
                    <a href="<%=basePath%>admin/userList?pageNum=1">
                    <i class="icon-group"></i>用户管理</a>
                </li>
                <li class="bg_lg span3">
                    <a href="<%=basePath%>admin/goodsList?pageNum=1">
                    <i class="icon-signal"></i>商品管理</a>
                </li>
                <li class="bg_lo">
                    <a href="<%=basePath%>admin/ordersList?pageNum=1">
                        <i class="icon-th"></i>订单管理</a>
                </li>
                <li class="bg_ly">
                    <a href="<%=basePath%>admin/purseList?pageNum=1">
                        <i class="icon-inbox"></i>钱包管理</a>
                </li>
                <li class="bg_ls">
                    <a href="<%=basePath%>admin/info?pageNum=1">
                        <i class="icon-fullscreen"></i>系统设置</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<!--==================================================================================================================-->
<jsp:include page="main_bottom.jsp"></jsp:include>


</body>
</html>
