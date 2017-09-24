<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    		<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
            <title>Registration</title>
        </head>
        <body>
        <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: fantasy;">Sign up</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="white">
                                Sign up Form</font> </b>
                        </div>
                    
                        <div class="panel-body" >

                        <form:form id="signUpForm" modelAttribute="account" action="signUpProcess" method="post">
                            <div class="form-group">
                                    <form:label for="exampleInputEmail1" path="userName">Username</form:label> 
                                    <form:input class="form-control" path="userName" name="userName" id="userName" />
                                    
                            </div>
                            <div class="form-group">
                                    <form:label for="exampleInputPassword1" path="password">Password</form:label>
                                    <form:password class="form-control" path="password" name="password" id="password" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="firstName">First Name</form:label>
                                    <form:input class="form-control" path="firstName" name="firstName" id="firstName" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="lastName">Last Name</form:label>
                                    <form:input class="form-control" path="lastName" name="lastName" id="lastName" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="emailId">Email</form:label>
                                    <form:input class="form-control" path="emailId" name="emailId" id="emailId" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="address">Address</form:label>
                                    <form:input class="form-control" path="address" name="address" id="address" />
                            </div>
                            
                            <div class="form-group">
                                    <form:label path="phoneNum">Phone</form:label>
                                    <form:input class="form-control" path="phoneNum" name="phoneNum" id="phoneNum" />
                            </div>
                            
                                  <form:button style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" id="signUp" name="signUp">Sign up</form:button>                 
                        </form:form>

                        </div>
                    </div>
                    
                </div>
                
            </div>
            
        </div>
    </div>
            
                
        <script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        </body>
        </html>