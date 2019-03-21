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
	<c:if test="${login.userroles eq '04' }">
		<a href="doListUser.controller" target="right">用户信息</a><br>
		<a href="doListGrade.controller" target="right">班级信息</a><br>
		<a href="doListCourse.controller" target="right">成绩信息</a><br>
		<a href="doListStudent.controller" target="right">学员信息</a><br>
		<a href="" target="right">退出系统</a>
	</c:if>
</body>
</html>