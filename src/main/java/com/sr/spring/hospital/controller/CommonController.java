/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.service.impl.IAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author B6
 */
@Controller
public class CommonController {
    
    @Autowired
    IDoctorServiceImpl doctorService;
    
    @Autowired
    IAppointmentServiceImpl appService;
    
    @RequestMapping(value = "/")
    public ModelAndView home(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> dList = doctorService.getList();
        map.put("dList", dList);
     return new ModelAndView("/home/index", "map", map);   
    }
    @RequestMapping(value = "/login")
    public String login(){
     return "home/login";   
    }
    
    @RequestMapping(value = "/doctorlogin")
    public String docLog(){
     return "doctor/login";   
    }
    
    @RequestMapping(value = "/admin_login")
    public String dashbord(){
     return "admin/login";   
    }
     
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAppointment(HttpServletRequest request){
        appService.save(request);
        
        return "redirect:/";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
