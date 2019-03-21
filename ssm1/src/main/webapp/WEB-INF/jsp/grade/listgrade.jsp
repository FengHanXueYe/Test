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
	<h3>全部班级</h3>
		<form action="toAddGrade.controller" method="post">
			<table border="1" width="96%">
				<tr align="center">
					<th>班级id</th>
					<th>班级名称</th>
					<th>操作</th>
				</tr>
				<c:forEach var="item" items="${listgrade }">
					<tr align="center">
						<td>${item.gradeid }</td>
						<td>${item.gradename }</td>
						<td>
							<a href="">查看</a>
							<a href="toUpdateGrade.controller?gradeid=${item.gradeid }">修改</a>
							<a href="doDeleteGrade.controller?gradeid=${item.gradeid }" onclick="return confirm('确定删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td align="center" colspan="3"><input type="submit" value="增加班级" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>