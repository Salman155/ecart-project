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
<fieldset>

           <div class="form-group">
					 <label class="col-md-4 control-label" for="requestName" style="color:#0000FF">Product Id</label>
					 <div class="col-md-4">
					 <form:input class="form-control input-md" path="productId" ></form:input>
					 </div>
				     </div>

				
				

		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Product Name</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="productName" />
					</div>
				    </div>

		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Product Description</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="productDescription" />
					</div>
				</div>
				
		<div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Product Price</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="productPrice" />
					</div>
				</div>

        <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Product Stock</label>
					<div class="col-md-4">
					<form:textarea class="form-control" path="stock" />
					</div>
				    </div>
				    
	     <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">CATEGORY NAME</label>
					<div class="col-md-4">
					<form:select class="form-control" path="categoryId">
					<form:option value="-1">select category name</form:option>
                    <core:forEach items="${catData}" var="cat">
                    <form:option value="${cat.categoryId}">${cat.categoryName}</form:option>
                    </core:forEach>
                    </form:select>
                    
					</div>
				    </div>
				    
		  <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">SUPPLIER NAME</label>
					<div class="col-md-4">
					<form:select class="form-control" path="supID">
					<form:option value="-1">select supplier name</form:option>
                     <core:forEach items="${supData}" var="sup">
                     <form:option value="${sup.sId}">${sup.sName}</form:option>
                     </core:forEach>
                     </form:select>
					</div>
				    </div>

             <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Image</label>
					<div class="col-md-4">
					<form:input type="file" path="pimage" />
					</div>
				    </div>
				    
			 <div class="form-group">
					<label class="col-md-4 control-label" for="comments" style="color:#0000FF">Image</label>
					<div class="col-md-4">
					<input type="Submit" class="btn btn-lg btn-info" value="${bname}"></input>				
					</div>
					</div>
	</fieldset>			   
</form:form>

<table class="table table-bordered table-hover table-striped">
<tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>stock</th>
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
                <td> ${product.stock}</td>   
                
                <td><a href="deladprod1?adpid1=${product.productId}">Edit</a></td>
                <td><a href="deladprod?adpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/image/${product.productId}.jpg" height="75px" width="75px"/></td> 

</tr>
</core:forEach>

</table>
</body>
</html>