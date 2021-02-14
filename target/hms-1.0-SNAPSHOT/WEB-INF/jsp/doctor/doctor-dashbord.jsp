<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/doctor/hf/header.jsp"/>


<div class="page-wrapper">
    <div class="content">
        

        <div class="row">
            <div class="col-12 col-md-6 col-lg-8 col-xl-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="card-title d-inline-block">Upcoming Appointments</h4> 
                    </div>
                    <div class="card-body p-0">
                        <div class="table-responsive">
                            <table class="table mb-0">
                                <thead class="d-none">
                                    <tr>
                                        <th>Patient Name</th>
                                        <th>Doctor Name</th>
                                        <th>Timing</th>
                                        <th class="text-right">Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${map.appList}" var="appoint">

                                    <tr>
                                        <td style="min-width: 200px;">
                                            <a class="avatar" href="profile.html">S</a>
                                            <h2><a href="profile.html">${appoint.name}<span>${appoint.address}</span></a></h2>
                                        </td>                 
                                        <td>
                                            <h5 class="time-title p-0">Appointment With</h5>
                                            <p>${appoint.doctor}</p>
                                        </td>
                                        <td>
                                            <h5 class="time-title p-0">Mobile</h5>
                                            <p>${appoint.mobile}</p>
                                        </td>
                                        <td>
                                            <h5 class="time-title p-0">Timing</h5>
                                            <p>${appoint.appointDate}</p>
                                        </td>
                                        <td class="text-right">
                                            <a href="/approve/app-pres/${appoint.id}" class="btn btn-outline-primary take-btn">Take up</a>
                                        </td>
                                    </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>



        </div>

    </div>

    <div class="sidebar-overlay" data-reff=""></div>

    <jsp:include page="/WEB-INF/jsp/doctor/hf/footer.jsp"/>