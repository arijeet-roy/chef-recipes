package com.project.chef.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.chef.model.Recipe;

public class RecipeMapper implements RowMapper<Recipe>{

	public RecipeMapper() {
		// TODO Auto-generated constructor stub
	}

	public Recipe mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Recipe recipe = new Recipe();
		recipe.setRecipeName(rs.getString("recipeName"));
		recipe.setRecipeType(rs.getString("recipeType"));
		recipe.setIngredients(rs.getString("ingredients"));
		recipe.setDescription(rs.getString("description"));
		recipe.setImageUrl(rs.getString("imageUrl"));
		recipe.setUserName(rs.getString("userName"));
		recipe.setNumOfRatings(rs.getInt("numOfRatings"));
		recipe.setRating(rs.getInt("rating"));
		return recipe;
	}

}
