/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IDoctorControllerImpl;
import com.sr.spring.hospital.dao.impl.IAdminInboxDaoImpl;
import com.sr.spring.hospital.dao.impl.IApplyDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IApproveAppointmentDaoImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.dao.impl.IPrescriptionDAOImpl;
import com.sr.spring.hospital.model.AdminInbox;
import com.sr.spring.hospital.model.ApplyDoctor;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.model.Department;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.model.Prescription;
import com.sr.spring.hospital.service.impl.IApproveAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDepartmentServiceImpl;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@RestController
@RequestMapping(value = "doctor")
public class DoctorController implements IDoctorControllerImpl {
    
    @Autowired
    IApproveAppointmentServiceImpl appointService;
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Autowired
    IDoctorDAOImpl doctorDao;
    
    @Autowired
    IDepartmentServiceImpl departmentService;
    
    @Autowired
    IApproveAppointmentDaoImpl appointDao;
    
    @Autowired
    IDoctorDAOImpl docDao;
    
    @Autowired
    IAdminInboxDaoImpl adminInboxDao;
    
    @Autowired
    IApproveAppointmentServiceImpl approveService;
    
    @Autowired
    IDoctorServiceImpl doctorService;
    
    @Autowired
    IPatientServiceImpl patientServices;
    
    @Autowired
    IPatientDaoImpl patientDao;
    
    @Autowired
    ServletContext servletContext;
    
    @Autowired
    IApplyDoctorDAOImpl applyDoctorDao;
    
    @Autowired
    IPrescriptionDAOImpl prescriptionDao;
    
    
    @RequestMapping(value = "/doctor-dashbord", method = RequestMethod.GET)
    public ModelAndView dash(Principal p){
        Map<String, Object> map = new HashMap<String, Object>();
        long docCount = docDao.getCount();
        map.put("doc", docCount);
        return new ModelAndView("/doctor/doctor-dashbord", "map", map);
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    
    @Override
    public ModelAndView create(HttpServletRequest request) {
        doctorService.save(request);
        return new ModelAndView("redirect:/doctor/doctor_list");
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        doctorService.update(request);
        return new ModelAndView("redirect:/doctor/doctor_list");
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        doctorService.delete(id);
        return new ModelAndView("redirect:/doctor/doctor_list");
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @Override
    public ModelAndView edit(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Department> depList = departmentService.getList();
        map.put("depList", depList);
        return new ModelAndView("admin_dashbord/edit-doctor", "map", map);
    }
    
    @RequestMapping(value = "/doctor_list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctorList = doctorService.getList();
        map.put("doctorList", doctorList);
        return new ModelAndView("admin_dashbord/doctors", "map", map);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editDoctor(ModelMap map, @PathVariable("id") int id) {
        Doctor d = this.doctorService.getById(id);
        map.addAttribute("d", d);
        return new ModelAndView("admin_dashbord/add-doctor");
    }
    
    @Override
    public ModelAndView home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Department> depList = departmentService.getList();
        map.put("depList", depList);
        return new ModelAndView("/doctor/doctor-login", "map", map);
    }
    
    @RequestMapping(value = "/dashbord", method = RequestMethod.GET)
    public ModelAndView dashbord(HttpServletRequest request, Principal p) {
          String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        
        Doctor d = (Doctor) docDao.getLogin(user_name, password);
        
        //sir
        List<ApproveAppointment> upAppoint = approveService.getList(d.getCode());
        return new ModelAndView("redirect:/doctor/appointList");
    }
    
    @RequestMapping(value = "/appointList", method = RequestMethod.GET)
    public ModelAndView appointList() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ApproveAppointment> appList = appointService.getList();
        map.put("appList", appList);
        return new ModelAndView("doctor/doctor-dashbord", "map", map);
    }
    
    @RequestMapping(value = "/doctors_list", method = RequestMethod.GET)
    public ModelAndView getDoctro() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctorList = doctorService.getList();
        map.put("doctorList", doctorList);
        return new ModelAndView("doctor/doctors", "map", map);
    }
    
