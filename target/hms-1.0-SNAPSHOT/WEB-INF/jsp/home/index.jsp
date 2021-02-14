<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>H.M.S</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="/resources/assets/home/img/favicon.png">
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="/resources/assets/home/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/assets/home/css/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/assets/home/css/magnific-popup.css">
    <link rel="stylesheet" href="/resources/assets/home/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/assets/home/css/themify-icons.css">
    <link rel="stylesheet" href="/resources/assets/home/css/nice-select.css">
    <link rel="stylesheet" href="/resources/assets/home/css/flaticon.css">
    <link rel="stylesheet" href="/resources/assets/home/css/gijgo.css">
    <link rel="stylesheet" href="/resources/assets/home/css/animate.css">
    <link rel="stylesheet" href="/resources/assets/home/css/slicknav.css">
    <link rel="stylesheet" href="/resources/assets/home/css/style.css">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>

<body>
    <!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->

    <!-- header-start -->
    <header>
        <div class="header-area ">
            <div class="header-top_area">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-6 col-md-6 ">
                            <div class="social_media_links">
                                <a href="#">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                                <a href="#">
                                    <i class="fa fa-google-plus"></i>
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-6 col-md-6">
                            <div class="short_contact_list">
                                <ul>
                                    <li><a href="#"> <i class="fa fa-envelope"></i> javasiddiquer.bd@gmail.com</a></li>
                                    <li><a href="#"> <i class="fa fa-phone"></i> 09638932180</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
    </header>
    <!-- header-end -->

    <!-- slider_area_start -->
    <div class="slider_area">
        <div class="slider_active owl-carousel">
            <div class="single_slider  d-flex align-items-center slider_bg_2">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="slider_text ">
                                <h3> <span>Health care</span> <br>
                                    For Hole Family </h3>
                                <p>In healthcare sector, service excellence is the facility of <br> the hospital as
                                    healthcare service provider to consistently.</p>
                                <a href="admin/loginPage" class="boxed-btn3">Login</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
        </div>
    </div>
    <!-- slider_area_end -->

   

    

   
  
   

    <!-- expert_doctors_area_start -->
    <div class="expert_doctors_area">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="doctors_title mb-55">
                        <h3>Expert Doctors</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
                    <div class="expert_active owl-carousel">
                        <c:forEach items="${map.dList}" var="doctor">
                        <div class="single_expert">
                            <div class="expert_thumb">
                                <img src="/resources/assets/img/${doctor.image}" alt="">
                            </div>
                            <a onclick="edit('${doctor.id}','${doctor.first_name}','${doctor.department}', '${doctor.image}', '${doctor.code}')" data-toggle="modal" data-target="#myModal">
                                <div class="experts_name text-center">
                                <h3>${doctor.first_name} ${doctor.last_name}</h3>
                                <span>${doctor.department}</span>
                            </div>
                            </a>
                        </div>
                        </c:forEach>
                        
                      
                              
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- expert_doctors_area_end -->

    <!-- Emergency_contact start -->
    <div class="Emergency_contact">
        <div class="conatiner-fluid p-0">
            <div class="row no-gutters">
                <div class="col-xl-6">
                    <div class="single_emergency d-flex align-items-center justify-content-center emergency_bg_1 overlay_skyblue">
                        <div class="info">
                            <h3>For Any Emergency Contact</h3>
                            <p>Esteem spirit temper too say adieus.</p>
                        </div>
                        <div class="info_button">
                            <a href="#" class="boxed-btn3-white">+10 378 4673 467</a>
                        </div>
                    </div>
                </div>
                <div class="col-xl-6">
                    <div class="single_emergency d-flex align-items-center justify-content-center emergency_bg_2 overlay_skyblue">
                        <div class="info">
                            <h3>Make an Online Appointment</h3>
                            <p>Esteem spirit temper too say adieus.</p>
                        </div>
                        <div class="info_button">
                            <a href="#" data-toggle="modal" data-target="#myModal" class="boxed-btn3-white">Make an Appointment</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Emergency_contact end -->

