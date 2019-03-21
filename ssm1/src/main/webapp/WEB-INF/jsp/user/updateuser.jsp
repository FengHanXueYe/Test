<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>修改用户</h3>
	<form action="doUpdateUser.controller" method="post">
		<table border="1" width="96%" >
			<tr>
				<td width="25%">用户名</td>
				<td width="35%"><input type="text" name="username" value="${user.username }" />
								<input type="hidden" name="userid" value="${user.userid }" />
				</td>
				<td></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" id="" /></td>
				<td></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="password" name="qpassword" id="" /></td>
				<td></td>
			</tr>
			<tr>
				<td>角色</td>
				<td>
					<select name="userroles" >
						<option <c:if test="${user.userroles eq '01'}">selected</c:if> value="01">学生</option>
						<option <c:if test="${user.userroles eq '02'}">selected</c:if> value="02">老师</option>
						<option <c:if test="${user.userroles eq '03'}">selected</c:if> value="03">校长</option>
						<option <c:if test="${user.userroles eq '04'}">selected</c:if> value="04">管理员</option>
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" name="nickname" value="${user.nickname }"/></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="修改学生" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="window.history.go(-1)"/></td>
			</tr>
		</table>
	</form>
	
	</center>
</body>
</html>