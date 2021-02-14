/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IPathologyController;
import com.sr.spring.hospital.dao.impl.IAppointmentDAOImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IPathologyDAOImpl;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.model.Pathology;
import com.sr.spring.hospital.service.impl.IAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IApproveAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IPathologyServiceImpl;
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
@RequestMapping(value = "approve")
public class ApproveAppointmentController implements IPathologyController{

    @Autowired
    IApproveAppointmentServiceImpl approveService;
    
    @Autowired
    IAppointmentDAOImpl appointmentDao;
    
    @Autowired
    IDoctorDAOImpl doctorDao;
    
   
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
       
    return new ModelAndView("/admin_dashbord/approve-appointment");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
       
//       int appid=Integer.parseInt(request.getParameter("appId"));
         approveService.save(request);
//        appointmentDao.delete(appid);
         
        return new ModelAndView("redirect:/approve/list");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        approveService.update(request);
        return new ModelAndView("redirect:/approve/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        approveService.delete(id);
        return new ModelAndView("redirect:/approve/list");
    }

    
    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ApproveAppointment> approveList = approveService.getList();
        map.put("approveList", approveList);
        return new ModelAndView("/admin_dashbord/approve-appointment", "map", map);
    
    }
   
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPatient(ModelMap map, @PathVariable("id") int id){
        ApproveAppointment approveAppointment = approveService.getById(id);
        map.addAttribute("approveAppointment", approveAppointment);
        return new ModelAndView("/admin_dashbord/edit-pathology");
    }
    
    @RequestMapping(value = "/takePatient/{id}", method = RequestMethod.GET)
    public ModelAndView takePatient(ModelMap map, @PathVariable("id") int id){
        ApproveAppointment appList= approveService.getById(id);
        map.addAttribute("appList", appList);
        return new ModelAndView("/doctor/appoint-prescription");
    }
    
    
    @RequestMapping(value = "/app-pres/{id}", method = RequestMethod.GET)
    public ModelAndView takePrescription(ModelMap map, @PathVariable("id") int id){
        ApproveAppointment a = approveService.getById(id);
        map.addAttribute("p", a);
        return new ModelAndView("/doctor/appoint-prescription");
    }
    
    @RequestMapping(value = "/getDetails", method = RequestMethod.POST)
    public ModelAndView getDetails(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String first_name = request.getParameter("first_name");
        Doctor d = doctorDao.getDetails(first_name);
        map.put("doctor", d);
        return new ModelAndView("/admin_dashbord/add-appointment", "map", map);
    }
    
}
