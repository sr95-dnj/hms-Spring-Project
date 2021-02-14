<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/reception/hf/header.jsp"/>


<div class="page-wrapper">
    <div class="content">
        <div class="row">
            <div class="col-sm-12">
                <h4 class="page-title">Create Invoice</h4>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <form action="/reception/create-invoice" method="post">
                    
                    <div class="row">
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Patient Name<span class="text-danger">*</span></label>
                                <input class="form-control" type="text" name="name" value="${prescription.name}" readonly="">
                            </div>
                            
                            <input type="hidden" name="admitedDate" value="${prescription.admitedDate}"/>
                            <input type="hidden" name="age" value="${prescription.age}"/>
                            <input type="hidden" name="bloodGroup" value="${prescription.bloodGroup}"/>
                            <input type="hidden" name="disease" value="${prescription.disease}"/>
                            <input type="hidden" name="roomNo" value="${prescription.roomNo}"/>
                            <input type="hidden" name="comment" value="${prescription.comment}"/>
                            <input type="hidden" name="pDate" value="${prescription.pDate}"/>
                            
                            <input type="hidden" name="pathology1" value="${prescription.pathology1}"/>
                            <input type="hidden" name="pathology2" value="${prescription.pathology2}"/>
                            <input type="hidden" name="pathology3" value="${prescription.pathology3}"/>
                            <input type="hidden" name="pathology4" value="${prescription.pathology4}"/>
                            <input type="hidden" name="pathology5" value="${prescription.pathology5}"/>
                            
                            <input type="hidden" name="medicine1" value="${prescription.medicine1}"/>
                            <input type="hidden" name="medicine2" value="${prescription.medicine2}"/>
                            <input type="hidden" name="medicine3" value="${prescription.medicine3}"/>
                            <input type="hidden" name="medicine4" value="${prescription.medicine4}"/>
                            <input type="hidden" name="medicine5" value="${prescription.medicine5}"/>
                            
                            <input type="hidden" name="morning1" value="${prescription.morning1}"/>
                            <input type="hidden" name="morning2" value="${prescription.morning2}"/>
                            <input type="hidden" name="morning3" value="${prescription.morning3}"/>
                            <input type="hidden" name="morning4" value="${prescription.morning4}"/>
                            <input type="hidden" name="morning5" value="${prescription.morning5}"/>
                            
                            <input type="hidden" name="afternoon1" value="${prescription.afternoon1}"/>
                            <input type="hidden" name="afternoon2" value="${prescription.afternoon2}"/>
                            <input type="hidden" name="afternoon3" value="${prescription.afternoon3}"/>
                            <input type="hidden" name="afternoon5" value="${prescription.afternoon4}"/>
                            <input type="hidden" name="afternoon5" value="${prescription.afternoon5}"/>
                            
                            <input type="hidden" name="evening1" value="${prescription.evening1}"/>
                            <input type="hidden" name="evening2" value="${prescription.evening2}"/>
                            <input type="hidden" name="evening3" value="${prescription.evening3}"/>
                            <input type="hidden" name="evening4" value="${prescription.evening4}"/>
                            <input type="hidden" name="evening5" value="${prescription.evening5}"/>
                            
                            <input type="hidden" name="before1" value="${prescription.before1}"/>
                            <input type="hidden" name="before2" value="${prescription.before2}"/>
                            <input type="hidden" name="before3" value="${prescription.before3}"/>
                            <input type="hidden" name="before4" value="${prescription.before4}"/>
                            <input type="hidden" name="before5" value="${prescription.before5}"/>
                            
                            <input type="hidden" name="after1" value="${prescription.after1}"/>
                            <input type="hidden" name="after2" value="${prescription.after2}"/>
                            <input type="hidden" name="after3" value="${prescription.after3}"/>
                            <input type="hidden" name="after4" value="${prescription.after4}"/>
                            <input type="hidden" name="after5" value="${prescription.after5}"/>
                            
                            <input type="hidden" name="status" value="${prescription.status}"/>
                            
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Department<span class="text-danger">*</span></label>
                                <input class="form-control" type="text" name="department" value="${prescription.department}" readonly="">
                            </div>
                        </div>

                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Reference Doctor</label>
                                <input class="form-control" type="text" name="referenceDoctor" value="${prescription.referenceDoctor}" readonly="">
                            </div>
                        </div>
                        
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Email</label>
                                <input class="form-control" type="email" readonly="" name="email" value="${prescription.email}">
                            </div>
                        </div>

                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Patient Address</label>
                                <textarea class="form-control" rows="3" name="address" >${prescription.address}</textarea>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Billing Address</label>
                                <textarea class="form-control" rows="3" name="billingAddress"></textarea>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Invoice date <span class="text-danger">*</span></label>
                                <div >
                                    <input class="form-control datetimepicker" type="date" name="invoiceDate">
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Mobile <span class="text-danger">*</span></label>
                                <div>
                                    <input class="form-control"  type="text" name="mobile" value="${prescription.mobile}" readonly="">
                                </div>
                            </div>
                        </div>
                    </div>
                  
                    <div class="row">
                        <div class="col-md-12 col-sm-12">
                            <div class="table-responsive">
                                <table id="table" class="table table-hover table-white">
                                    <thead>
                                        <tr>
                                            <th style="width: 20px">#</th>
                                            <th class="col-sm-2">Item</th>
                                            <th class="col-md-6">Description</th>
                                            <th style="width:100px;">Unit Cost</th>
                                            <th style="width:80px;">Qty</th>
                                            <th>Amount</th>
                                            <th> </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>
                                                <input class="form-control" readonly="" type="text" style="min-width:150px" value="Bed Charge">
                                            </td>
                                            <td>
                                                <input class="form-control" type="text" style="min-width:150px" placeholder="Admitted Date" value="${prescription.admitedDate}">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:100px" type="text">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:80px" type="text" placeholder="days">
                                            </td>
                                            <td class="form-group">
                                                <input class="form-control prc" style="width:120px" type="number" name="roomCharge" id="roomCharge">
                                            </td>
                                            <td><a href="javascript:void(0)" class="text-success font-18" title="Add"><i class="fa fa-plus"></i></a></td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>
                                                <input class="form-control" readonly="" type="text" style="min-width:150px" value="Doctor Charge">
                                            </td>
                                            <td>
                                                <input class="form-control" type="text" style="min-width:150px">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:100px" type="text">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:80px" type="text">
                                            </td>
                                            <td class="form-group">
                                                <input class="form-control prc" style="width:120px" type="number" name="doctorCharge" id="doctorCharge">
                                            </td>
                                            <td><a href="javascript:void(0)" class="text-success font-18" title="Add"><i class="fa fa-plus"></i></a></td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>
                                                <input class="form-control" readonly="" type="text" style="min-width:150px" value="Pathology Charge">
                                            </td>
                                            <td>
                                                <input class="form-control" type="text" style="min-width:150px">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:100px" type="text">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:80px" type="text">
                                            </td>
                                            <td class="form-group">
                                                <input class="form-control prc" style="width:120px" type="text" name="pathologyCharge" id="pathologyCharge">
                                            </td>
                                            <td><a href="javascript:void(0)" class="text-success font-18" title="Add"><i class="fa fa-plus"></i></a></td>
                                        </tr>
                                        <tr>
                                            <td>4</td>
                                            <td>
                                                <input class="form-control" type="text" style="min-width:150px" placeholder="Others Charge">
                                            </td>
                                            <td>
                                                <input class="form-control" type="text" style="min-width:150px">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:100px" type="text">
                                            </td>
                                            <td>
                                                <input class="form-control" style="width:80px" type="text">
                                            </td>
                                            <td class="form-group">
                                                <input class="form-control prc" style="width:120px" type="text" name="othersCharge" id="othersCharge">
                                            </td>
                                            <td><a href="javascript:void(0)" class="text-success font-18" title="Add"><i class="fa fa-plus"></i></a></td>
                                        </tr>

                                    </tbody>
                                </table>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-hover table-white">
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td class="text-right">Total</td>
                                            <td style="text-align: right; padding-right: 30px;width: 230px">
                                                <input class="form-control text-right" type="number" name="totalAmount" id="totalAmount" value="0">
                                            </td>
                                        </tr>

                                        <tr>
                                            <td colspan="5" class="text-right">
                                                Discount %
                                            </td>
                                            <td style="text-align: right; padding-right: 30px;width: 230px">
                                                <input class="form-control text-right" type="number" name="discount" id="discount">
                                            </td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Other Information</label>
                                        <textarea class="form-control" name="others"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="text-center m-t-20">
                        <button class="btn btn-grey submit-btn m-r-10">Save & Send</button>
                        <button class="btn btn-primary submit-btn">Save</button>
                    </div>
                </form>
            </div>
        </div>
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



