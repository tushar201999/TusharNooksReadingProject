<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<div class="form-group">
<label>Enter UserName</label>
<input type="text" name="uname" placeholder="Enter User Name" class="form control">
</div>
<div class="form-group">
<label>Enter Password</label>
<input type="text" name="upassword" placeholder="Enter User password" class="form control">
</div>
<div class="form-group">
<input type="submit" value="login" class="btn btn-primary">
<input type="reset" value="Reset" class="btn btn-primary">
</div>
</div>

</body>
</html>