package com.project.chef.service;

import java.util.List;

import com.project.chef.model.Recipe;

public interface RecipeService {

	List<Recipe> fetchAllRecipes();
	
}
