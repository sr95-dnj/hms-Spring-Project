<%-- 
    Document   : login
    Created on : Dec 30, 2020, 11:12:25 AM
    Author     : Siddiquer Rahman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/resources/assets/doctor/css/bootstrap.css" rel="stylesheet"/>
    </head>
    <body>
       
<div class="container" id="container">
	<div class="form-container sign-up-container">
            <form action="/doctor/save" method="post">
			<h3>Apply for a Doctor</h3>
			
			<span>or use your email for registration</span>
                        <input type="text" placeholder="Name" name="name" />
                        <input type="text" placeholder="Username" name="username" />
                        <input type="text" placeholder="Address" name="address" />
                        <input type="text" placeholder="Mobile" name="mobile" />
                        <input type="emal" placeholder="Email" name="email"/>
                        <input type="text" placeholder="Specialist" name="specialist"/>
                        <input type="password" placeholder="Password" name="password"/>
			<button>Sign Up</button>
		</form>
	</div>
	<div class="form-container sign-in-container">
            <form action="/reception/reception-login" method="post">
			<h1>Sign in</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your account</span>
                        <h3 style="color: red">${map.status}</h3>
                        <input type="text" name="username" placeholder="Username" />
                        <input type="password" name="password" placeholder="Password" />
			<a href="#">Forgot your password?</a>
                        <button type="submit">Sign In</button>
			<!--<button><a href="/reception/dashbord">Sign In</a></button>-->
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Hello, Friend!</h1>
				<p>Enter your personal details and start journey with us</p>
				<button class="ghost" id="signUp">Sign Up</button>
			</div>
		</div>
	</div>
</div>

<footer>
	
</footer>
       <script>
           const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});
       </script>
    </body>
</html>
