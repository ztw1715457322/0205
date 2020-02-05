<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.js"></script>

<link href="/resource/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script>

<style type="text/css">
	span{
		color:red;
	}
</style>
</head>
<body>
  <div class="container">
  	<h2>添加应聘人员</h2>
	<form:form modelAttribute="applicant" action="add" method="post">
  
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      <form:input  path="name" class="form-control" id="name"></form:input>
    </div>
    <form:errors path="name"></form:errors>
  </div>
  
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">性别</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input type="radio" class="form-check-input"  name="gender" path="gender" id="gender1" value="男" checked/>
          <label class="form-check-label" for="gridRadios1">
            	男
          </label>
        </div>
        <div class="form-check">
          <input type="radio"  class="form-check-input"  name="gender" path="gender" id="gender2" value="女"/>
          <label class="form-check-label" for="gridRadios2">
            	女
          </label>
        </div>
      </div>
      <form:errors path="gender"></form:errors>
    </div>
  </fieldset>
  
  <div class="form-group row">
    <label for="birthday" class="col-sm-2 col-form-label">生日</label>
    <div class="col-sm-10">
      <form:input  type="Date" class="form-control" path="birthday" id="birthday"/>
    </div>
    <form:errors path="birthday"></form:errors>
  </div>
  
  <div class="form-group row">
    <label for="college" class="col-sm-2 col-form-label">毕业院校</label>
    <div class="col-sm-10">
      <form:input type="text" class="form-control" path="college" id="college"/>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="major" class="col-sm-2 col-form-label">所选专业</label>
    <div class="col-sm-10">
      <form:input type="text" class="form-control" path="major" id="major"/>
    </div>
    <form:errors path="major"></form:errors>
  </div>
  
   <div class="form-group">
      <label for="edu">学历</label>
      <form:select  id="edu" path="edu" class="form-control">
        <option value="1">专科</option>
        <option value="2">本科</option>
        <option value="3">研究生</option>
      </form:select>
       <form:errors path="edu"></form:errors>
    </div>
    
     <div class="form-group">
      <label for="degree">学位</label>
      <form:select id="degree" path="degree" class="form-control">
        <option value="1">学士</option>
        <option value="2">硕士</option>
        <option value="3">博士</option>
      </form:select>
        <form:errors path="degree"></form:errors>
    </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">提交</button>
    </div>
  </div>
</form:form>

</div>


</body>
</html>