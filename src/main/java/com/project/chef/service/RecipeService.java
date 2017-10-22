package com.project.chef.service;

import java.util.List;

import com.project.chef.model.Recipe;

public interface RecipeService {

	List<Recipe> fetchAllRecipes();

	List<Recipe> fetchRecipesByName(String val);
	
	List<Recipe> fetchRecipesByCuisine(String val);

	List<Recipe> fetchRecipesByIngredients(String val);
}
