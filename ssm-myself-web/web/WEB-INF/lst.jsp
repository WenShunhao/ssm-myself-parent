<%--
  Created by IntelliJ IDEA.
  User: NFS
  Date: 2019-11-13
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" scope="page"/>
<script src="/static/js/jquery-3.4.1.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<table border="1" style="width: 800px;text-align: center" cellpadding="0" cellspacing="0">--%>

<%--    <tr>--%>
<%--        <th>编号</th>--%>
<%--        <th>用户名</th>--%>
<%--        <th>密码</th>--%>
<%--        <th>年龄</th>--%>
<%--        <th>出生日期</th>--%>
<%--        <th>邮箱</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="user" items="${list.list}">--%>
<%--        <tr>--%>
<%--            <td>${user.id}</td>--%>
<%--            <td>${user.username}</td>--%>
<%--            <td>${user.password}</td>--%>
<%--            <td>${user.age}</td>--%>
<%--            <td>${user.birthday}</td>--%>
<%--            <td>${user.email}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>



<%--</table>--%>

<table id="tabUsers">

</table>
<div id="lstInfo">
    xx</div>

<a href="${root}/?pageNum=1&pageSize=3">首页</a>
<a href="${root}/?pageNum=${pageInfo.prePage}&pageSize=3">上一页</a>
<a href="${root}/?pageNum=${pageInfo.nextPage}&pageSize=3">下一页</a>
<a href="${root}/?pageNum=${pageInfo.pages}&pageSize=3">尾页</a>

<ul style="list-style: none;float: left">
    <table border="1" cellspacing="0" cellpadding="0">
        <tr>
            <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                <td style="border: 1px solid black;width: 20px;height: 20px">
                    <li style="text-align: center;text-decoration-line: none"><a href="${root}/?pageNum=${num}&pageSize=3">${num}</a> </li>
                </td>
            </c:forEach>
        </tr>
    </table>
</ul>
<a href="${root}/insert3">添加信息</a>&nbsp;
<script>
    $(function () {
        laodInfo(1,3);
        alert($("lstInfo").html(""))
    })

    function laodInfo(pageNum,pageSize) {
        $.ajax({
           url:"/lst2?pageNum"+pageNum+"pageSize"+pageSize,
           method:"get",
           dataType:"json"
        }).done(function(pageInfo){
            pageInfo.list.foreach(function (user) {
                $("lstInfo").innerText(tb1 += "<tr><td>+" + user.id + "+</td>"
                    + "<tr><td>+" + user.username + "+</td>"
                    + "<tr><td>+" + user.password + "+</td>"
                    + "<tr><td>+" + user.age + "+</td>"
                    + "<tr><td>+" + user.birthday + "+</td>"
                    + "<tr><td>+" + user.email + "+</td></tr>"
            })
            alert($("lstInfo").html(""))
        });
}
</script>
<%--<script type="text/javascript">--%>
<%--    $.ajax({--%>
<%--        type: "POST",  //请求类型--%>
<%--        url: "/lst2?pageNum"+pageNum+"pageSize"+pageSize,  //路径--%>
<%--        data:{list:pageInfo.list},--%>
<%--        beforeSend:function(){  //请求前的事件--%>
<%--            $("#lstInfo").html("努力加载中...");--%>
<%--        },--%>
<%--        success: function(data){  //请求成功后的事件--%>
<%--            $.each(data, function(i, obj) {--%>
<%--                var tr = $("<tr/>");--%>
<%--                $("<td/>").html(obj.id).appendTo(tr);--%>
<%--                $("<td/>").html(obj.username).appendTo(tr);--%>
<%--                $("<td/>").html(obj.password).appendTo(tr);--%>
<%--                $("<td/>").html(obj.age).appendTo(tr);--%>
<%--                $("<td/>").html(obj.birthday).appendTo(tr);--%>
<%--                $("<td/>").html(obj.email).appendTo(tr);--%>
<%--                $("#tabUsers").append(tr);--%>
<%--            });--%>
<%--            alert($("tabUsers").innerHTML);--%>

<%--        },--%>
<%--        complete:function(){  //请求完成时的事件，不论成功或失败--%>
<%--            $("#lstInfo").html("");--%>
<%--        },--%>
<%--    });--%>
<%--</script>--%>

</body>
</html>
