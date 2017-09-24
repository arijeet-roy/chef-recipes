<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    		<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
            <title>Login</title>
        </head>
        <body>
            <br>
    <div class="container-fluid">
        <div class="panel panel-success">
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: fantasy;">Login</font> </b></h4>
            </div>
            <div class="panel-body"align="center">
                  
                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">
    
                    <div class="panel panel-success" style="max-width: 35%;" align="left">
                        
                        <div class="panel-heading form-group">
                            <b><font color="white">
                                Login Form</font> </b>
                        </div>
                    
                        <div class="panel-body" >

                        <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
                            <div class="form-group">
                                    <form:label for="exampleInputEmail1" path="userName">Username</form:label> 
                                    <form:input class="form-control" path="userName" name="userName" id="userName" />
                                    
                            </div>
                            <div class="form-group">
                                    <form:label for="exampleInputPassword1" path="password">Password</form:label>
                                    <form:password class="form-control" path="password" name="password" id="password" />
                            </div>
                            
                                  <form:button style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" id="login" name="login">Login</form:button>                 
                        </form:form>

					<table align="center">
					                <tr>
					                    <td style="font-style: italic; color: red;">${message}</td>
					                </tr>
					            </table>
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