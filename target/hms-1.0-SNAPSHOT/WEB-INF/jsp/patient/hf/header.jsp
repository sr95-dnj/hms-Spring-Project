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
        
        <div class="dropdown mobile-user-menu float-right">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
            <div class="dropdown-menu dropdown-menu-right">
                <a class="dropdown-item" href="/admin/profile">My Profile</a>
                <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                <a class="dropdown-item" href="settings.html">Settings</a>
                <a class="dropdown-item" href="/admin/loginPage">Logout</a>
            </div>
        </div>
    </div>
    <div class="sidebar" id="sidebar">
        <div class="sidebar-inner slimscroll">
            <div id="sidebar-menu" class="sidebar-menu">
                <ul>
                    <li class="menu-title">Main</li>
                    
                    <li class="active">
                        <a href="/patient/patient-prescription/${map.i.id}"><i class="fa fa-book"></i> <span>Prescription</span></a>
                    </li>
                    <li>
                        <a href="/patient/patient-invoice/${map.i.id}"><i class="fa fa-barcode"></i> <span>Invoice</span></a>
                    </li>
                    
                    
                    

                   
                    
                   

                    
                </ul>
            </div>
        </div>
    </div>