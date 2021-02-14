package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.dao.impl.IInvoiceDaoImpl;
import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.model.Invoice;
import com.sr.spring.hospital.model.Patient;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/login")
public class LoginController {
    
    @Autowired
    IPatientDaoImpl patientDao;
    
    @Autowired
    IInvoiceDaoImpl invoiceDao;
    
    @RequestMapping(value = "/login")
    public ModelAndView pLog(){
        return new ModelAndView("/patient/login");
    }
    
    @RequestMapping(value = "/aLogin")
    public ModelAndView aLog(){
        return new ModelAndView("/login/login");
    }
    
//    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
//    public ModelAndView adminLogin(HttpServletRequest request){
//        Map<String, Object> map = new HashMap<String, Object>();
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
//        
//        String user = "admin";
//        String pass ="admin";
//        String status = "Username or Password does not match";
//        if((username.equalsIgnoreCase(user)) && (password.equalsIgnoreCase(pass))){
//            return new ModelAndView("/admin_dashbord/index");
//        }
//        else{
//            map.put("status", "Usrname and Password does not match" );
//            return new ModelAndView("/admin/blank-login", "map", map);
//        }
//        
//    }
    
    
    @RequestMapping(value = "/receptionLogin", method = RequestMethod.POST)
    public ModelAndView receptionLogin(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    
        
        String user = "reception";
        String pass ="1234";
        
        if((username.equalsIgnoreCase(user)) && (password.equalsIgnoreCase(pass))){
            return new ModelAndView("/reception/index");
        }
        else{
            map.put("status", "Usrname and Password does not match" );
            return new ModelAndView("/reception/login", "map", map);
        }
        
    }
    
    
    @RequestMapping(value = "/patientLogined", method = RequestMethod.POST)
    public ModelAndView searchByMobile(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        
        String mobile = request.getParameter("mobile");
        
        Patient p =(Patient) patientDao.searchByMobile(mobile);
        System.out.println(p.getName());
        System.out.println(p.getId());
        int pID = p.getId();
        ModelMap mapped = new ModelMap();
        
        if(p!=null){
            
          map.put("p", p);
          // mapped.addAttribute("pID",pID);
            return new ModelAndView("/patient/patient-dashbord", "map", map);
        }else{
            map.put("patient", "Mobile number does not match");
            
             return new ModelAndView("/patient/login", "map", map);
        }
    }
    
    
    
    
    
    
    
    @RequestMapping(value = "/pInvoice/{id}", method = RequestMethod.GET)
    public ModelAndView getInvoice(ModelMap map, @PathVariable("id") int id){
        Invoice p = invoiceDao.getById(id);
        map.addAttribute("invoice", p);
        return new ModelAndView("/patient/invoice-view");
    }
    
    
	

@RequestMapping(value = "/patientLogin", method = RequestMethod.POST)
    public ModelAndView searchPatientByMobile(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        
        String mobile = request.getParameter("mobile");
        
        Invoice p =(Invoice) invoiceDao.searchByMobile(mobile);
        if(p!=null){
            map.put("invoice", p);
            return new ModelAndView("/patient/patient-dashbord", "map", map);
        }else{
            map.put("patient", "Mobile number does not match");
             return new ModelAndView("/patient/login", "map", map);
        }
    }
    
    @RequestMapping(value = "/prescription/{id}", method = RequestMethod.GET)
    public ModelAndView getPrescription(ModelMap map, @PathVariable("id") int id){
        Invoice p = invoiceDao.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("/patient/view-prescription");
    }

}