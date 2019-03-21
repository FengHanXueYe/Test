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
	<h3>全部课程</h3>
		<form action="toAddCourse.controller" method="post">
			<table border="1" width="96%">
				<tr align="center">
					<th>课程id</th>
					<th>课程名称</th>
					<th>操作</th>
				</tr>
				<c:forEach var="item" items="${courselist }">
					<tr align="center">
						<td>${item.courseid }</td>
						<td>${item.coursename }</td>
						<td>
							<a href="">查看</a>
							<a href="toUpdateCourse.controller?courseid=${item.courseid }">修改</a>
							<a href="doDeleteCourse.controller?courseid=${item.courseid }" onclick="return confirm('确定删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td align="center" colspan="3"><input type="submit" value="增加课程" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>