/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IDoctorInboxControllerImpl;
import com.sr.spring.hospital.dao.impl.IAdminInboxDaoImpl;
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
@RequestMapping(value = "doctorInbox")
public class DoctorInboxController implements IDoctorInboxControllerImpl{

    
    @Autowired
    IAdminInboxDaoImpl adminDao;
    
    @Autowired
    IDoctorServiceImpl docService;
    
    @Autowired
    IDoctorInboxDaoImpl docDao;
    
    
    @Override
    public ModelAndView home() {
        return null;
    }
    
    @RequestMapping(value = "/mainCompose", method = RequestMethod.GET)
    public ModelAndView mainCompose() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> emails = docService.getList();
        map.put("emails", emails);
        
        return new ModelAndView("/doctor/main-compose", "map", map);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String message = request.getParameter("message");
        String email = request.getParameter("email");
        String toDoc = request.getParameter("toAdmin");
        String subject = request.getParameter("subject");
        String dateTime = LocalDateTime.now().toString();
        
        DoctorInbox inbox = new DoctorInbox();
       inbox.setEmail(email);
       inbox.setToAdmin(toDoc);
       inbox.setMessage(message);
       inbox.setSubject(subject);
       inbox.setDateTime(dateTime);
       
       docDao.save(inbox);
       
       return new ModelAndView("redirect:/doctorInbox/inbox");
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

    @Override
    public ModelAndView getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @RequestMapping(value = "/inbox/{code}", method = RequestMethod.GET)
    public ModelAndView inbox(@PathVariable("code") String code){
        Map<String, Object> map = new HashMap<String, Object>();
        List<AdminInbox> inbox = adminDao.getList(code);
        map.put("inbox", inbox);
        return new ModelAndView("/doctor/inbox", "map", map);
        
    }
    
    @RequestMapping(value = "/viewMessage/{id}", method = RequestMethod.GET)
    public ModelAndView viewMessage(ModelMap map, @PathVariable("id") int id){
        AdminInbox viewMessage = adminDao.getById(id);
        map.addAttribute("inbox", viewMessage);
        return new ModelAndView("/doctor/view-inbox");
    }
    
    @RequestMapping(value = "/reply/{id}", method = RequestMethod.GET)
    public ModelAndView reply(ModelMap map, @PathVariable("id") int id){
        AdminInbox viewMessage = adminDao.getById(id);
        map.addAttribute("reply", viewMessage);
        return new ModelAndView("/doctor/compose");
    }
    
    
    @RequestMapping(value = "/sentbox", method = RequestMethod.GET)
    public ModelAndView sentbox(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<DoctorInbox> inbox = docDao.getList();
        map.put("inbox", inbox);
        return new ModelAndView("/doctor/sent-box", "map", map);
    }
    
}
