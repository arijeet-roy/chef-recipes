package com.project.chef.controller;

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
public class SignUpController extends WebMvcConfigurerAdapter{

	public SignUpController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AccountService accountService;
	@Autowired
	RecipeService recipeService;

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("signUp");
		modelAndView.addObject("account", new Account());
		return modelAndView;
	}

	@RequestMapping(value = "/signUpProcess", method = RequestMethod.POST)
	public ModelAndView addAccount(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("account") Account account) {
		ModelAndView modelAndView = null;
		HttpSession session = request.getSession(true);
		session.setAttribute("sessionName", account.getFirstName());
		accountService.register(account);
		List<Recipe> recipes = recipeService.fetchAllRecipes();
		modelAndView = new ModelAndView("welcome");
//		modelAndView.addObject("firstName", account.getFirstName());
		modelAndView.addObject("recipes", recipes);
		return modelAndView;
	}

}
