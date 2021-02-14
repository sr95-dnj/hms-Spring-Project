/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IReceptionControllerImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.model.Appointment;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.model.Department;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.model.Invoice;
import com.sr.spring.hospital.model.Pathology;
import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.model.Prescription;
import com.sr.spring.hospital.model.Reception;
import com.sr.spring.hospital.service.impl.IAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IApproveAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDepartmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import com.sr.spring.hospital.service.impl.IHolidayServiceImpl;
import com.sr.spring.hospital.service.impl.IInvoiceServiceImpl;
import com.sr.spring.hospital.service.impl.IPathologyServiceImpl;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
import com.sr.spring.hospital.service.impl.IPrescriptionServiceImpl;
import com.sr.spring.hospital.service.impl.IReceptionServiceImpl;
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
@RequestMapping(value = "reception")
public class ReceptionController implements IReceptionControllerImpl{

    @Autowired
    IReceptionServiceImpl receptionService;
    
    @Autowired
    IDoctorServiceImpl doctorService;
    
    IDoctorDAOImpl docDao;
    
    @Autowired
    IPatientServiceImpl patientService;
    
    @Autowired 
    IAppointmentServiceImpl appointmentService;
    
    @Autowired
    IApproveAppointmentServiceImpl approveService;
    
    @Autowired
    IPrescriptionServiceImpl prescriptionService;
    
    @Autowired
    IPathologyServiceImpl pathologyService;
    
    @Autowired
    IDepartmentServiceImpl departmentService;
    
    @Autowired
    IHolidayServiceImpl holidayService;
    
    @Autowired
    IInvoiceServiceImpl invoiceService;
    
    
    @RequestMapping(value = "/dashbord")
    public ModelAndView dashbord(){
        Map<String, Object> map = new HashMap<String, Object>();
        long count = docDao.getCount();
       List<ApproveAppointment> a = approveService.getList();
        map.put("count", count);
        map.put("a", a);
        return new ModelAndView("/reception/index", "map", map);
    }
    
    
    @RequestMapping(value = "/login")
    public ModelAndView login(){
        
        return new ModelAndView("/reception/login");
    }
    
    @RequestMapping(value = "/appointment")
    public ModelAndView appointment(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctor = doctorService.getList();
        map.put("doctor", doctor);
        return new ModelAndView("/reception/add-appointment", "map", map);
    }
    
    
    @RequestMapping(value = "/create_appointment", method = RequestMethod.POST)
    public ModelAndView crateAppointment(HttpServletRequest request){
        approveService.save(request);
        return new ModelAndView("redirect:/reception/approve-appointment-view");
    }
    
    @RequestMapping(value = "/approve-appointment-view")
    public ModelAndView approveAppointment(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<ApproveAppointment> appoint = approveService.getList();
        map.put("appoint", appoint);
        
        return new ModelAndView("/reception/approve-appointment", "map", map);
    }
    
    @RequestMapping(value = "/patients")
    public ModelAndView patients(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Patient> patients = patientService.getList();
        map.put("patients", patients);
        
        return new ModelAndView("/reception/patients", "map", map);
    }
    
    @RequestMapping(value = "/add-patients")
    public ModelAndView addPatients(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctor = doctorService.getList();
        map.put("doctor", doctor);
        return new ModelAndView("/reception/add-patient", "map", map);
    }
    
    @RequestMapping(value = "/create-patient", method = RequestMethod.POST)
    public ModelAndView createPatient(HttpServletRequest request){
        patientService.save(request);
        return new ModelAndView("redirect:/reception/patients");
    }
    
    @RequestMapping(value = "/update-patient", method = RequestMethod.POST)
    public ModelAndView updatePatient(HttpServletRequest request){
        patientService.update(request);
        return new ModelAndView("redirect:/reception/patients");
    }
    
    @RequestMapping(value = "/edit-patient/{id}", method = RequestMethod.GET)
    public ModelAndView editPatient(ModelMap map, @PathVariable("id") int id){
        Patient p = patientService.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("/reception/edit-patient");
    }
    
    @RequestMapping(value = "/delete-patient/{id}", method = RequestMethod.GET)
    public ModelAndView deletePatient(@PathVariable("id") int id){
        patientService.delete(id);
        return new ModelAndView("redirect:/reception/patients");
    }
    
    @RequestMapping(value = "/appointment-view")
    public ModelAndView appointmentView(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Appointment> appoint = appointmentService.getList();
        map.put("appoint", appoint);
        
        return new ModelAndView("/reception/appointments", "map", map);
    }
    
    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public ModelAndView doctorView(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctors = doctorService.getList();
        map.put("doctors", doctors);
        
        return new ModelAndView("/reception/doctors", "map", map);
    }
    
    @RequestMapping(value = "/doctor-profile/{id}", method = RequestMethod.GET)
    public ModelAndView doctorProfile(ModelMap map, @PathVariable("id") int id){
        Doctor doctor = doctorService.getById(id);
        map.addAttribute("doctor", doctor);
        return new ModelAndView("/reception/profiles");
    }
    
