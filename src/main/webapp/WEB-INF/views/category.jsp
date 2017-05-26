<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admin.jsp"  %>
<form:form class="form-horizontal" method="post" action="cat"	commandName="CategoryDetails" >
<fieldset>

   <div class="form-group">
					 <label class="col-md-4 control-label" for="requestName" style="color:#000000">CATEGORY ID</label>
					 <div class="col-md-4">
					 <form:input class="form-control input-md" path="categoryId" ></form:input>
					 </div>
				     </div>

 <div class="form-group">
					 <label class="col-md-4 control-label" for="requestName" style="color:#000000">CATEGORY NAME</label>
					 <div class="col-md-4">
					 <form:input class="form-control input-md" path="categoryName" ></form:input>
					 </div>
				     </div>
 
<div class="form-group">
					 <label class="col-md-4 control-label" for="requestName" style="color:#000000">CATEGORY DESCRIPTION</label>
					 <div class="col-md-4">
					 <form:input class="form-control input-md" path="categoryDescription" ></form:input>
					 </div>
				     </div>
 
 <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF"></label>
					<div class="col-md-4">
					<input type="Submit" class="btn btn-lg btn-info" value="${bname}"></input>				
					</div>
					</div>

</fieldset>
</form:form>


<table class="table table-bordered table-hover table-striped">
<tr><th>Category Id</th>
<th>category Name</th>
<th>category Description</th>
<th>Edit</th>
<th>Delete</th>
</tr> 
<core:forEach items="${catData}" var="category">
<tr class="success" >

                <td>${category.categoryId}</td> 
                <td>${category.categoryName}</td>
                <td>${category.categoryDescription}</td>
                <td><a href="deladcat1?adcid1=${category.categoryId}">Edit</a></td>
                <td><a href="deladcat?adcid=${category.categoryId}">Delete</a></td>
               
</tr>
</core:forEach>
</table>
</body>
</html>