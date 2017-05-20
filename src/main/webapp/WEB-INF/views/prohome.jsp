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
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="product" commandName="ProductDetails" enctype="multipart/form-data">

<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>Image</th>
</tr> 
<core:forEach items="${proData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productName}</td>
                <td>${product.supID}</td>
                <td> ${product.categoryId}</td>
                    <td> ${product.productPrice}</td>
                    
                    
                <td><a href="image?img=${product.productId}">   
                <img src="./resources/image/${product.productId}.jpg" height="50px" width="50px"/></a></td> 




</tr>
</core:forEach>

</table>
</form:form>
</body>
</html>