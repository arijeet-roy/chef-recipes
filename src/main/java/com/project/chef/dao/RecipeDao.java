package com.project.chef.dao;

import java.util.List;

import com.project.chef.model.Recipe;

public interface RecipeDao {

	List<Recipe> fetchAllRecipes();
	
	List<Recipe> fetchRecipesByName(String val);
	
	List<Recipe> fetchRecipesByCuisine(String val);

	List<Recipe> fetchRecipesByIngredients(String val);

	Void addRecipe(Recipe recipe);
}
