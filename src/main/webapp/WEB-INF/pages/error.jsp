<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2021/07/24/0024
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>哎呀，出错咯！</title>

    <style type="text/css">
        body{ margin:0; padding:0; background:rgb(79, 190, 246); font-family:Georgia, Times, Verdana, Geneva, Arial, Helvetica, sans-serif; }
        div#mother{ margin:0 auto; width:943px; height:572px; position:relative; }
        div#errorText{ color:#39351e; padding:146px 0 0 446px }
        div#errorText p{ width:303px; font-size:14px; line-height:26px; }
        div.link{ /*background:#f90;*/ height:50px; width:145px; float:left; }
        div#home{ margin:20px 0 0 444px;}
        div#contact{ margin:20px 0 0 25px;}
        h1{ font-size:40px; margin-bottom:35px; }
    </style>
</head>

<body>
<div id="mother">
    <div id="errorBox">
        <div id="errorText">
            <h1>! ERROR DECETED !</h1>
            <p>请不要担心，这没事。如果该资源对你很重要，请与管理员联系。</p>
            <a href="/" title="返回首页">
                返回首页
            </a>
        </div>
    </div>
</div>
</body>
</html>