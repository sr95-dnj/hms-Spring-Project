<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/jsp/reception/hf/header.jsp"/>

<div class="page-wrapper">
    <div class="chat-main-row">
        <div class="chat-main-wrapper">
            <div class="col-lg-9 message-view chat-view">
                <div class="chat-window">
                    <div class="fixed-header">
                        <div class="navbar">
                            <div class="user-details mr-auto">
                                <div class="float-left user-img m-r-10">
                                    <a href="profile.html" title="Jennifer Robinson"><img src="/resources/assets/img/${doctor.image}" alt="" class="w-40 rounded-circle"><span class="status online"></span></a>
                                </div>
                                <div class="user-info float-left">
                                    <a href="profile.html"><span class="font-bold">${doctor.first_name}</span> <i class="typing-text">Typing...</i></a>
                                    <span class="last-seen">Last seen today at 7:50 AM</span>
                                </div>
                            </div>
                            <div class="search-box">
                                <div class="input-group input-group-sm">
                                    <input type="text" class="form-control" placeholder="Search">
                                    <span class="input-group-append">
                                        <button class="btn" type="button"><i class="fa fa-search"></i></button>
                                    </span>
                                </div>
                            </div>
                            <ul class="nav custom-menu">
                                <li class="nav-item">
                                    <a href="#chat_sidebar" class="nav-link task-chat profile-rightbar float-right" id="task_chat"><i class="fa fa-user"></i></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="voice-call.html"><i class="fa fa-phone"></i></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="video-call.html"><i class="fa fa-video-camera"></i></a>
                                </li>
                                <li class="nav-item dropdown dropdown-action">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-cog"></i></a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a class="dropdown-item" href="javascript:void(0)">Delete Conversations</a>
                                        <a class="dropdown-item" href="javascript:void(0)">Settings</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="chat-contents">
                        <div class="chat-content-wrap">
                            <div class="chat-wrap-inner">
                                <div class="chat-box">
                                    <c:forEach items="${map.chat}" var="c">
                                        <c:forEach items="${map.c}" var="ck">
                                    <div class="chats">
                                        <div class="chat chat-right">
                                            <div class="chat-body">
                                                
                                                <div class="chat-bubble">
                                                    
                                                    <div class="chat-content">
                                                        <p>${c.chating}</p>
                                                        <span class="chat-time">${c.chatingTime}</span>
                                                    </div>
                                                    
                                                </div>
                                                    
                                            </div>
                                        </div>
                                        <div class="chat chat-left">
                                            <div class="chat-avatar">
                                                <a href="profile.html" class="avatar">
                                                    <img alt="Jennifer Robinson" src="assets/img/patient-thumb-02.jpg" class="img-fluid rounded-circle">
                                                </a>
                                            </div>
                                            <div class="chat-body">
                                                
                                                <div class="chat-bubble">
                                                    <div class="chat-content">
                                                        <p>${ck.chating}</p>
                                                        <span class="chat-time">${ck.chatingTime}</span>
                                                    </div>
                                                </div>
                                                
                                            </div>
                                        </div>



                                    </div>
                                        </c:forEach>
                                        </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="chat-footer">
                        <form action="/chatingReception/save" method="post">
                            <div class="">
                                <div class="input-group">
                                    <input type="text" class="form-control" name="chating" placeholder="Type message..."/>
                                    <span class="input-group-append">
                                        <button class="btn btn-primary" type="submit"><i class="fa fa-send"></i></button>
                                    </span>
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
            
        </div>
    </div>
    
    
    
    
    
</div>
</div>
<div class="sidebar-overlay" data-reff=""></div>

<jsp:include page="/WEB-INF/jsp/reception/hf/footer.jsp"/>