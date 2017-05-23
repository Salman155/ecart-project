<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="reg"	commandName="UserDetails" >
<center>
    <h1 style="color:red"><b>Registration </b></h1>
    <h2 style="color:red"><b>Create an Account</b></h2>
    <h4 style="color:red"><b>It's free and always will be.</b></h4>
    </center>
    <fieldset>
    
   
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName" style="color:#0000FF">UserId</label>
					<div class="col-md-4">
					<form:input class="form-control input-md" path="userId" ></form:input>
					</div>
					<form:errors path="userId" style="color:red;"></form:errors>
				</div>

				
				

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">UserName</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="userName" />
					</div>
				</div>

		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Password</label>
					<div class="col-md-4">
					<form:password class="form-control" path="password" />
					</div>
				</div>
				
		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Name</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="name" />
					</div>
				</div>

        <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Mobile number</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="mobile" />
					</div>
				    </div>
				
		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Email</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="email" />
					</div>
				   </div>
				
				
			
					<!-- Button -->
		<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
                    <input type="submit" class="btn btn-lg btn-info" value="Create Account"></input>
					</div>
				    </div>

			</fieldset>
</form:form>
</body>
</html>