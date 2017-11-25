DROP DATABASE IF EXISTS Chef;
CREATE DATABASE Chef; 
USE Chef;
DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts 
( 
		`userName`  VARCHAR(45) NOT NULL, 
		`password`  VARCHAR(45) NOT NULL, 
		`firstName` VARCHAR(45) NOT NULL, 
		`lastName`  VARCHAR(45), 
		`emailId`     VARCHAR(45), 
		`address`   VARCHAR(45), 
		`phoneNum`     varchar(10), 
        `dob`     varchar(45),
	CONSTRAINT accountId_pk PRIMARY KEY (`userName`) 
)

DROP TABLE IF EXISTS recipe;
CREATE TABLE recipe 
( 
		`recipeId`  int NOT NULL auto_increment, 
		`recipeName`  VARCHAR(45) NOT NULL, 
		`recipeType` VARCHAR(45) NOT NULL, 
		`ingredients`  VARCHAR(255), 
		`description`     TEXT,
        `imageUrl`     TEXT,
		`rating`   int,
		`userName`  VARCHAR(45) NOT NULL,
	CONSTRAINT recipeId_pk PRIMARY KEY (`recipeId`) 
	CONSTRAINT userId_fk FOREIGN KEY (`userName`) REFERENCES accounts(`userName`)
)

--INSERT INTO accounts VALUES ('arijeet','1234','arijeet', null, null, null, null, null);
Insert into recipe (`recipeName`, `recipeType`, `ingredients`, `description`, `imageUrl`, 
`rating`) values ('Outrageous Warm Chicken Nacho Dip', 'Appetizers and Snacks', 
'diced tomatoes, processed cheese, chicken meat, sour cream, green onion, taco seasoning, jalapeno pepper', 
'This is a jazzed up version of classic queso dip taken to a heartier level, perfect for 
football games, tailgating or for taking along to pot lucks in a slow cooker! This is a 
serious crowd-pleaser that is served hot as a dip, spooned over crisp tortilla chips 
nacho-style, or rolled up in a warm flour tortilla! The heat can be turned up or down 
with the addition of jalapenos to taste.', 'http://images.media-allrecipes.com/userphotos/720x405/2333962.jpg', 
5, 'a');

Insert into recipe (`recipeName`, `recipeType`, `ingredients`, `description`, `imageUrl`, 
`rating`) values ('Mediterranean Chicken', 'World Cuisine', 
'Sauteed chicken, tomatoes, olives, white wine, garlic, and herbs.', 
'This recipe is from The WEBB Cooks, articles and recipes by Robyn Webb, courtesy of the 
American Diabetes Association. Preparation time: 20 minutes. Sauteed chicken simmered in
 a sauce of tomatoes, olives, white wine, garlic, and herbs.', 
'http://images.media-allrecipes.com/userphotos/720x405/3442434.jpg', 
4, 'a');

Insert into recipe (`recipeName`, `recipeType`, `ingredients`, `description`, `imageUrl`, 
`rating`) values ('Blueberry Sour Cream Coffee Cake', 'Desserts', 
'Butter, blueberries, sugar, cinnamon, pecans, sour cream and vanilla extract.', 
'One really delicious and really unhealthy Sunday coffee cake. The author has no idea where 
she got this recipe from but it was about thirty years ago and has been a family favorite since. 
The bake time is a bit longer if you''re using frozen berries.', 
'http://images.media-allrecipes.com/userphotos/720x405/4559321.jpg', 
5, 'a');











