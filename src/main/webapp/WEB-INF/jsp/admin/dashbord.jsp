<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/resources/assets/common/sidenav.css">
<link rel="stylesheet" href="/resources/assets/common/dash.css">

</head>
<body>

<div class="sidenav">
    
   <a href="#contact">Search</a>
    
  <button class="dropdown-btn">Patient 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="#">Link 1</a>
    <a href="#">Link 2</a>
    <a href="#">Link 3</a>
  </div>
   
   <button class="dropdown-btn">Doctor 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="/doctor/view">View Doctor</a>
    <a href="/doctor/login">New Doctor</a>
    <a href="#">Requested Doctor</a>
  </div>
   
   <button class="dropdown-btn">Department 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="/dep_list">View Department</a>
    <a href="/department_create">New Department</a>
    >
  </div>
   
   <button class="dropdown-btn">Pathology 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="/path_list">View Pathology</a>
    <a href="/pathology_create">New Pathology</a>
   
  </div>
   
   <button class="dropdown-btn">Reception 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="/reception/reception_view">View Reception</a>
    <a href="/reception/add">New Reception</a>
    
  </div>
  <a href="#contact">Search</a>
</div>

<div class="main">
  <div class="information">
                <div class="t1">
                    <div class="r1">
                        <h1 style="padding-top: 30pt; text-align: center">Total Admitted Patient</h1>
                    </div>
                    <a href="/doctor/view">
                        <div class="r2">
                            <h1 style="padding-top: 30pt; text-align: center">Total Doctor</h1>
                        </div>
                    </a>
                </div>
                <div class="t2">
                    <div class="b1">
                        <h1 style="padding-top: 30pt; text-align: center">Request for Appointment</h1>
                    </div>
                    <div class="b2">
                        <h1 style="padding-top: 30pt; text-align: center">Total Admited Patient</h1>
                    </div>
                </div>
            </div>
</div>

<script>
/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
var dropdown = document.getElementsByClassName("dropdown-btn");
var i;

for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() {
  this.classList.toggle("active");
  var dropdownContent = this.nextElementSibling;
  if (dropdownContent.style.display === "block") {
  dropdownContent.style.display = "none";
  } else {
  dropdownContent.style.display = "block";
  }
  });
}
</script>

</body>
</html> 