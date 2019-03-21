<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>增加用户</h3>

	<form action="doAddUser.controller" method="post">
		<table border="1" width="96%" >
			<tr>
				<td width="25%">用户名</td>
				<td width="35%"><input type="text" name="username" /></td>
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
						<option value="00">--请选择--</option>
						<option value="01">学生</option>
						<option value="02">老师</option>
						<option value="03">校长</option>
						<option value="04">管理员</option>
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" name="nickname" /></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="增加该学生" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="window.history.go(-1)"/></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>