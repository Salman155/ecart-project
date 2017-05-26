<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%@ include file="userHeader.jsp" %>
<form action="perform_login" method="post" >

    
        <div class="form-group">
        <div class="col-md-4">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">UserName</label>
					<input type="text" class="form-control" name="username"/>
					</div>
					<br>
					<br>
					<br>
				</div>

		<div class="form-group">
		<div class="col-md-4">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Password</label>
					<input type="password" class="form-control"  name="password"/>
					</div>
					<br>
					<br>
					<br>
				</div>
				
	   <div class="form-group">
	   <div class="col-md-4">
					<label class="col-md-4 control-label" for="submit"></label>
                    <input type="submit" class="btn btn-lg btn-info" value="Submit"></input>
					</div>
					<br>
					<br>
				    </div>


</form>
</body>
</html>