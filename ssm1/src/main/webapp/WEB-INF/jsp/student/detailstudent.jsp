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
		<table border="1" width="96%">
			<tr>
				<td width="30%">姓名：</td>
				<td>${student.stuname }</td>
			</tr>
			<tr>
				<td>编号：</td>
				<td>${student.stuid }</td>
			</tr>
			<tr>
				<td>班级：</td>
				<td>${student.grade.gradename }</td>
			</tr>
			<tr>
				<td>学号：</td>
				<td>${student.stunum }</td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<c:if test="${student.gender eq '01'}">女</c:if>
					<c:if test="${student.gender eq '02'}">男</c:if>
					<c:if test="${student.gender eq '03'}">未知</c:if>
				</td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td>${student.age }</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="返回" onclick="javascript:history.go(-1)" /></td>
			</tr>
		</table>
	</center>
	<script type="text/javascript" src="${pageContext.request.contextPath }/webjars/jquery/3.2.1/jquery.js"></script>
</body>
</html>