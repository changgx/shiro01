<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/25
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<shiro:hasPermission name="sys:admin:add">
  sys:admin:add
</shiro:hasPermission>
<br/>
<shiro:hasPermission name="sys:admin:read">
  sys:admin:read
</shiro:hasPermission>

<%--注释--%>

</body>
</html>
