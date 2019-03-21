<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Title</title>
</head>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/user/index">去首页</a><br/>
<a href="${pageContext.request.contextPath}/user/findempbyid?eid=2">根据ID查询对象</a><br/>
<a href="${pageContext.request.contextPath}/user/updempbyid?eid=2">根据ID修改对象</a><br/>
<a href="${pageContext.request.contextPath}/user/addemps">添加员工对象</a><br/>
<a href="${pageContext.request.contextPath}/user/delemp?eid=2">删除员工对象</a><br/>
<a href="${pageContext.request.contextPath}/user/test">去测试</a><br/>
</body>
</html>
