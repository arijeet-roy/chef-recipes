package com.project.chef.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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

}
