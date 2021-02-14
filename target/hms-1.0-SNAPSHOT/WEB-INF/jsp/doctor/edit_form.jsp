<jsp:include page="/WEB-INF/jsp/common/appoint/header.jsp"/>
<jsp:include page="/WEB-INF/jsp/navbar/navbar.jsp"/>
<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
    <div class="wrapper wrapper--w790">
        <div class="card card-5">
            <div class="card-heading">
                <h2 class="title">Apply For Doctor</h2>
            </div>
            <div class="card-body">
                <form method="POST" action="/doctor/update">
                    <div class="form-row">
                        <div class="name">id</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="id" value="${d.id}">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Username</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="username" value="${d.username}">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Name</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="name" value="${d.name}">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Address</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="address" value="${d.address}">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-row">
                        <div class="name">Mobile</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="mobile" value="${d.mobile}">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-row">
                        <div class="name">Email</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="email" name="email" value="${d.email}">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-row">
                        <div class="name">Specialist</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="text" name="specialist" value="${d.specialist}">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-row">
                        <div class="name">Password</div>
                        <div class="value">
                            <div class="input-group">
                                <input class="input--style-5" type="password" name="password" value="${d.password}">
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