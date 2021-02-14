<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="/resources/assets/common/sidenav.css">
        <link rel="stylesheet" href="/resources/assets/common/dropdown.css">
        
        
    </head>
    <body>

        <div class="sidebar">

            <div class="dropdown dropright">
                <button class="dropbtn">Patient 
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="#">Add New</a>
                    <a href="#">Admitted Patient</a>
                    <a href="#">Request for Appointment</a>

                </div>
            </div>

            <div class="dropdown">
                <button class="dropbtn">Doctor 
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="/doctor/view">Doctor List</a>
                    <a href="/doctor/login">Add new Doctor</a>
                    <a href="#">Requested Doctor</a>
                </div>
            </div>

            <div class="dropdown">
                <button class="dropbtn">Department 
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="/dep_list">View Department</a>
                    <a href="/department_create">New Department</a>

                </div>
            </div>

            

            <div class="dropdown">
                <button class="dropbtn">Pathology 
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="/path_list">View Pathology</a>
                    <a href="/pathology_create">New Pathology</a>

                </div>
            </div>

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




    </body>
</html>