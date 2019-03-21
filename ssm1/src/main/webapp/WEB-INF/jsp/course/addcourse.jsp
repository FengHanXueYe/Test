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
<h3>增加课程</h3>

	<form action="doAddCourse.controller" method="post">
		<table border="1" width="96%" >
			<tr>
				<td width="25%">课程名称</td>
				<td width="35%"><input type="text" name="coursename" /></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="增加课程" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="window.history.go(-1)"/></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>