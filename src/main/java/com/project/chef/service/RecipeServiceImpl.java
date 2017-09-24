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

}
