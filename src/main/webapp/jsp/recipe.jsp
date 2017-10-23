<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    		<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
            <title>Registration</title>
        </head>
        <body>
        <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: fantasy;">Sign up</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="white">
                                New Recipe</font> </b>
                        </div>
                    
                        <div class="panel-body" >

                        <form:form id="newRecipeForm" modelAttribute="recipe" action="addRecipe" method="post">
                            <div class="form-group">
                                    <form:label for="recipeName" path="recipeName">Recipe Name</form:label> 
                                    <form:input class="form-control" path="recipeName" name="recipeName" id="recipeName" />
                                    
                            </div>
                            <div class="form-group">
                                    <form:label for="recipeType" path="recipeType">Recipe Type</form:label>
                                    <form:input class="form-control" path="recipeType" name="recipeType" id="recipeType" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="ingredients">Ingredients</form:label>
                                    <form:textarea class="form-control" path="ingredients" name="ingredients" id="ingredients" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="description">Description</form:label>
                                    <form:textarea class="form-control" path="description" name="description" id="description" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="imageUrl">Image Url</form:label>
                                    <form:input class="form-control" path="imageUrl" name="imageUrl" id="imageUrl" />
                            </div>
                                  <form:button style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" id="submit" name="Submit">Submit</form:button>                 
                        </form:form>

                        </div>
                    </div>
                    
                </div>
                
            </div>
            
        </div>
    </div>
            
                
        <script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        </body>
        </html>