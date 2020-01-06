<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
    <link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form action=" <%=request.getContextPath() %>/Update.do" method="post" name="ADD">
		<input type="hidden"  name="id" value="${b.id }"><br>
		公司名称:<input type="text" name="name" value="${b.name }"><br><br>
		审核状态:<input type="text" name="state" value="${b.state }"><br><br>
		<input type="button" id="tj" value="提交"> 
	</form>
	<script type="text/javascript">
		$(function () {
			$("#tj").click(function () {
				alert("1")
				$("form[name=ADD]").ajaxSubmit(function (res) {
					if(res>0){
						alert("审核成功")
						location="getList.do"
					}else{
						alert("审核失败")
					}
				})
			})
		})
	</script>
</body>
</html>