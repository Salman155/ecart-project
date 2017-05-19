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
<centre><tr>
    <td><h2>CATEGORIES</h2></td>
    </tr><centre>
<table>
<tr><td>categoryname:</td><td><form:input path="categoryName"/></td></tr>
<tr><td>categoryid:</td><td><form:input path="categoryId"/></td></tr>
<tr><td>categorydescription:</td><td><form:input path="categoryDescription"/></td></tr>

<tr><td><input type="submit" value="Submit"/></td></tr>
</table>
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
             
                     <td><a href="UpdateAdmprod?adpid=${category.categoryId}">Edit</a></td>
                <td><a href="deladcat?adcid=${category.categoryId}">Delete</a></td>
               
</tr>
</core:forEach>

</table>
</body>
</html>