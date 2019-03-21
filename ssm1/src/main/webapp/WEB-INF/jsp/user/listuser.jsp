<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>全部用户</h3>
<form action="toAddUser.controller" method="post">
	<table width="96%" border="1">
		<tr>
			<th width="15%">用户名：</th>
			<td><input type="text" name="username" value="${user.username }" /></td>
			<th>用户角色：</th>
			<td>	
					<select name="userroles" >
						<option value="00">--请选择--</option>
						<option <c:if test="${user.userroles eq '01' }">selected</c:if> value="01">学生</option>
						<option <c:if test="${user.userroles eq '02' }">selected</c:if> value="02">老师</option>
						<option <c:if test="${user.userroles eq '03' }">selected</c:if> value="03">校长</option>
						<option <c:if test="${user.userroles eq '04' }">selected</c:if> value="04">管理员</option>
					</select>
			</td>
		</tr>
		<tr >
			<td colspan="4" align="center"><input type="button" value="查询"  /></td>
		</tr>
	</table>
	
	<table border="1" width="96%" align="center">
		<tr>
			<th>用户id</th>
			<th>用户名</th>
			<th>用户角色</th>
			<th>用户昵称</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${users }" var="item">
			<tr align="center">
				<td>${item.userid }</td>
				<td>${item.username }</td>
				<td>
					<c:if test="${item.userroles eq '01'}">学生</c:if>
					<c:if test="${item.userroles eq '02'}">老师</c:if>
					<c:if test="${item.userroles eq '03'}">校长</c:if>
					<c:if test="${item.userroles eq '04'}">管理员</c:if>
				</td>
				<td>${item.nickname }</td>
				<td>
					<a href="doDetailUser.controller?userid=${item.userid }">查看</a>
					<a href="toUpdateUser.controller?userid=${item.userid }">修改</a>
					<a href="doDeleteUser.controller?userid=${item.userid }" onclick="return confirm('确定删除吗？')">删除</a>
				</td>
			</tr>
		</c:forEach>
		<tr><td colspan="5" align="center"><input type="submit" value="新增用户" /></td></tr>
	</table>
</form>
</center>

<script type="text/javascript" src="${pageContext.request.contextPath }/webjars/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[type='button']").click(function(){
			$("form").attr("action","doListUser.controller").submit();
		})
		
		
	})
</script>
</body>
</html>