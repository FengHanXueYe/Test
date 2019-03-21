<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>学生信息</h1>
		<form action="toAddStudent.controller" method="post">
			<table border="1" width="96%" align="center" style="margin-bottom: 15px">
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="stuname"  /></td>
					<td>学号：</td>
					<td><input type="text" name="stunum" /></td>
				</tr>
				<tr >
					<td colspan="4" align="center"><input type="button" value="查询" /></td>
				</tr>
			</table>
		
			<table border="1" width="96%" align="center">
				<tr>
					<th>班级名称</th>
					<th>学生编号</th>
					<th>学生姓名</th>
					<th>学生性别</th>
					<th>学生学号</th>
					<th>学生年龄</th>
					<th>操作</th>
				</tr>
				<c:choose>
					<c:when test="${empty liststudent.list }">
						<tr style="color:red" align="center"><td colspan="7">没有数据！</td></tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="item" items="${liststudent.list }">
						<tr>
							<td>${item.grade.gradename }</td>
							<td>${item.stuid }</td>
							<td>${item.stuname }</td>
							<td>
								<c:if test="${item.gender eq '01'}">女</c:if>
								<c:if test="${item.gender eq '02'}">男</c:if>
								<c:if test="${item.gender eq '03'}">未知</c:if>
							</td>
							<td>${item.stunum }</td>
							<td>
								<fmt:formatNumber value="${item.age }" pattern="##岁"></fmt:formatNumber>
							</td>
							<td>
								<a href="doDetailStudent.controller?stuid=${item.stuid }">查看</a>
								<a href="toUpdateStudent.controller?stuid=${item.stuid }">修改</a>
								<a href="doDeleteStudent.controller?stuid=${item.stuid }">删除</a>
							</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				<tr>
					<td colspan="7" align="center"><input type="submit" value="新增学生信息" /></td>
				</tr>
			</table>
		</form>
	</center>
	
<script type="text/javascript" src="${pageContext.request.contextPath }/webjars/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript">
	$(function(){
			$("input[type='button']").click(function(){
				$("form").attr("action","doListStudent.controller").submit();
				
			})
		
	})
</script>
</body>
</html>