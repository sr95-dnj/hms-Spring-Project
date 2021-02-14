/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IControllerImpl;
import com.sr.spring.hospital.model.Appointment;
import com.sr.spring.hospital.model.Doctor;

import com.sr.spring.hospital.service.impl.IAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
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
@RequestMapping(value = "appointment")
public class AppointmentController implements IControllerImpl{

    @Autowired
    IAppointmentServiceImpl appointmentService;
    
    @Autowired
    IDoctorServiceImpl doctorService;
    
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
        Map<String, Object> map = new HashMap<String, Object>();
        
        List<Doctor> docList = doctorService.getList();
        map.put("docList", docList);
        return new ModelAndView("/admin_dashbord/add-appointment", "map", map);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
      Appointment a = appointmentService.save(request);
    
      Map<String, Object> map = new HashMap();
     
        return new ModelAndView("redirect:/appointment/list", "map", map);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        appointmentService.update(request);
        return new ModelAndView("redirect:/appointment/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        appointmentService.delete(id);
        return new ModelAndView("redirect:/appointment/list");
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Appointment> appointmentList = appointmentService.getList();
       
        map.put("appointmentList", appointmentList);
        
        return new ModelAndView("/admin_dashbord/appointments", "map", map);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView appointmentEdit(ModelMap map, @PathVariable("id") int id){
        Appointment appoint = appointmentService.getById(id);
        map.addAttribute("appoint", appoint);
        return new ModelAndView("redirect:/appointment/list");
       
    }
    
   
    
    
}
