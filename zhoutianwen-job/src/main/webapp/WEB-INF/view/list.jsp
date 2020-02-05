<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.js"></script>

<link href="/resource/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script>

</head>
<body>
	<h2>CCTV  招聘成绩列表</h2>
	<br>
	<a href="/list"> 全部</a><a href="list?flag=1"> 平均分90以上 </a> <a href="list?flag=2"> 平均分80以上</a> <a href="list?flag=3"> 研究生以上的学历</a>
	<a href="toAdd"> 添加应聘者</a>
	<br>
	<table class="table">
		<tr>
			<th>应聘人</th>
			<th>性别</th>
			<th>毕业学校</th>
			<th>所学专业</th>
		    <th>学历</th>
		    <th>学位</th>
		    <th>面试成绩</th>
		    <th>平均分</th>
		    <th>操作</th>
		</tr>
		<!-- 每个应聘者输入成绩 -->
		<c:forEach items="${pageApplicant.list}" var="applicant">
			<tr>
				<td>${applicant.name}</td>
				<td>${applicant.gender}</td>
				<td>${applicant.college}</td>
				<td>${applicant.major}</td>
				<td><c:choose>
					<c:when test="${applicant.edu==1}">
						专科
					</c:when>
					<c:when test="${applicant.edu==2}">
						本科
					</c:when>
					<c:when test="${applicant.edu==3}">
						研究生
					</c:when>
					<c:otherwise>
						其他
					</c:otherwise>
				</c:choose> </td>
				
				<td><c:choose>
					<c:when test="${applicant.degree==1}">
						学士
					</c:when>
					<c:when test="${applicant.degree==2}">
						硕士
					</c:when>
					<c:when test="${applicant.degree==3}">
						博士
					</c:when>
					<c:otherwise>
						其他
					</c:otherwise>
				</c:choose> </td>
				<td>${applicant.strScore}</td>
				<td>${applicant.avgScore}</td>
				<td><a>更新</a><a>删除</a><a href="toAddScore?aid=${applicant.id}">录入成绩</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>