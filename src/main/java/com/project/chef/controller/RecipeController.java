package com.project.chef.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.project.chef.model.Account;
import com.project.chef.model.Recipe;
import com.project.chef.service.AccountService;
import com.project.chef.service.RecipeService;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.project.chef.controller" })
@Controller
public class RecipeController extends WebMvcConfigurerAdapter {

	public RecipeController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AccountService accountService;
	@Autowired
	RecipeService recipeService;
	int previousRating;
	int numOfRatings;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	@RequestMapping(value = "/recipe", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("recipe");
		modelAndView.addObject("recipe", new Recipe());
		return modelAndView;
	}

	@RequestMapping(value = "/viewRecipe", method = RequestMethod.GET)
	public ModelAndView viewRecipe(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("viewRecipe");
		String recipeName = request.getParameter("recipeName");
		List<Recipe> recipes = recipeService.fetchAllRecipes();
		for (Recipe recipe : recipes) {
			if (recipe.getRecipeName().equalsIgnoreCase(recipeName)) {
				modelAndView.addObject("recipe", recipe);
				previousRating = recipe.getRating();
				numOfRatings = recipe.getNumOfRatings();
			}
		}
		return modelAndView;
	}

	@RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
	public ModelAndView addRecipe(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("recipe") Recipe recipe) {
		ModelAndView modelAndView = null;
		HttpSession session = request.getSession(true);
		recipe.setUserName((String) session.getAttribute("sessionName"));
		recipe.setRating(0);
		recipe.setNumOfRatings(0);
		recipeService.addRecipe(recipe);
		modelAndView = new ModelAndView("welcome");
		// modelAndView.addObject("firstName", account.getFirstName());
		List<Recipe> recipes = recipeService.fetchAllRecipes();
		modelAndView.addObject("recipes", recipes);
		return modelAndView;
	}

	@RequestMapping(value = "/updateRecipe", method = RequestMethod.POST)
	public ModelAndView updateRecipe(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("recipe") Recipe recipe) {
		ModelAndView modelAndView = null;
		HttpSession session = request.getSession(true);
		recipe.setUserName((String) session.getAttribute("sessionName"));
		int currentRating = recipe.getRating();
		int previousTotRating = previousRating * numOfRatings;
		numOfRatings++;
		int currentAvgRating = (previousTotRating + currentRating) / numOfRatings;
		recipe.setRating(currentAvgRating);
		recipe.setNumOfRatings(numOfRatings);
		recipeService.updateRecipe(recipe);
		modelAndView = new ModelAndView("welcome");
		// modelAndView.addObject("firstName", account.getFirstName());
		List<Recipe> recipes = recipeService.fetchAllRecipes();
		modelAndView.addObject("recipes", recipes);
		return modelAndView;
	}

}
