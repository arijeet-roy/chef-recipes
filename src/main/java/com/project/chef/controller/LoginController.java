package com.project.chef.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.project.chef.model.Login;
import com.project.chef.model.Recipe;
import com.project.chef.service.AccountService;
import com.project.chef.service.RecipeService;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.project.chef.controller" })
@Controller
public class LoginController extends WebMvcConfigurerAdapter{

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	AccountService accountService;
	@Autowired
	RecipeService recipeService;

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("login", new Login());
		return modelAndView;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView modelAndView = null;
		Account account = accountService.validateAccount(login);
		List<Recipe> recipes = recipeService.fetchAllRecipes();
		if (null != account) {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("firstName", account.getFirstName());
			modelAndView.addObject("recipes", recipes);
		} else {
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "Username or Password is wrong!!");
		}
		return modelAndView;
	}
}
