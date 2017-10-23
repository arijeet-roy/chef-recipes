package com.project.chef.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.chef.model.Account;
import com.project.chef.model.Recipe;

public class RecipeDaoImpl implements RecipeDao{


	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public RecipeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public List<Recipe> fetchAllRecipes() {
		String validateQuery = "select * from recipe";
		List<Recipe> recipes = jdbcTemplate.query(validateQuery, new RecipeMapper());
		return recipes.size() > 0 ? recipes : null;
	
	}

	@Override
	public List<Recipe> fetchRecipesByName(String val) {
		// TODO Auto-generated method stub
		String validateQuery = "select * from recipe where recipeName like '%" + val + "%'";
		List<Recipe> recipes = jdbcTemplate.query(validateQuery, new RecipeMapper());
		return recipes.size() > 0 ? recipes : null;
	}

	@Override
	public List<Recipe> fetchRecipesByCuisine(String val) {
		// TODO Auto-generated method stub
		String validateQuery = "select * from recipe where recipeType like '%" + val + "%'";
		List<Recipe> recipes = jdbcTemplate.query(validateQuery, new RecipeMapper());
		return recipes.size() > 0 ? recipes : null;
	}

	@Override
	public List<Recipe> fetchRecipesByIngredients(String val) {
		// TODO Auto-generated method stub
		String validateQuery = "select * from recipe where ingredients like '%" + val + "%'";
		List<Recipe> recipes = jdbcTemplate.query(validateQuery, new RecipeMapper());
		return recipes.size() > 0 ? recipes : null;
	}

	public Void addRecipe(Recipe recipe) {
		String str = "Insert into recipe (recipeName,recipeType,ingredients,description,imageUrl,rating) values('"+
					recipe.getRecipeName()+"','"+recipe.getRecipeType()+"','"+recipe.getIngredients() +"','"+ recipe.getDescription()
					+"','"+recipe.getImageUrl()+"',0)";
		jdbcTemplate.execute(str);
		return null;
	}

}