<!-- footer start -->
    <footer class="footer">
            <div class="footer_top">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-4 col-md-6 col-lg-4">
                            <div class="footer_widget">
                                <div class="footer_logo">
                                    <a href="#">
                                        <img src="/resources/assets/home/img/footer_logo.png" alt="">
                                    </a>
                                </div>
                                <p>
                                        Firmament morning sixth subdue darkness 
                                        creeping gathered divide.
                                </p>
                                <div class="socail_links">
                                    <ul>
                                        <li>
                                            <a href="#">
                                                <i class="ti-facebook"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="ti-twitter-alt"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="fa fa-instagram"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
    
                            </div>
                        </div>
                        <div class="col-xl-2 offset-xl-1 col-md-6 col-lg-3">
                            <div class="footer_widget">
                                <h3 class="footer_title">
                                        Departments
                                </h3>
                                <ul>
                                    <li><a href="#">Eye Care</a></li>
                                    <li><a href="#">Skin Care</a></li>
                                    <li><a href="#">Pathology</a></li>
                                    <li><a href="#">Medicine</a></li>
                                    <li><a href="#">Dental</a></li>
                                </ul>
    
                            </div>
                        </div>
                        <div class="col-xl-2 col-md-6 col-lg-2">
                            <div class="footer_widget">
                                <h3 class="footer_title">
                                        Useful Links
                                </h3>
                                <ul>
                                    <li><a href="#">About</a></li>
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">About</a></li>
                                    <li><a href="#"> Contact</a></li>
                                    <li><a href="#"> Appointment</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-xl-3 col-md-6 col-lg-3">
                            <div class="footer_widget">
                                <h3 class="footer_title">
                                        Address
                                </h3>
                                <p>
                                    196/3, Santibag, Malibag, Dhaka-1217 <br>
                                    +8809638932180 <br>
                                    javasiddiquer.bd@gmail.com
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copy-right_text">
                <div class="container">
                    <div class="footer_border"></div>
                    <div class="row">
                        <div class="col-xl-12">
                            <p class="copy_right text-center">
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
<!-- footer end  -->
    <!-- link that opens popup -->

    <!-- form itself end-->
    <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
            
        </div>
          <div style="margin-left: 20px" id="div1">
              <div><h2 style="text-align: center">Expert </h2></div>
              <div><input type="text" style="font-size: 45px; border: hidden; width: 400px" readonly="" id="doctor" name="doctor"/></div>
              
              
            <div><h3>HMS Hospital</h3></div>
            <div><h4>1969/3, Malibag</h4></div>
            <div><h4>Dhaka-1217</h4></div>
            <button class="btn btn-primary" type="button" id="btnprocced">Make an Appointment</button>
          </div> 
          
          <div class="modal-body" id="div2">
              <div class="container-fluid">
                  <div class="row">
                      <div class="col-md-8"><h2><strong>Make an Appointment</strong></h2></div>
                      <div class="col-md-4" style="clip-path: circle(40.0% at 50% 50%)"><img id="srcImg"/> </div>
                  </div>
              </div>
              <hr/>
              
            <form action="/save" method="post">
                
                    <div class="row form-group">
                        
                     
                        <div class="col-md-6">
                            <strong>Doctor</strong>   <input type="text" name="doctor" id="doctorname" >
                            <input type="hidden" name="doctorCode" id="docCode" >
                        </div>
                        
                        <div class="col-md-6">
                            <strong>Specialist</strong>   <input type="text" class="form-group" name="department" id="department">
                        </div>
                        <div class="col-md-12">
                            <h3><strong>Please Provide Your Information</strong></h3>
                        </div>
                        <div class="col-md-6">
                         Patient Name   <input type="text" class="form-group" name="name">
                        </div>
                        
                      
                        <div class="col-md-6">
                            Address   <input type="text" class="form-group" name="address">
                        </div>
                      
                        <div class="col-md-6">
                          Mobile  <input type="text" class="form-group" name="mobile">
                        </div>
                        
                        <div class="col-md-6">
                            Patient Age  <input type="text" class="form-group"  name="comment">
                        </div>
                        <div class="col-md-6">
                            Disease  <input type="text" class="form-group"  name="comment">
                        </div>
                        <div class="col-md-6">
                           Appointment Date <input  type="datetime-local" class="col-xl-10 form-group" name="appointment_date">
                        </div>
                        
                        <div class="col-xl-6">
                            <button type="submit" onclick="swbtn()" class="btn btn-primary">Request for Appointment</button>
                        </div>
                    </div>
                </form>
        </div>
          
          
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
    <!-- form itself end -->

    <!-- JS here -->
    <script src="/resources/assets/home/js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="/resources/assets/home/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="/resources/assets/home/js/popper.min.js"></script>
    <script src="/resources/assets/home/js/bootstrap.min.js"></script>
    <script src="/resources/assets/home/js/owl.carousel.min.js"></script>
    <script src="/resources/assets/home/js/isotope.pkgd.min.js"></script>
    <script src="/resources/assets/home/js/ajax-form.js"></script>
    <script src="/resources/assets/home/js/waypoints.min.js"></script>
    <script src="/resources/assets/home/js/jquery.counterup.min.js"></script>
    <script src="/resources/assets/home/js/imagesloaded.pkgd.min.js"></script>
    <script src="/resources/assets/home/js/scrollIt.js"></script>
    <script src="/resources/assets/home/js/jquery.scrollUp.min.js"></script>
    <script src="/resources/assets/home/js/wow.min.js"></script>
    <script src="/resources/assets/home/js/nice-select.min.js"></script>
    <script src="/resources/assets/home/js/jquery.slicknav.min.js"></script>
    <script src="/resources/assets/home/js/jquery.magnific-popup.min.js"></script>
    <script src="/resources/assets/home/js/plugins.js"></script>
    <script src="/resources/assets/home/js/gijgo.min.js"></script>
    <!--contact js-->
    <script src="/resources/assets/home/js/contact.js"></script>
    <script src="/resources/assets/home/js/jquery.ajaxchimp.min.js"></script>
    <script src="/resources/assets/home/js/jquery.form.js"></script>
    <script src="/resources/assets/home/js/jquery.validate.min.js"></script>
    <script src="/resources/assets/home/js/mail-script.js"></script>

    <script src="/resources/assets/home/js/main.js"></script>
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script>
        $('#datepicker').datepicker({
            iconsLibrary: 'fontawesome',
            icons: {
                rightIcon: '<span class="fa fa-caret-down"></span>'
            }
        });
        $('#datepicker2').datepicker({
            iconsLibrary: 'fontawesome',
            icons: {
                rightIcon: '<span class="fa fa-caret-down"></span>'
            }

        });
    $(document).ready(function() {
    $('.js-example-basic-multiple').select2();
});
    </script>
    <script>
        $("#div2").hide();
        $("#btnprocced").on("click", function(){
            $("#div1").hide();
            $("#div2").show();
        });
        
        
    </script>
    
    <script>
        function edit(a,b,c, d,e){
            $("#doctorname").val(b);
            $("#doctor").val(b);
            $("#depart").val(c);
            $("#department").val(c);
            $("#docCode").val(e);

           $("#srcImg").attr("src", "/resources/assets/img/" + d);
           
        };
        
        function swbtn(){
            alert("Request Submited");
        };


    </script>
        
</body>

</html>