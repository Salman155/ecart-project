<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="pro" commandName="ProductDetails" enctype="multipart/form-data">
PRODUCT ID:<br>
<form:input path="productId"/><br>
PRODUCT NAME:<br>
<form:input path="productName"/><br>
PRODUCT DESCRIPTION:<br>
<form:input path="productDescription"/><br>
PRODUCT PRICE:<br>
<form:input path="productPrice"/><br>
CATEGORY ID:<br>
<form:select class="form-control" path="categoryId"><br>
<form:option value="-1">select category name</form:option>
<core:forEach items="${catData}" var="cat">
<form:option value="${cat.categoryId}">${cat.categoryName}</form:option>
</core:forEach>
</form:select>
SUPPLIER ID:<br>
<form:select class="form-control" path="supID"><br>
<form:option value="-1">select supplier name</form:option>
<core:forEach items="${supData}" var="cat">
<form:option value="${sup.sId}">${sup.sName}</form:option>
</core:forEach>
</form:select><br>
<br>

<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Image</label>
					<div class="col-md-4">
					<form:input type="file" path="pimage" />
					</div>
				</div>

<input type="submit" value="${bname}">
</form:form>


<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>Edit</th>
<th>Delete</th>
<th>Image</th>
</tr> 
<core:forEach items="${proData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productName}</td>
                <td>${product.supID}</td>
                <td> ${product.categoryId}</td>
                    <td> ${product.productPrice}</td>
                     <td><a href="deladprod1?adpid1=${product.productId}">Edit</a></td>
                <td><a href="deladprod?adpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/image/${product.productId}.jpg" height="50px" width="50px"/></td> 

</tr>
</core:forEach>

</table>
</body>
</html>