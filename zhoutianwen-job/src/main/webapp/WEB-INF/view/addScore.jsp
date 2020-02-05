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
  <div class="container">
  	<h2>添加应聘人员的成绩</h2>
	<form action="addScore" method="post">
  
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      ${applicant.name}
    </div>
    <input type="hidden" value="${applicant.id}" name="aid">
  </div>
  
   <div class="form-group">
      <label for="job">应聘职位</label>
      <select id="job" name="jid" class="form-control">
        <c:forEach items="${jobs}" var="job"> 
        	<option value="${job.id}">${job.name}</option>
        </c:forEach>
      </select>
    </div>
    
    <div class="form-group row">
    <label for="score" class="col-sm-2 col-form-label">应聘成绩</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="score" id="score">
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">提交</button>
    </div>
  </div>
</form>

</div>


</body>
</html>