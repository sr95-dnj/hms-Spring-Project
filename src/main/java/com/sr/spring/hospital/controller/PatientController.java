/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IPatientControllerImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IInvoiceDaoImpl;
import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.model.Invoice;

import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
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
@RequestMapping(value = "patient")
public class PatientController implements IPatientControllerImpl {

    @Autowired
    IPatientServiceImpl patientService;
    
    @Autowired
    IPatientDaoImpl patientDao;
    
    @Autowired
    IInvoiceDaoImpl invoiceDao;
    @Autowired
    IDoctorDAOImpl doctorDao;
    
    @Autowired
    
    IDoctorServiceImpl doctorService;

    @Autowired
    IPatientDaoImpl patientDAO;

    @RequestMapping(value = "/save", method = RequestMethod.POST)

    @Override
    public ModelAndView create(HttpServletRequest request) {
        patientService.save(request);
        return new ModelAndView("redirect:/patient/patient_list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        patientService.delete(id);
        return new ModelAndView("redirect:/patient/patient_list");
    }

    @RequestMapping(value = "/patient_list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Patient> patientList = patientService.getList();
        map.put("patientList", patientList);
        return new ModelAndView("admin_dashbord/patients", "map", map);
    }

    @RequestMapping(value = "/home")
    @Override
    public ModelAndView home() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> docList = doctorService.getList();
        map.put("docList", docList);
        return new ModelAndView("admin_dashbord/edit-patient", "map", map);
    }

    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        patientService.update(request);
        return new ModelAndView("redirect:/patient/patient_list");
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editDoctor(ModelMap map, @PathVariable("id")int id){
        Patient p = this.patientService.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("admin_dashbord/add-patient");
    }
   
    @RequestMapping(value = "/searchPatient", method = RequestMethod.GET)
    public ModelAndView searchPatient(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Patient> pList = patientDAO.searchPatient(request.getParameter("name"));
        map.put("pList", pList);
        return new ModelAndView("/admin_dashbord/search-patients", "map", map);
        
    }
    
    public ModelAndView downloadInvoice( ModelMap map, @PathVariable("mobile") String mobile){
        
        return null;
    }
    
    @RequestMapping(value = "/pLogin")
    public ModelAndView open(){
        return new ModelAndView("/patient/login");
    }
    
    
    @RequestMapping(value = "/patient-login", method = RequestMethod.POST)
    public ModelAndView patientLogin(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String mobile = request.getParameter("mobile");
        
        Invoice i =(Invoice) invoiceDao.searchByMobile(mobile);
        
        if(i != null){
            map.put("i",  i);
            return new ModelAndView("/patient/patient-dashbord", "map", map);
        }else{
            map.put("status", "Mobile does not match");
            return new ModelAndView("/patient/login", "map", map);
        }
    }
    
    @RequestMapping(value = "/patient-invoice/{id}", method = RequestMethod.GET)
    public ModelAndView getInvoice(ModelMap map, @PathVariable("id") int id){
        Invoice i = invoiceDao.getById(id);
        map.put("invoice", i);
        return new ModelAndView("/patient/invoice-view");
    }
   
     @RequestMapping(value = "/patient-prescription/{id}", method = RequestMethod.GET)
    public ModelAndView getPrescription(ModelMap map, @PathVariable("id") int id){
        Invoice i = invoiceDao.getById(id);
        map.put("p", i);
        return new ModelAndView("/patient/view-prescription");
    }
    
    @RequestMapping(value = "/getDetails", method = RequestMethod.POST)
    public ModelAndView getDetails(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String first_name = request.getParameter("first_name");
        Doctor d = doctorDao.getDetails(first_name);
        map.put("doctor", d);
        return new ModelAndView("/admin_dashbord/edit-patient", "map", map);
    }
    

}
