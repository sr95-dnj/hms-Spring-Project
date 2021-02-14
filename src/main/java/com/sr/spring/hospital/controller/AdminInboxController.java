/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IAdminInboxControllerImpl;
import com.sr.spring.hospital.dao.impl.IAdminInboxDaoImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IDoctorInboxDaoImpl;
import com.sr.spring.hospital.model.AdminInbox;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.model.DoctorInbox;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@RestController
@RequestMapping(value = "adminInbox")
public class AdminInboxController implements IAdminInboxControllerImpl{

    
    @Autowired
    IAdminInboxDaoImpl adminInboxDao;
    
    @Autowired
    IDoctorInboxDaoImpl doctorInboxDao;
    
    @Autowired
    IDoctorDAOImpl docDao;
    
    
    @Autowired
    IDoctorServiceImpl doctorDao;
    
    
    @RequestMapping(value = "/compose", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
       Map<String, Object> map = new HashMap<String, Object>(); 
       List<Doctor> doc = doctorDao.getList();
       map.put("emails", doc);
       return new ModelAndView("/admin_dashbord/compose", "map", map);
    
    }
    
    @RequestMapping(value = "/mainCompose")
    public ModelAndView mainCompose(){
        Map<String, Object> map = new HashMap<String, Object>(); 
       List<Doctor> doc = doctorDao.getList();
       map.put("emails", doc);
      
        return new ModelAndView("/admin_dashbord/main-compose", "map", map);
    }

    
   @RequestMapping(value = "/save", method = RequestMethod.POST) 
    @Override
    public ModelAndView create(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String message = request.getParameter("message");
        String email = request.getParameter("email");
        String toDoc = request.getParameter("toDoctor");
        String subject = request.getParameter("subject");
        String doctorCode = request.getParameter("doctorCode");
        String dateTime = LocalDateTime.now().toString();
        
       AdminInbox inbox = new AdminInbox();
       inbox.setEmail(email);
       inbox.setToDoctor(toDoc);
       inbox.setMessage(message);
       inbox.setSubject(subject);
       inbox.setDoctorCode(doctorCode);
       inbox.setDateTime(dateTime);
       
       adminInboxDao.save(inbox);
        
        
        
       
        
        
       
        return new ModelAndView("redirect:/adminInbox/inbox");
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/emails", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
       
       
        return new ModelAndView("/admin_dashbord/compose"); }
    
    
    @RequestMapping(value = "/inbox")
    public ModelAndView mailInbox(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<DoctorInbox> inbox = doctorInboxDao.getList();
        map.put("inbox", inbox);
        
        return new ModelAndView("/admin_dashbord/inbox", "map", map);
    }
    
    @RequestMapping(value = "/sentBox", method = RequestMethod.GET)
    public ModelAndView sentBox(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<AdminInbox> sentBox = adminInboxDao.getList();
        map.put("inbox", sentBox);
        
        return new ModelAndView("/admin_dashbord/sent-box", "map", map);
    }
    
    @RequestMapping(value = "/viewMessage/{id}", method = RequestMethod.GET)
    public ModelAndView viewMessage(ModelMap map, @PathVariable("id") int id){
        DoctorInbox viewMessage = doctorInboxDao.getById(id);
        map.addAttribute("inbox", viewMessage);
        return new ModelAndView("/admin_dashbord/view-inbox");
    }
    
    @RequestMapping(value = "/reply/{id}", method = RequestMethod.GET)
    public ModelAndView reply(ModelMap map, @PathVariable("id") int id){
        DoctorInbox viewMessage = doctorInboxDao.getById(id);
        map.addAttribute("reply", viewMessage);
        return new ModelAndView("/admin_dashbord/compose");
    }
    
    @RequestMapping(value = "/admin-login", method = RequestMethod.POST)
    public ModelAndView adminLogin(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        String username = "admin";
        String password = "admin";
        
        if(user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)){
            return new ModelAndView("/admin_dashbord/index");
        }else{
           map.put("status", "Usrname and Password does not match" );
           return new ModelAndView("/admin/blank-login", "map", map);
       }
    }
    
    @RequestMapping(value = "/getDoc", method = RequestMethod.POST)
    public ModelAndView getDoctor(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String email = request.getParameter("email");
        Doctor d = docDao.getDetails(email);
        System.out.println(d.getEmail());
        
        map.put("doctor", d);
        return new ModelAndView("/admin_dashbord/main-compose", "map", map);
    }
        
    
    
}
