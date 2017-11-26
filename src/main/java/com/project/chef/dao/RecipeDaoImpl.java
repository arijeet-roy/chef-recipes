package com.project.chef.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.chef.model.Account;
import com.project.chef.model.Recipe;

public class RecipeDaoImpl implements RecipeDao {

	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public RecipeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		// check if already exists
		String validateQuery = "select * from recipe where recipeName = '" + recipe.getRecipeName() + "'";
		List<Recipe> recipes = jdbcTemplate.query(validateQuery, new RecipeMapper());
		if (recipes.size() > 0) {
			String updateRecipeQuery = "update recipe set recipeType = ?, ingredients = ?, description = ?, imageUrl = ? where recipeName = ?";
			jdbcTemplate.update(updateRecipeQuery, new Object[] { recipe.getRecipeType(), recipe.getIngredients(),
					recipe.getDescription(), recipe.getImageUrl(), recipe.getRecipeName() });
		} else {
			String addRecipeQuery = "insert into recipe(`recipeName`, `recipeType`, `ingredients`, `description`, `imageUrl`, "
					+ "`rating`, `numOfRatings`, `userName`) values(?,?,?,?,?,?,?,?)";
			// System.out.println(recipe.getRating() + " " +
			// recipe.getUserName());
			jdbcTemplate.update(addRecipeQuery,
					new Object[] { recipe.getRecipeName(), recipe.getRecipeType(), recipe.getIngredients(),
							recipe.getDescription(), recipe.getImageUrl(), recipe.getRating(), recipe.getNumOfRatings(),
							recipe.getUserName() });
		}
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

	@Override
	public void updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		String updateRecipeQuery = "update recipe set rating = ?, numOfRatings = ? where recipeName = ?";
		jdbcTemplate.update(updateRecipeQuery,
				new Object[] { recipe.getRating(), recipe.getNumOfRatings(), recipe.getRecipeName() });

	}

	@Override
	public void deleteRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from recipe where recipeName = '" + recipe.getRecipeName() + "'";
		jdbcTemplate.update(deleteQuery);
	}

	// public Void addRecipe(Recipe recipe) {
	// String str = "Insert into recipe
	// (recipeName,recipeType,ingredients,description,imageUrl,rating)
	// values('"+
	// recipe.getRecipeName()+"','"+recipe.getRecipeType()+"','"+recipe.getIngredients()
	// +"','"+ recipe.getDescription()
	// +"','"+recipe.getImageUrl()+"',0)";
	// jdbcTemplate.execute(str);
	// return null;
	// }

}
