package com.project.chef.dao;

import java.util.List;

import com.project.chef.model.Recipe;

public interface RecipeDao {

	void addRecipe(Recipe recipe);

	List<Recipe> fetchAllRecipes();

	List<Recipe> fetchRecipesByName(String val);

	List<Recipe> fetchRecipesByCuisine(String val);

	List<Recipe> fetchRecipesByIngredients(String val);

	void updateRecipe(Recipe recipe);

	void deleteRecipe(Recipe recipe);
	// Void addRecipe(Recipe recipe);
}
