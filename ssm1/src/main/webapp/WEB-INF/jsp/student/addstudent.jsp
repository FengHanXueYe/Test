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
		<form action="doAddStudent.controller" method="post">
			<table border="1" width="96%" align="center">
				<tr>
				<td>姓名：</td>
				<td><input type="text" name="stuname" /></td>
				<td></td>
			</tr>
			<tr>
				<td>班级：</td>
				<td>
					<select name="grade.gradeid" >
						<option value="">请选择</option>
						<c:forEach var="item" items="${grade}">
							<option value="${item.gradeid }">${item.gradename }</option>
						</c:forEach>
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>学号：</td>
				<td><input type="text" name="stunum" /></td>
				<td></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<select name="gender">
						<option value="">请选择</option>
						<option value="01">女</option>
						<option value="02">男</option>
						<option value="03">未知</option>
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age" /></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="提交" /></td>
			</tr>
			</table>
		</form>
	</center>
</body>
</html>