    /////////ok///////
    @RequestMapping(value = "/allPatient/{code}", method = RequestMethod.GET)
    public ModelAndView getPatient(@PathVariable("code") String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        
        List<Patient> pList = patientDao.getList(code);
        
        map.put("pList", pList);
        return new ModelAndView("/doctor/patients", "map", map);
    }
    
    
    @RequestMapping(value = "/preList", method = RequestMethod.GET)
    
    public ModelAndView getAlld() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Prescription> prescriptionList = prescriptionDao.getList();
        map.put("prescriptionList", prescriptionList);
        return new ModelAndView("/doctor/prescription-list", "map", map);
    }
    
    
    
    ///////////////////
    @RequestMapping(value = "/doctorInbox/{code}", method = RequestMethod.GET)
    public ModelAndView doctorInbox(@PathVariable("code") String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        
        List<AdminInbox> pList = adminInboxDao.getList(code);
        
        
        map.put("inbox", pList);
        return new ModelAndView("/doctor/inbox", "map", map);
    }
   
    
   ////////////ok////
    @RequestMapping(value = "/allPrescription/{code}", method = RequestMethod.GET)
    public ModelAndView getPrescription(@PathVariable("code") String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        
        List<Prescription> pList = prescriptionDao.getList(code);
        
        map.put("prescriptionList", pList);
        return new ModelAndView("/doctor/prescription-list", "map", map);
    }
    
    @RequestMapping("/apointList")
    public ModelAndView getAppoint() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ApproveAppointment> approveList = appointService.getList();
        map.put("approveList", approveList);
        return new ModelAndView("/admin_dashbord/approve-appointment", "map", map);
        
    }
    
    @RequestMapping(value = "/pescription")
    public ModelAndView pescription() {
        return new ModelAndView("/doctor/pescription");
    }
    
    private void saveFile(MultipartFile file, String fileName, String path) throws IOException {
        System.out.println("Start");
        
        byte[] bytes = file.getBytes();
        
        String filePath = servletContext.getRealPath(path);
        File directory = new File(filePath);
        File cFile = new File(
                "E:\\Project\\Spring Project\\hms1\\New folder\\login\\hms\\src\\main\\webapp\\resources\\assets\\img"
                + File.separator + fileName);
        
        BufferedOutputStream stream = new BufferedOutputStream(
                new FileOutputStream(cFile));
        stream.write(bytes);
        stream.close();
        System.out.println(cFile);
    }
    
    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public ModelAndView store(HttpServletRequest request, @RequestParam("image") MultipartFile file) throws IOException, ServletException {
        
       
        String firstName = request.getParameter("first_name");
        String code = request.getParameter("code");
        String lastName = request.getParameter("last_name");
        String department = request.getParameter("department");
        String userName = request.getParameter("user_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String bio = request.getParameter("bio");
        
        if (!file.isEmpty()) {
            String image = file.getOriginalFilename();
            saveFile(file, image, "/resources/assets/img");
            
            Doctor d = new Doctor();
            d.setCode(code);
            d.setFirst_name(firstName);
            d.setLast_name(lastName);
            d.setUser_name(userName);
            d.setDepartment(department);
            d.setEmail(email);
            d.setPassword(password);
            d.setAddress(address);
            d.setPhone(phone);
            d.setBio(bio);
            d.setImage(image);
            doctorDao.save(d);
            
        }
        return new ModelAndView("redirect:/doctor/doctor_list");
    }
    
    @RequestMapping(value = "/pescriptionView/{id}", method = RequestMethod.GET)
    public ModelAndView pescriptionView(ModelMap map, @PathVariable("id") int id) {
        Patient p = patientServices.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("/doctor/pescription");
        
    }
    
    @RequestMapping(value = "/login_doctors")
    public ModelAndView getLogin(HttpServletRequest request) {
        
        String username = request.getParameter("user_name");
        String password = request.getParameter("password");
        
        String hql = "from doctor where user_name=:user_name and password=:password";
        Query query = sessionFactory.getCurrentSession().createFilter(username, password);
        
        query.setParameter("user_name", username);
        query.setParameter("password", password);
        
        return new ModelAndView("/doctor/doctor-dashbord");
    }
    
    @RequestMapping(value = "/doctorProfile/{id}", method = RequestMethod.GET)
    public ModelAndView doctorProfile(ModelMap map, @PathVariable("id") int id) {
        Doctor doctor = doctorService.getById(id);
        map.addAttribute("doctor", doctor);
        return new ModelAndView("/admin_dashbord/profiles");
    }
    
    
    @RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
    public ModelAndView updateProfile(HttpServletRequest request, @RequestParam("image") MultipartFile file) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
    
        
    
       
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
      
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String states = request.getParameter("states");
        String country = request.getParameter("country");
        String pincode = request.getParameter("pincode");
        String institution = request.getParameter("institution");
        String subject = request.getParameter("subject");
        String startingDate = request.getParameter("startingDate");
        String endingDate = request.getParameter("endingDate");
        String degree = request.getParameter("degree");
        String grade = request.getParameter("grade");
        String company = request.getParameter("company");
        String location = request.getParameter("location");
        String jobPosition = request.getParameter("jobPosition");
        String periodFrom = request.getParameter("periodFrom");
        String periodTo = request.getParameter("periodTo");
        
        if (!file.isEmpty()) {
            String image = file.getOriginalFilename();
            saveFile(file, image, "/resources/assets/img");
            
            Doctor d = new Doctor();
            d.setId(id);
            d.setFirst_name(firstName);
            d.setLast_name(lastName);
           
            d.setAddress(address);
            d.setPhone(phone);
           
            d.setImage(image);
            d.setDob(dob);
            d.setGender(gender);
            d.setStates(states);
            d.setCountry(country);
            d.setPincode(pincode);
            d.setInstitution(institution);
            d.setSubject(subject);
            d.setStartingDate(startingDate);
            d.setEndingDate(endingDate);
            d.setDegree(degree);
            d.setGrade(grade);
            d.setCompany(company);
            d.setLocation(location);
            d.setJobPosition(jobPosition);
            d.setPeriodFrom(periodFrom);
            d.setPeriodTo(periodTo);
            doctorDao.update(d);
            
        }
        return new ModelAndView("/admin_dashbord/doctors");
        
    }
    
    @RequestMapping(value = "/profileEdit/{id}", method = RequestMethod.GET)
    public ModelAndView profileEdit(ModelMap map, @PathVariable("id") int id) {
        Doctor doctor = doctorService.getById(id);
        map.addAttribute("doctor", doctor);
        return new ModelAndView("/admin_dashbord/edit-profile");
    }
    
    
    
    @RequestMapping(value = "/updateDoctor", method = RequestMethod.POST)
    public ModelAndView updateDoctor(HttpServletRequest request, @RequestParam("image") MultipartFile file) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String department = request.getParameter("department");
        String userName = request.getParameter("user_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String bio = request.getParameter("bio");
        String code = request.getParameter("code");
        
        if (!file.isEmpty()) {
            String image = file.getOriginalFilename();
            saveFile(file, image, "/resources/img");
            
            Doctor d = new Doctor();
            d.setId(id);
            d.setFirst_name(firstName);
            d.setLast_name(lastName);
            d.setUser_name(userName);
            d.setDepartment(department);
            d.setEmail(email);
            d.setPassword(password);
            d.setAddress(address);
            d.setPhone(phone);
            d.setBio(bio);
            d.setCode(code);
            d.setImage(image);
            doctorDao.update(d);
            
        }
        return new ModelAndView("redirect:/doctor/doctor_list");
    }
    
    
    @RequestMapping(value = "/doc-login", method = RequestMethod.POST)
    public ModelAndView getDoctorLogin( HttpServletRequest request){
       Map<String, Object> map = new HashMap<String, Object>();
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        
        Doctor d = docDao.getLogin(user_name, password);
        
        //sir
        List<ApproveAppointment> upAppoint = approveService.getList(d.getCode());
        
        if(d != null){
            map.put("doctor", d);
            map.put("appList", upAppoint);
            
            return new ModelAndView("/doctor/doctor-dashbord", "map", map);
        }
        
        else{
            map.put("status", "Username or Password does not match");
            return new ModelAndView("/doctor/doctor-login", "map", map);
        }
         
        
        
        
    }
    
    
}
