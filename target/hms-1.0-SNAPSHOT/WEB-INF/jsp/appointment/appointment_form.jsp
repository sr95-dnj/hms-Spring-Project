<jsp:include page="/WEB-INF/jsp/common/appoint/header.jsp"/>
<jsp:include page="/WEB-INF/jsp/navbar/navbar.jsp"/>
<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
    <div class="wrapper wrapper--w790">
        <div class="card card-5">
            <div class="card-heading">
                <h2 class="title">Appointment Form</h2>
            </div>
            <div class="card-body">
                <form method="POST">
                    <div class="form-row">
                        <div class="name">id</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="id">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Name</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="name">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Address</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="address">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Mobile</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="mobile">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-row">
                        <div class="name">Subject</div>
                        <div class="value">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="subject">
                                        <option disabled="disabled" selected="selected">Choose option</option>
                                        <option>Subject 1</option>
                                        <option>Subject 2</option>
                                        <option>Subject 3</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div>
                        <button class="btn btn--radius-2 btn--red" type="submit">Apply</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/appoint/footer.jsp"/>

