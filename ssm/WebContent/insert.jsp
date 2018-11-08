<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="${pageContext.request.contextPath}/insert.action" method="post">
   		id:<input name="id" type="text"><br>	
   		用户名：<input name="username" type="text"/><br> 
   		密  码：<input name="password" type="text"/> 
   		提交：<input type="submit" value="注册"/>
   </form>
   
</body>
</html>