<script src="/resources/vendor/js/jquery.min.js"></script>
<script>

//    $('.form-group').on('input', '.prc', function(){
//        var totalSum = 0;
//        $('.form-group .prc').each(function(){
//            var inputVal =$(this).val();
//            if($.isNumeric(inputVal)){
//                totalSum += parseFloat(inputVal);
//            }
//        });
//        $('#result').text(totalSum);
//    });



    
      $("#roomCharge").focusout(function () {
        var roomCharge = $("#roomCharge").val();
        var totalAmount = $("#totalAmount").val();
        var totalValue = parseInt(totalAmount) + parseInt(roomCharge);
        $("#totalAmount").val("");
        $("#totalAmount").val(totalValue);
    });


    $("#roomCharge").focusin(function () {
        if (parseInt($("#roomCharge").val()) > 0) {
            var roomCharge = $("#roomCharge").val();
            $("#roomCharge").val("");
            var totalAmount = $("#totalAmount").val();
            var totalValue = parseInt(totalAmount) - parseInt(roomCharge);
            $("#totalAmount").val("");
            $("#totalAmount").val(totalValue);
        }
    });


    $("#doctorCharge").focusout(function () {
        var doctorCharge = $("#doctorCharge").val();
        var totalAmount = $("#totalAmount").val();
        var totalValue = parseInt(totalAmount) + parseInt(doctorCharge);
        $("#totalAmount").val("");
        $("#totalAmount").val(totalValue);
    });


    $("#doctorCharge").focusin(function () {
        if (parseInt($("#doctorCharge").val()) > 0) {
            var doctorCharge = $("#doctorCharge").val();
            $("#doctorCharge").val("");
            var totalAmount = $("#totalAmount").val();
            var totalValue = parseInt(totalAmount) - parseInt(doctorCharge);
            $("#totalAmount").val("");
            $("#totalAmount").val(totalValue);
        }
    });


    $("#pathologyCharge").focusout(function () {
        var pathologyCharge = $("#pathologyCharge").val();
        var totalAmount = $("#totalAmount").val();
        var totalValue = parseInt(totalAmount) + parseInt(pathologyCharge);
        $("#totalAmount").val("");
        $("#totalAmount").val(totalValue);
    });


    $("#pathologyCharge").focusin(function () {
        if (parseInt($("#pathologyCharge").val()) > 0) {
            var pathologyCharge = $("#pathologyCharge").val();
            $("#pathologyCharge").val("");
            var totalAmount = $("#totalAmount").val();
            var totalValue = parseInt(totalAmount) - parseInt(pathologyCharge);
            $("#totalAmount").val("");
            $("#totalAmount").val(totalValue);
        }
    });
    
      $("#othersCharge").focusout(function () {
        var othersCharge = $("#othersCharge").val();
        var totalAmount = $("#totalAmount").val();
        var totalValue = parseInt(totalAmount) + parseInt(othersCharge);
        $("#totalAmount").val("");
        $("#totalAmount").val(totalValue);
    });


    $("#othersCharge").focusin(function () {
        if (parseInt($("#othersCharge").val()) > 0) {
            var othersCharge = $("#othersCharge").val();
            $("#othersCharge").val("");
            var totalAmount = $("#totalAmount").val();
            var totalValue = parseInt(totalAmount) - parseInt(othersCharge);
            $("#totalAmount").val("");
            $("#totalAmount").val(totalValue);
        }
    });
    
    
    
    

    



</script>



<jsp:include page="/WEB-INF/jsp/reception/hf/footer.jsp"/>