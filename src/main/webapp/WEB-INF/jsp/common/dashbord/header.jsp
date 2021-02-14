<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">



<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/bootstrap-datetimepiker.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/fullcalendar.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/assets/dashbord/assets/css/tagsinput.css">
    <!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
    <div class="main-wrapper">
    <div class="header">
        <div class="header-left">
            <a href="index-2.html" class="logo">
                <img src="/resources/assets/dashbord/assets/img/logo.png" width="35" height="35" alt=""> <span>H.M.S</span>
            </a>
        </div>
        <a id="toggle_btn" href="javascript:void(0);"><i class="fa fa-bars"></i></a>
        <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
        <ul class="nav user-menu float-right">
            
            <li class="nav-item dropdown has-arrow">
                <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                    <span class="user-img">
                        <img class="rounded-circle" src="/resources/assets/dashbord/assets/img/user.jpg" width="24" alt="Admin">
                        <span class="status online"></span>
                    </span>
                    <span>Admin</span>
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="profile.html">My Profile</a>
                    <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                    <a class="dropdown-item" href="settings.html">Settings</a>
                    <a class="dropdown-item" href="/admin/loginPage">Logout</a>
                </div>
            </li>
        </ul>
        <div class="dropdown mobile-user-menu float-right">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
            <div class="dropdown-menu dropdown-menu-right">
                <a class="dropdown-item" href="/admin/profile">My Profile</a>
                <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                <a class="dropdown-item" href="settings.html">Settings</a>
                <a class="dropdown-item" href="/login">Logout</a>
            </div>
        </div>
    </div>
    <div class="sidebar" id="sidebar">
        <div class="sidebar-inner slimscroll">
            <div id="sidebar-menu" class="sidebar-menu">
                <ul>
                    <li class="menu-title">Main</li>
                    <li class="active">
                        <a href="/admin/dash"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                    </li>
                    
                    <li>
                        <a href="/doctor/doctor_list"><i class="fa fa-user-md"></i> <span>Doctors</span></a>
                    </li>
                    <li>
                        <a href="/department/dep_list"><i class="fa fa-hospital-o"></i> <span>Departments</span></a>
                    </li>
                    <li>
                        <a href="/pathology/list"><i class="fa fa-hospital-o"></i> <span>Pathology</span></a>
                    </li>
                    <li>
                        <a href="/patient/patient_list"><i class="fa fa-wheelchair"></i> <span>Patients</span></a>
                    </li>
                    <li>
                        <a href="/appointment/list"><i class="fa fa-calendar"></i> <span>Appointments</span></a>
                    </li>
                    <li>
                        <a href="/approve/list"><i class="fa fa-calendar"></i> <span>Approved Appointments</span></a>
                    </li>

                    <li >
                        <a href="/admin/view-prescription"><i class="fa fa-cube"></i> <span>View All Prescription</span></a>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fa fa-user"></i> <span> Employees </span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            

                            <li><a href="/applyDoctor/applyDoctorList">Apply Doctor</a></li>
                            <li><a href="/holiday/list">Holidays</a></li>

                        </ul>
                    </li>
                    <li class="submenu">
                        <a href="#"><i class="fa fa-money"></i> <span> Accounts </span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            <li><a href="/invoice/list">Invoices</a></li>
                            

                        </ul>
                    </li>
                    

                    <li class="submenu">
                        <a href="#"><i class="fa fa-envelope"></i> <span> Email</span> <span class="menu-arrow"></span></a>
                        <ul style="display: none;">
                            <li><a href="/adminInbox/mainCompose">Compose Mail</a></li>
                            <li class="active">
                            <a href="/adminInbox/inbox">Inbox <span class="mail-count">(21)</span></a>
                        </li>
                        
                        <li>
                            <a href="/adminInbox/sentBox">Sent Mail</a>
                        </li>
                   
                        </ul>
                    </li>

                    <li>
                        <a href="/admin/loginPage"><i class="fa fa-cube"></i> <span>Logout</span></a>
                    </li>

                    
                </ul>
            </div>
        </div>
    </div>