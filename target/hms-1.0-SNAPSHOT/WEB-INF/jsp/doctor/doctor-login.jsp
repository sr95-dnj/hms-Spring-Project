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
                <form action="/applyDoctor/store" method="post" enctype="multipart/form-data">
                    <h3>Apply for a Doctor</h3>
                    <table>
                        <tbody>
                            <tr>
                                <td><input type="text" placeholder="First Name" name="first_name" style="min-width: 110px" /></td>
                                <td><input type="text" placeholder="Last Name" name="last_name" style="min-width: 110px" /></td>
                            </tr>

                            <tr>
                                <td><input type="text" placeholder="User Name" name="user_name" style="min-width: 110px" /></td>
                                <td><input type="password" placeholder="password" name="password" style="min-width: 110px" /></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="text" placeholder="Address" name="address" style="min-width: 225px" /></td>

                            </tr>
                            <tr>
                                <td><input type="text" placeholder="Mobile" name="phone" style="min-width: 110px" /></td>
                                <td><input type="text" placeholder="Email" name="email" style="min-width: 110px" /></td>
                            </tr>

                            <tr>
                                <td><input type="text" placeholder="Specialist" name="department" style="min-width: 110px" /></td>
                                <td><input type="text" placeholder="Short Bio" name="bio" style="min-width: 110px" /></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="file" name="image" style="min-width: 225px" /></td>

                            </tr>
                        </tbody>
                    </table>
                    <button type="submit" id="sbtn" onclick="dbtn()">Register</button>
                </form>
            </div>
            <div class="form-container sign-in-container">
                <form action="/doctor/doc-login" method="post">
                    <h1>Sign in</h1>
                    <div class="social-container">
                        <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                        <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                        <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                    <span>or use your account</span>
                    <H4 style="color: red">${map.status}</h4>
                    <input type="text" placeholder="Email" name="user_name" />
                    <input type="password" placeholder="Password" name="password"/>
                    <a href="#">Forgot your password?</a>
                    <button type="submit">Sign In</button>
                    <!--<button><a href="/doctor/doctor-dashbord">Sign In</a></button>-->
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
        
        
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

        <script>
            $('#sbtn').click(function(){
                alert("");
                swal("Good job!", "Your Appointment Successfully Submited", "success");
            });
            
            function dbtn(){
                alert("okk done");
            };
        </script>
    </body>
</html>
