package com.project.chef.dao;

import java.util.List;

import com.project.chef.model.Recipe;

public interface RecipeDao {

	List<Recipe> fetchAllRecipes();
	
}
