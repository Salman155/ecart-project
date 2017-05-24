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
<form:form class="form-horizontal" method="post" action="login"	commandName="UserCredentials" >

    
        <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">UserName</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="username" />
					</div>
				</div>

		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Password</label>
					<div class="col-md-4">
					<form:password class="form-control" path="password" />
					</div>
				</div>
				
	   <div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
                    <input type="submit" class="btn btn-lg btn-info" value="Submit"></input>
					</div>
				    </div>


</form:form>
</body>
</html>