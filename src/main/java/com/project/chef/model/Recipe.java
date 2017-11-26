package com.project.chef.model;

public class Recipe {

	private String recipeName;
	private String recipeType;
	private String ingredients;
	private String description;
	private String imageUrl;
	private int rating;
	private int numOfRatings;
	private String userName;

	public Recipe() {
		// TODO Auto-generated constructor stub
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNumOfRatings() {
		return numOfRatings;
	}

	public void setNumOfRatings(int numOfRatings) {
		this.numOfRatings = numOfRatings;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ", recipeType=" + recipeType + ", ingredients=" + ingredients
				+ ", description=" + description + ", imageUrl=" + imageUrl + ", rating=" + rating + ", numOfRatings="
				+ numOfRatings + ", userName=" + userName + "]";
	}

}
