<%--
  Created by IntelliJ IDEA.
  User: NFS
  Date: 2019-11-11
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/insert" method="post">
    <table>
        <tr><td>编号：</td><td><input type="text" name="id"></td></tr>
        <tr><td>用户名：</td><td><input type="text" name="username"><span style="color: red;font-family: 宋体">&nbsp;&nbsp;${usernameError}</span></td></tr>
        <tr><td>密码：</td><td><input type="text" name="password"><span style="color: red;font-family: 宋体">&nbsp;&nbsp;${passwordError}</span></td></tr>
        <tr><td>年龄：</td><td><input type="text" name="age"><span style="color: red;font-family: 宋体">&nbsp;&nbsp;${ageError}</span></td></tr>
        <tr><td>生日：</td><td><input type="date" name="birthday"><span style="color: red;font-family: 宋体">&nbsp;&nbsp;&nbsp;&nbsp;${birthdayError}</span></td></tr>
        <tr><td> 邮箱：</td><td><input type="email" name="email"><span style="color: red;font-family: 宋体">&nbsp;&nbsp;${emailError}</span></td></tr>
    </table>
    <input type="submit" value="提交">
</form>

<FORM METHOD=GET ACTION="http://www.ip138.com:8080/search.asp" name="mobileform" target="_blank">
    <tr><td align="center">手机号码所在地查询：<input type="text" name="mobile" size="16">
        <input type="submit" value="查询"><INPUT TYPE="hidden" name="action" value="mobile">
    </td></tr></FORM>


</body>
</html>
