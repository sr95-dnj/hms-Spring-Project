/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IPrescriptionControllerImpl;
import com.sr.spring.hospital.dao.impl.IPrescriptionDAOImpl;
import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.model.Prescription;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
import com.sr.spring.hospital.service.impl.IPrescriptionServiceImpl;
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
@RequestMapping(value = "prescription")

public class PrescriptionController implements IPrescriptionControllerImpl{

    @Autowired
    IPrescriptionServiceImpl iPrescriptionServiceImpl;
    
    @Autowired
    IPatientServiceImpl iPatientServiceImpl;
    
    @Autowired
    IPrescriptionDAOImpl prescriptionDao;
    
    @Override
    public ModelAndView home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
        iPrescriptionServiceImpl.save(request);
        return new ModelAndView("/doctor/doctor-dashbord");
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

    @RequestMapping(value = "/preList", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Prescription> prescriptionList = iPrescriptionServiceImpl.getList();
        map.put("prescriptionList", prescriptionList);
        return new ModelAndView("/doctor/prescription-list", "map", map);
    }
    
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPrescription(ModelMap map, @PathVariable("id") int id){
        Prescription p = this.iPrescriptionServiceImpl.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("/doctor/view-prescription");
    }
    
    
    @RequestMapping(value = "/allPrescription/{code}", method = RequestMethod.GET)
    public ModelAndView getPrescription(@PathVariable("code") String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        
        List<Prescription> pList = prescriptionDao.getList(code);
        
        map.put("prescriptionList", pList);
        return new ModelAndView("/doctor/prescription-list", "map", map);
    }
    
}
