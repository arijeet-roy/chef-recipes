<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<title>Welcome</title>
</head>
<body>
	<div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
	<table>
		<tr>
			<td><h4><b><font color="black" style="font-family: fantasy;">Welcome ${firstName}</font> </b></h4></td>
		</tr>
	</table>
	</div>
	</div>
	</div>

	<hr size="4" color="gray" />
	<div class="container-fluid">
        <div class="panel panel-success">
        <form action="<c:url value="/search" />" method="GET">
            <INPUT TYPE="radio" name="action" value="name" checked="checked"/>Name
            <INPUT TYPE="radio" name="action" value="cuisine"/>Cuisine
			<INPUT TYPE="radio" NAME="action" VALUE="ingredients"/>Ingredients
			<INPUT TYPE="text" NAME="searchVal" placeholder="Search"/>
			<INPUT TYPE="submit" VALUE="Search" /> 
			<INPUT TYPE="submit" VALUE="View All Recipes" /> 
		</form><br>
		<form action="<c:url value="/newRecipe" />" method="get">
			<INPUT TYPE="submit" VALUE="Add new recipe" /> 
		</form>
		
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: fantasy;">Current Recipes</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
                        <div class="panel-body" >
							<table class="table table-hover">
								<c:forEach items="${recipes}" var="recipe">
									<tr>
										<td><img src="${recipe.imageUrl}"
											style="width: 304px; height: 204px;" /></td>
										<td>Recipe Name: <c:out value="${recipe.recipeName}" /></td>
										<td>Recipe Type: <c:out value="${recipe.recipeType}" /></td>
										<td>Ingredients: <c:out value="${recipe.ingredients}" /></td>
										<td>Description: <c:out value="${recipe.description}" /></td>
										<td>Rating: <c:out value="${recipe.rating}" /></td>
									</tr>
								</c:forEach>
							</table>
							</div>
							</div>
							</div>
							</div>
	</div>
	
	<div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
	<table>
		<tr>
			<td><a href="index.jsp">Home</a></td>
		</tr>
	</table>
	</div>
	</div>
	</div>
	<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>