    @RequestMapping(value = "/doctor-chat/{id}", method = RequestMethod.GET)
    public ModelAndView chat(ModelMap map, @PathVariable("id") int id){
        Doctor doctor = doctorService.getById(id);
        map.addAttribute("doctor", doctor);
        return new ModelAndView("/reception/chat");
    }
    
    @RequestMapping(value = "/prescriptions", method = RequestMethod.GET)
    public ModelAndView prescriptionView(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Prescription> prescription = prescriptionService.getList();
        map.put("prescription", prescription);
        
        return new ModelAndView("/reception/prescriptions", "map", map);
    }
    
    @RequestMapping(value = "/view-prescription/{id}", method = RequestMethod.GET)
    public ModelAndView prescriptionView(ModelMap map, @PathVariable("id") int id){
        Prescription prescription = prescriptionService.getById(id);
        map.addAttribute("p", prescription);
        return new ModelAndView("/reception/view-prescription");
    }
    
    @RequestMapping(value = "/deletePres/{id}", method = RequestMethod.GET)
    public ModelAndView deletePrescriptions(@PathVariable("id") int id){
        prescriptionService.delete(id);
        return new ModelAndView("redirect:/reception/prescriptions");
    }
    
    @RequestMapping(value = "/invoices", method = RequestMethod.GET)
    public ModelAndView invoiceView(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Invoice> invoices = invoiceService.getList();
        map.put("invoices", invoices);
        
        return new ModelAndView("/reception/invoices", "map", map);
    }
    
    @RequestMapping(value = "/view-invoice/{id}", method = RequestMethod.GET)
    public ModelAndView viewInvoice(ModelMap map, @PathVariable("id") int id){
        Invoice invoice = invoiceService.getById(id);
        map.addAttribute("invoice", invoice);
        return new ModelAndView("/reception/invoice-view");
    }
    
    @RequestMapping(value = "/c-invoice", method = RequestMethod.GET)
    public ModelAndView cInvoice(){
        return new ModelAndView("/reception/common-invoice");
    }
    
    @RequestMapping(value = "/r-invoice/{id}", method = RequestMethod.GET)
    public ModelAndView rInvoice(ModelMap map, @PathVariable("id") int id){
         Prescription prescription = prescriptionService.getById(id);
        map.addAttribute("prescription", prescription);
        
        return new ModelAndView("/reception/create-invoice");
    }
    
    @RequestMapping(value = "/create-invoice", method = RequestMethod.POST)
    public ModelAndView createInvoice(HttpServletRequest request){
        invoiceService.save(request);
        return new ModelAndView("redirect:/reception/invoices");
    } 
    
    @RequestMapping(value = "/edit-invoice/{id}", method = RequestMethod.GET)
    public ModelAndView editInvoice(ModelMap map, @PathVariable("id") int id){
        Invoice invoice = invoiceService.getById(id);
        map.addAttribute("invoice", invoice);
        return new ModelAndView("/reception/edit-invoice");
    }
    
    @RequestMapping(value = "/update-invoice", method = RequestMethod.POST)
    public ModelAndView updateInvoice(HttpServletRequest request){
        invoiceService.update(request);
        return new ModelAndView("redirect:/reception/invoices");
    }
    
    @RequestMapping(value = "/delete-i/{id}", method = RequestMethod.GET)
    public ModelAndView delt(@PathVariable("id") int id){
        invoiceService.delete(id);
        return new ModelAndView("redirect:/reception/invoices");
    }
    
    
    @RequestMapping(value = "/pathList", method = RequestMethod.GET)
    public ModelAndView pathList(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Pathology> prescription = pathologyService.getList();
        map.put("pathologyList", prescription);
        
        return new ModelAndView("/reception/pathologys", "map", map);
    }
    
    
    @RequestMapping(value = "/depList", method = RequestMethod.GET)
    public ModelAndView depList(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Department> prescription = departmentService.getList();
        map.put("departmentList", prescription);
        
        return new ModelAndView("/reception/departments", "map", map);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Override
    public ModelAndView home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView create(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    @RequestMapping(value = "/reception-login", method = RequestMethod.POST)
    public ModelAndView receptionLog(HttpServletRequest request){
      Map<String, Object> map = new HashMap<String, Object>();
      String user = request.getParameter("username");
      String pass = request.getParameter("password");
      List<ApproveAppointment> a = approveService.getList();
      
      String username = "reception";
      String password = "1234";
      
      if(user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)){
          
         map.put("a", a);
         
          return new ModelAndView("/reception/index", "map", map);
      }else{
         map.put("status", "Usrname and Password does not match" );
           return new ModelAndView("/reception/login", "map", map);
       }
        
    }
    
    @RequestMapping(value = "/logout")
    public ModelAndView logout(){
        return new ModelAndView("/home/login");
    }
    
    
    @RequestMapping(value = "/getDetail", method = RequestMethod.POST)
    public ModelAndView getDetails(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String first_name = request.getParameter("first_name");
        Doctor d = docDao.getDetails(first_name);
        map.put("doctors", d);
        return new ModelAndView("/reception/add-patient", "map", map);
    }


    
}
