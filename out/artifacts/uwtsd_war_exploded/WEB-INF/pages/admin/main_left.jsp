<%--
  Created by IntelliJ IDEA.
  User: Leslie
  Date: 2021/7/18
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>main_left</title>
    <link rel="stylesheet" href="<%=basePath%>font-awesome/css/font-awesome.css" />
</head>
<body>
<div id="sidebar">
    <ul>
        <li class="submenu"><a href="#"><i class="icon icon-group"></i>
            <span>用户管理</span> </a>
            <ul>
                <li><a href="<%=basePath%>admin/userList?pageNum=1">用户列表</a></li>
                <%-- <li><a href="<%=basePath%>admin/user/user_add.jsp">添加用户</a></li> --%>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-signal"></i>
            <span>商品管理</span> </a>
            <ul>
                <li><a href="<%=basePath%>admin/goodsList?pageNum=1">商品列表</a></li>
                <%-- <li><a href="<c:url value="/back/agent/addForm"/>">添加商品</a></li> --%>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-th"></i>
            <span>订单管理</span> </a>
            <ul>
                <li><a href="<%=basePath%>admin/ordersList?pageNum=1">订单列表</a></li>
                <%-- <li><a href="<c:url value="/back/house/addForm"/>">添加订单</a></li> --%>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-inbox"></i>
            <span>钱包管理</span> </a>
            <ul>
                <li><a href="<%=basePath%>admin/purseList?pageNum=1">钱包列表</a></li>
                <%-- <li><a href="<%=basePath%>admin/purseList?pageNum=1">审核管理</a></li> --%>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-fullscreen"></i>
            <span>系统设置</span> </a>
            <ul>
                <li><a href="<%=basePath%>admin/info">">个人信息</a></li>
                <li><a href="<%=basePath%>admin/modify">">修改密码</a></li>
            </ul>
        </li>
    </ul>
</div>
</body>

</body>
</html>
