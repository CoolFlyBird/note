<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>动漫</title>
</head>
<style>
    body {
        margin: 0px;
        background: #f2f2f2;
    }

    header {
        width: inherit;
        height: 350px;
        background: #34495e;
    }

    #web_title {
        display: inline-block;
        -webkit-text-fill-color: #fff;
        -webkit-user-select: none;
        font-size: 48pt;
        font-family: 华文行楷;
        margin: 180px auto auto 100px;
    }

    .web_subtitle {
        display: inline-block;
        -webkit-user-select: none;
        -webkit-text-fill-color: #fff;
        margin: 20px auto auto 110px;
        font-family: "Times New Roman";
    }

    .nav {
        display: inline-block;
    }

    .nav:hover {
        -webkit-text-fill-color: #000;
        background: #fff;
        cursor: pointer;
    }

    .nav_group {
        display: block;
        -webkit-user-select: none;
        margin-top: 50px;
        margin-right: 8%;
        float: right;
    }

    .nav_group a {
        display: block;
        text-decoration: none;
        padding-left: 15px;
        padding-right: 15px;
        padding-top: 5px;
        padding-bottom: 5px;
        font-size: 16pt;
    }

    .nav_group a:link {
        -webkit-text-fill-color: #fff;
        text-decoration: none
    }

    .nav_group a:visited {
        -webkit-text-fill-color: #fff;
        text-decoration: none
    }

    .nav_group a:hover {
        -webkit-text-fill-color: #000;
        text-decoration: none
    }
</style>
<body>
<header>
    <div class="nav_group">
        <nav class="nav"><a href="http://www.unual.com">主页</a></nav>
    </div>
    <div id="web_title">动漫</div>
    <br/>
    <div class="web_subtitle">Don't aim for success if you really want it.
        <br/> Just stick to what you love and believe in，and it will come naturally.
    </div>
</header>
</body>
</html>