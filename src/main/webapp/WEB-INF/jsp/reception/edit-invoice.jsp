<jsp:include page="/WEB-INF/jsp/reception/hf/header.jsp"/>

        <div class="page-wrapper">
            <div class="content">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">Edit Invoice</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form action="/invoice/update-invoice" method="post">
                            <div class="row">
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Patient Name <span class="text-danger">*</span></label>
                                        <input class="form-control" type="text" name="name" value="${invoice.name}">
                                        <input class="form-control" type="hidden" name="id" value="${invoice.id}">
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
                                        <label>Department <span class="text-danger">*</span></label>
                                        <input class="form-control" name="department" type="text" value="${invoice.department}">
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Reference Doctor</label>
                                        <input class="form-control" name="referenceDoctor" type="text" value="${invoice.referenceDoctor}">
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input class="form-control" name="email" type="text" value="${invoice.email}">
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Patient Address</label>
                                        <textarea class="form-control" name="address" rows="3" >${invoice.address}</textarea>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Billing Address</label>
                                        <textarea class="form-control" name="billingAddress" rows="3">${invoice.billingAddress}</textarea>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Invoice date <span class="text-danger">*</span></label>
                                        <div class="cal-icon">
                                            <input class="form-control datetimepicker" name="invoiceDate" type="text" value="${invoice.invoiceDate}">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-3">
                                    <div class="form-group">
                                        <label>Mobile <span class="text-danger">*</span></label>
                                        <div class="cal-icon">
                                            <input class="form-control datetimepicker" name="mobile" type="text" value="${invoice.mobile}">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-sm-12">
                                    <div class="table-responsive">
                                        <table class="table table-hover table-white">
                                            <thead>
                                                <tr>
                                                    <th style="width: 20px">#</th>
                                                    <th class="col-sm-2">Item</th>
                                                    <th class="col-md-6">Description</th>
                                                    <th style="width:100px;">Unit Cost</th>
                                                    <th style="width:80px;">Qty</th>
                                                    <th>Amount</th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>1</td>
                                                    <td>
                                                        <input class="form-control" type="text" readonly="" value="Room Charge" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" type="text" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:100px" type="text">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:80px" type="text" value=>
                                                    </td>
                                                    <td>
                                                        <input class="form-control form-amt" name="roomCharge" style="width:120px" type="text" value="${invoice.roomCharge}">
                                                    </td>
                                                   
                                                </tr>
                                                <tr>
                                                    <td>2</td>
                                                    <td>
                                                        <input class="form-control" type="text" readonly="" value="Doctor Service Charge" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" type="text" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:100px" type="text">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:80px" type="text" value=>
                                                    </td>
                                                    <td>
                                                        <input class="form-control form-amt" name="doctorCharge" style="width:120px" type="text" value="${invoice.doctorCharge}">
                                                    </td>
                                                </tr>
						<tr>
                                                    <td>3</td>
                                                    <td>
                                                        <input class="form-control" type="text" value="Pathology Charge" readonly="" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" type="text" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:100px" type="text">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:80px" type="text" value=>
                                                    </td>
                                                    <td>
                                                        <input class="form-control form-amt" name="pathologyCharge" style="width:120px" type="text" value="${invoice.pathologyCharge}">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>4</td>
                                                    <td>
                                                        <input class="form-control" type="text" readonly="" value="Others Charge" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" type="text" style="min-width:150px">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:100px" type="text">
                                                    </td>
                                                    <td>
                                                        <input class="form-control" style="width:80px" type="text" value=>
                                                    </td>
                                                    <td>
                                                        <input class="form-control form-amt" name="othersCharge" style="width:120px" type="text" value="${invoice.othersCharge}">
                                                    </td>
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
                                                    <td style="text-align: right; width: 230px">
                                                        <input class="form-control text-right" type="number" name="totalAmount" id="totalAmount" value="${invoice.totalAmount}"></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="5" style="text-align: right">Tax</td>
                                                    <td style="text-align: right;width: 230px">
                                                        <input class="form-control text-right form-amt" value="0" readonly="" type="text">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td colspan="5" style="text-align: right">
                                                        Discount %
                                                    </td>
                                                    <td style="text-align: right; width: 230px">
                                                        <input class="form-control text-right" name="discount" value="${invoice.discount}" type="text">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td colspan="5" style="text-align: right; font-weight: bold">
                                                        Grand Total
                                                    </td>
                                                    <td style="text-align: right; font-weight: bold; font-size: 16px;width: 230px">
                                                        ${invoice.grandTotal}
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>Other Information</label>
                                                <textarea class="form-control" rows="4" name="others">${invoice.others}</textarea>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="text-center m-t-20">
                                <button class="btn btn-primary submit-btn">Update Invoice</button>
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
<jsp:include page="/WEB-INF/jsp/reception/hf/footer.jsp"/>
