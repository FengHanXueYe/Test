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
		<form action="doUpdateStudent.controller" method="post">
			<table border="1" width="96%" align="center">
				<tr>
				<td>姓名：</td>
				<td><input type="text" name="stuname" value="${student.stuname }"/></td>
				<td><input type="hidden" name="stuid" value="${student.stuid }" /></td>
			</tr>
			<tr>
				<td>班级：</td>
				<td>
					<select name="grade.gradeid" >
						<c:forEach var="item" items="${grade}">
							<option value="${item.gradeid }">${item.gradename }</option>
						</c:forEach>
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>学号：</td>
				<td><input type="text" name="stunum" value="${student.stunum }"/></td>
				<td></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<select name="gender" >
						<option <c:if test="${student.gender eq '01'}">selected</c:if> value="01">女</option>
						<option <c:if test="${student.gender eq '02'}">selected</c:if> value="02">男</option>
						<option <c:if test="${student.gender eq '03'}">selected</c:if> value="03">未知</option> 
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age" value="${student.age }"/></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="提交" /></td>
			</tr>
			</table>
		</form>
	</center>
<script type="text/javascript" src="${pageContext.request.contextPath }/webjars/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("select[name='grade.gradeid']").val("${student.grade.gradeid}");
		//$("select[name='gender']").val("${student.gender}");
		
	})
</script>
</body>
</html>