<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel='stylesheet'
	href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<title>Recipe</title>
</head>
<body>
	<br>
	<div class="container-fluid">
		<div class="panel panel-success">
			<div class="panel-heading" align="center">
				<h4>
					<b><font color="black" style="font-family: fantasy;">View
							Recipe</font> </b>
				</h4>
			</div>
			<div class="panel-body" align="center">

				<div class="container " style="margin-top: 10%; margin-bottom: 10%;">

					<div class="panel panel-success" style="max-width: 35%;"
						align="left">

						<div class="panel-heading form-group">
							<b><font color="white"> Recipe details</font> </b>
						</div>

						<div class="panel-body">

							<form:form id="recipeForm" modelAttribute="recipe"
								action="addRecipe" method="post">

								<div class="form-group">
									<form:label path="recipeName">${recipe.recipeName}</form:label>
									<form:input class="form-control" path="recipeName"
										name="recipeName" id="recipeName" value="${recipe.recipeName}" />
								</div>

								<div class="form-group">
									<form:label path="recipeType">Recipe type</form:label>
									<form:input class="form-control" path="recipeType"
										name="recipeType" id="recipeType" />
								</div>


								<div class="form-group">
									<form:label path="ingredients">Add Ingredients</form:label>
									<form:textarea rows="5" cols="30" class="form-control"
										path="ingredients" name="ingredients" id="ingredients" />
								</div>

								<div class="form-group">
									<form:label path="description">Description</form:label>
									<form:textarea rows="5" cols="30" class="form-control"
										path="description" name="description" id="description" />
								</div>

								<div class="form-group">
									<form:label path="imageUrl">Image</form:label>
									<form:input class="form-control" path="imageUrl"
										name="imageUrl" id="imageUrl" />
								</div>

								<div class="form-group">
									<form:label path="rating">Rating</form:label>
									<form:select class="form-control" path="rating" name="rating"
										id="rating">
										<form:option value="1" label="1" />
										<form:option value="2" label="2" />
										<form:option value="3" label="3" />
										<form:option value="4" label="4" />
										<form:option value="5" label="5" />
									</form:select>
								</div>

								<form:button style="width: 100%; font-size:1.1em;"
									class="btn btn-large btn btn-success btn-lg btn-block"
									id="recipe" name="recipe">Submit Rating</form:button>
							</form:form>

						</div>
					</div>

				</div>

			</div>

		</div>
	</div>


	<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>