<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/25
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<shiro:hasRole name="admin">
  仅admin角色可见
</shiro:hasRole>
<br/>
<shiro:hasRole name="user">
  仅user角色可见
</shiro:hasRole>
<br/>
<shiro:hasAnyRoles name="admin,user">
  admin,user任意一个角色都可见
</shiro:hasAnyRoles>
<br/>
<shiro:guest>
  游客可见
</shiro:guest>
</body>
</html>
