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
<div align="center">
<div align="left">
	<form action="<%=request.getContextPath() %>/getList.do" method="post"> 
		id:<input type="text" name="id" >
		keywords:<input type="text" name="keywords" >
		represent:<input type="text" name="represent" ><br>
		name:<input type="text" name="name " >
		yproject:<input type="text" name="yproject " >
		address:<input type="text" name="address " ><br>
		registered:<input type="text" name="registered " >
		birthday:<input type="text" name="birthday " >
		inspection:<input type="text" name="inspection" ><br>
		state:<input type="text" name="state " >
		<input type="submit" value="查询">
	</form>
</div>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>keywords</td>
				<td>represent</td>
				<td>name</td>
				<td>yproject</td>
				<td>address</td>
				<td>registered</td>
				<td>birthday</td>
				<td>inspection</td>
				<td>state</td>
				<td>remark</td>
				<td>operation </td>
			</tr>
		</thead>
		
		<tfoot>
			<c:forEach items="${list }" var="b">
						<tr>
				<td>${b.id }</td>
				<td>${b.keywords }</td>
				<td>${b.represent }</td>
				<td>${b.name }</td>
				<td>${b.yproject }</td>
				<td>${b.address }</td>
				<td>${b.registered }</td>
				<td>${b.birthday }</td>
				<td>${b.inspection }</td>
				<td>${b.state }</td>
				<td>${b.remark }</td>
				<td><a href="<%=request.getContextPath() %>/toSet.do?id=${b.id}">审核 </a></td>
			</tr>
			</c:forEach>
		</tfoot>
	
	</table>
				<td colspan="4">当前第 ${page.pageNum} 页 共${page.pages} 页，共 ${page.total} 条
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=1">首页</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=${page.isFirstPage?1:page.prePage}">上一页</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=1">1</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=2">2</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=3">3</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=4">4</a>
                ...
                <a
                    href="<%=request.getContextPath() %>/getList.do?pageNum=${page.isLastPage?page.pages:page.nextPage}">下一页</a>
                <a href="<%=request.getContextPath() %>/getList.do?pageNum=${page.pages}">尾页</a>
</div>
</body>
</html>