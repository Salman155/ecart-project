<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admin.jsp"  %>
<form:form class="form-horizontal" method="post" action="supp"	commandName="SupplierDetails" >
<centre><tr>
    <td><h2>SUPPLIERS</h2></td>
    </tr><centre>
<table>
<tr><td>sid:</td><td><form:input path="sId"/></td></tr>
<tr><td>sname:</td><td><form:input path="sName"/></td></tr>
<tr><td>sdis:</td><td><form:input path="sDis"/></td></tr>

<tr><td><input type="submit" value="${bname}"/></td></tr>
</table>
</form:form>

<table class="table table-bordered table-hover table-striped">
 <tr><th>supplier Id</th>

<th>supplier Name</th>
<th>supplier Description</th>

<th>Edit</th>
<th>Delete</th>

</tr> 
<core:forEach items="${supData}" var="supplier">
<tr class="success" >

                <td>${supplier.sId}</td> 
                 <td>${supplier.sName}</td>
                <td>${supplier.sDis}</td>
             
                     <td><a href="deladsup1?adsid1=${supplier.sId}">Edit</a></td>
                <td><a href="deladsup?adsid=${supplier.sId}">Delete</a></td>
               
</tr>
</core:forEach>

</table>

</body>
</html>