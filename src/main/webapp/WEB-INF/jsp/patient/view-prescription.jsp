<jsp:include page="/WEB-INF/jsp/patient/hf/header.jsp"/>

<div class="page-wrapper" id="printInvoicePage">
    <div class="content">
        <div class="row">
            <div class="col-sm-5 col-4">
                <h4 class="page-title">Pescription</h4>
            </div>
            <div class="col-sm-7 col-8 text-right m-b-30">
                <div class="btn-group btn-group-sm">
                    <button onclick="printInvoice('printInvoicePage')" class="btn btn-white">CSV</button>
                    <button onclick="printInvoice('printInvoicePage')" class="btn btn-white">PDF</button>
                    <button onclick="printInvoice('printInvoicePage')" class="btn btn-white"><i class="fa fa-print fa-lg"></i> Print</button>
                </div>
            </div>

        </div>
        <form action="/prescription/save" method="post">
            <div class="row">
                <div class="col-md-12">
                    <div class="card-box">
                        <h4 class="payslip-title">Prescription for ${p.name}</h4>
                        <div class="row">
                            <div class="col-sm-6 m-b-20">
                                <img src="assets/img/logo-dark.png" class="inv-logo" alt="">
                                <ul class="list-unstyled mb-0">
                                    <li>PreClinic</li>
                                    <li>3864 Quiet Valley Lane,</li>
                                    <li>Sherman Oaks, CA, 91403</li>
                                </ul>
                            </div>
                            <div class="col-sm-6 m-b-20">
                                <div class="invoice-details">


                                    <h3 class="text-uppercase"><input type="text" class="border-0" value="${p.referenceDoctor}" name="referenceDoctor"/></h3>
                                    <h4 class="text-uppercase"><input type="text" class="border-0" value="${p.department}" name="department"/></h4>
                                    <ul class="list-unstyled">
                                        <li>Current Date: <input type="date" class="border-0" name="pDate" value="${pDate}"/><span></span></li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-lg-12 m-b-20">
                                <ul class="list-unstyled">
                                    <strong>Patient Details</strong>
                                    <li> <h5 class="mb-0"><strong><input type="text" class="border-0" value="${p.name}" name="name"/></strong></h5></li>
                                    <li><span><input type="text" class="border-0" value="${p.address}" name="address"/></span></li>
                                    <li><input type="text" name="disease" value="${p.disease}" class="border-0"/></li>
                                    <li><input type="text" name="mobile" value="${p.mobile}" class="border-0"/></li>
                                   
                                </ul>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-4">
                                <div>
                                    <h4 class="m-b-10"><strong>Pathology</strong></h4>
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th>Pathology</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1.  <input type="text" class="border-0" name="pathology1" value="${p.pathology1}"/></td>
                                            </tr>
                                            <tr>
                                                <td>2.  <input type="text" class="border-0" name="pathology2" value="${p.pathology2}"/></td>
                                            </tr>
                                            <tr>
                                                <td>3.  <input type="text" class="border-0" name="pathology3"  value="${p.pathology3}"/></td>
                                            </tr>
                                            <tr>
                                                <td>4.  <input type="text" class="border-0" name="pathology4" value="${p.pathology4}"/></td>
                                            </tr>
                                            <tr>
                                                <td>5.  <input type="text" class="border-0" name="pathology5" value="${p.pathology5}"/></td>
                                            </tr>
                                            <tr>
                                                <td>6.  <input type="text" class="border-0"/></td>
                                            </tr>
                                            <tr>
                                                <td>7.  <input type="text" class="border-0"/></td>
                                            </tr>
                                            <tr>
                                                <td>8.  <input type="text" class="border-0"/></td>
                                            </tr>

                                            <tr>
                                                <td></td>
                                            </tr>


                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col-sm-8">
                                <div>
                                    <h4 class="m-b-10"><strong>Medicine</strong></h4>
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th colspan="10">Medicine</th>  
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td colspan="5"> <strong>Medicine Name</strong></td>

                                                <td> <strong>M</strong></td>
                                                <td> <strong>A</strong></td>
                                                <td> <strong>E</strong></td>
                                                <td> <strong>B</strong></td>
                                                <td> <strong>A</strong></td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">1.  <input type="text" class="border-0" name="medicine1" value="${p.medicine1}"/></td>

                                                <td> ${p.morning1}</td>
                                                <td> ${p.afternoon1}</td>
                                                <td> ${p.evening1}</td>
                                                <td> ${p.before1}</td>
                                                <td> ${p.after1}</td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">2.  <input type="text" class="border-0" name="medicine2" value="${p.medicine2}"/></td>

                                                <td>  ${p.morning2}</td>
                                                <td>  ${p.afternoon2}</td>
                                                <td>  ${p.evening2}</td>
                                                <td>  ${p.before2}</td>
                                                <td>  ${p.after2}</td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">3.  <input type="text" class="border-0" name="medicine3" value="${p.medicine3}"/></td>

                                                <td>  ${p.morning3}</td>
                                                <td>  ${p.afternoon3}</td>
                                                <td>  ${p.evening3}</td>
                                                <td>  ${p.before3}</td>
                                                <td>  ${p.after3}</td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">4.  <input type="text" class="border-0" name="medicine4" value="${p.medicine4}"/></td>

                                                <td>  ${p.morning4}</td>
                                                <td>  ${p.afternoon4}</td>
                                                <td>  ${p.evening4}</td>
                                                <td>  ${p.before4}</td>
                                                <td>  ${p.after4}</td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">5.  <input type="text" class="border-0" name="medicine5" value="${p.medicine5}"/></td>

                                                <td>  ${p.morning5}</td>
                                                <td>  ${p.afternoon5}</td>
                                                <td>  ${p.evening5}</td>
                                                <td>  ${p.before5}</td>
                                                <td>  ${p.after5}</td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">6.  <input type="text" class="border-0"/></td>

                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                            </tr>
                                            <tr>
                                                <td colspan="5">7.  <input type="text" class="border-0"/></td>

                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                                <td>  </td>
                                            </tr>


                                            <tr>
                                                <td colspan="10"></td>


                                            </tr>

                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            
                        </div>
                               
                                   
                    </div>
                </div>
            </div>
        </form>
    </div>
    <div class="notification-box">
        <div class="msg-sidebar notifications msg-noti">
            <div class="topnav-dropdown-header">
                <span>Messages</span>
            </div>
            <div class="drop-scroll msg-list-scroll" id="msg_list">
                <ul class="list-box">
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">R</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Richard Miles </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item new-message">
                                <div class="list-left">
                                    <span class="avatar">J</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">John Doe</span>
                                    <span class="message-time">1 Aug</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">T</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Tarah Shropshire </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">M</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Mike Litorus</span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">C</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Catherine Manseau </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">D</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Domenic Houston </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">B</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Buster Wigton </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">R</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Rolland Webber </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">C</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author"> Claire Mapes </span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">M</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Melita Faucher</span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">J</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Jeffery Lalor</span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">L</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Loren Gatlin</span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="chat.html">
                            <div class="list-item">
                                <div class="list-left">
                                    <span class="avatar">T</span>
                                </div>
                                <div class="list-body">
                                    <span class="message-author">Tarah Shropshire</span>
                                    <span class="message-time">12:28 AM</span>
                                    <div class="clearfix"></div>
                                    <span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
                                </div>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="topnav-dropdown-footer">
                <a href="chat.html">See all messages</a>
            </div>
        </div>
    </div>
</div>

<div class="sidebar-overlay" data-reff=""></div>

<script>
    function printInvoice(a){
        var backup = document.body.innerHTML;
        var divContent = document.getElementById(a).innerHTML;
        document.body.innerHTML = divContent;
        window.print();
        document.body.innerHTML = backup;
    }
        
</script>
<jsp:include page="/WEB-INF/jsp/patient/hf/footer.jsp"/>