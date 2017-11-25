package com.project.chef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.chef.dao.RecipeDao;
import com.project.chef.model.Recipe;

public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeDao recipeDao;
	
	public RecipeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public List<Recipe> fetchAllRecipes() {
		// TODO Auto-generated method stub
		return recipeDao.fetchAllRecipes();
	}

	@Override
	public List<Recipe> fetchRecipesByName(String val) {
		// TODO Auto-generated method stub
		return recipeDao.fetchRecipesByName(val);
	}

	@Override
	public List<Recipe> fetchRecipesByCuisine(String val) {
		// TODO Auto-generated method stub
		return recipeDao.fetchRecipesByCuisine(val);
	}

	@Override
	public List<Recipe> fetchRecipesByIngredients(String val) {
		// TODO Auto-generated method stub
		return recipeDao.fetchRecipesByIngredients(val);
	}

	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		recipeDao.addRecipe(recipe);
	}

	@Override
	public void updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		recipeDao.updateRecipe(recipe);
	}

//	public void addNewRecipe(Recipe recipe) {
//		 recipeDao.addRecipe(recipe);
//		return;
//	}
	
	

}
