<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/dashbord/header.jsp"/>


<div class="page-wrapper">
    <div class="content">
        <div class="row">
            <div class="col-sm-12">
                <h4 class="page-title">Create Invoice</h4>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <form action="/invoice/save" method="post">
                    
                    <div class="row">
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Patient Name<span class="text-danger">*</span></label>
                                <input class="form-control" type="text" name="department" value="${prescription.name}" readonly="">
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Department<span class="text-danger">*</span></label>
                                <input class="form-control" type="text" name="name" value="${prescription.department}" readonly="">
                            </div>
                        </div>

                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Reference Doctor</label>
                                <input class="form-control" type="text" name="doctor" value="${prescription.referenceDoctor}" readonly="">
                            </div>
                        </div>
                        
                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Email</label>
                                <input class="form-control" type="email" name="email">
                            </div>
                        </div>

                        <div class="col-sm-6 col-md-3">
                            <div class="form-group">
                                <label>Patient Address</label>
                                <textarea class="form-control" rows="3" name="patientAddress"></textarea>
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
                                                <input class="form-control" type="text" style="min-width:150px" placeholder="Admitted Date">
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



<jsp:include page="/WEB-INF/jsp/common/dashbord/footer.jsp"/>