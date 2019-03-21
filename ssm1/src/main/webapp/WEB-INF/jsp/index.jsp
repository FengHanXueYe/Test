<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/webjars/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("form").submit(function(){
			var name = $("input[name='username']").val();
			var pwd = $("input[name='password']").val();
			if(name==""){
				$("input[name='username']").parent().next().html("用户空");
				return false;
			}
			if(pwd==""){
				$("input[name='password']").parent().next().html("密码空");
				return false;
			}
			return true;
		})
		var zhi = '${msj}';
	
		if(zhi.length>0){
			alert(zhi);
		}
	})
</script>
</head>
<body>
	<form action="doLoginUser.controller" method="post">
		<table border="1px" width="50%">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" id="" /></td>
				<td width="20%"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" id="" /></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>