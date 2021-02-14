/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.dao.impl.IApplyDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IApproveAppointmentDaoImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.model.Holiday;
import com.sr.spring.hospital.model.Prescription;
import com.sr.spring.hospital.service.impl.IHolidayServiceImpl;
import com.sr.spring.hospital.service.impl.IPrescriptionServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@RequestMapping("admin")
public class DashbordController {

    @Autowired
    IPrescriptionServiceImpl prescriptionService;

    @Autowired
    IDoctorDAOImpl doctorDao;
    @Autowired
    IPatientDaoImpl patientDao;
    @Autowired
    IApproveAppointmentDaoImpl approveDao;
    @Autowired
    IApplyDoctorDAOImpl applyDao;

    @Autowired
    IHolidayServiceImpl holidayService;

    @RequestMapping(value = "/dash", method = RequestMethod.GET)
    public ModelAndView home() {
        Map<String, Object> map = new HashMap<String, Object>();

        long count = doctorDao.getCount();
//       long pCount = patientDao.getCount();
//       long aCount = approveDao.getCount();
//       long dCount = applyDao.getCount();

        List<Holiday> holiList = holidayService.getList();
        map.put("holiList", holiList);
        map.put("count", count);
        
//       map.put("pCount", pCount);
//       map.put("aCount", aCount);
//       map.put("dCount", dCount);
        return new ModelAndView("/admin_dashbord/index", "map", map);
    }
    
    @RequestMapping("/profile")
    public ModelAndView profile() {
        return new ModelAndView("/admin_dashbord/profiles");
    }

    @RequestMapping("/adminLogins")
    public ModelAndView profiles() {
        return new ModelAndView("/admin_dashbord/index");
    }

    @RequestMapping("/doctorss")
    public ModelAndView profilee() {
        return new ModelAndView("/admin_dashbord/doctors");
    }

    @RequestMapping("/department")
    public ModelAndView dep() {
        return new ModelAndView("/admin_dashbord/departments");
    }

    @RequestMapping("/edit-dep")
    public ModelAndView depart() {
        return new ModelAndView("/admin_dashbord/edit-department");
    }

    @RequestMapping("/add-asset")
    public ModelAndView asset() {
        return new ModelAndView("/admin_dashbord/add-asset");
    }

    @RequestMapping("/patient")
    public ModelAndView patient() {
        return new ModelAndView("/admin_dashbord/patients");
    }

    @RequestMapping("/appointment")
    public ModelAndView appointment() {
        return new ModelAndView("/admin_dashbord/appointments");
    }

    @RequestMapping("/add-employee")
    public ModelAndView adEmp() {
        return new ModelAndView("/admin_dashbord/add-employee");
    }

    @RequestMapping("/add-holiday")
    public ModelAndView addHoliday() {
        return new ModelAndView("/admin_dashbord/add-holiday");
    }

    @RequestMapping("/add-salary")
    public ModelAndView salary() {
        return new ModelAndView("/admin_dashbord/add-salary");
    }

    @RequestMapping("/assets")
    public ModelAndView assets() {
        return new ModelAndView("/admin_dashbord/assets");
    }

    @RequestMapping("/calender")
    public ModelAndView calender() {
        return new ModelAndView("/admin_dashbord/calender");
    }

    @RequestMapping("/compose")
    public ModelAndView compose() {
        return new ModelAndView("/admin_dashbord/compose");
    }

    @RequestMapping("/create-invoice")
    public ModelAndView createInvoice() {
        return new ModelAndView("/admin_dashbord/create-invoice");
    }

    @RequestMapping("/edit-employee")
    public ModelAndView editEmployee() {
        return new ModelAndView("/admin_dashbord/edit-employee");
    }

    @RequestMapping("/edit-holiday")
    public ModelAndView editHoliday() {
        return new ModelAndView("/admin_dashbord/edit-holiday");
    }

    @RequestMapping("/edit-invoice")
    public ModelAndView editInvoice() {
        return new ModelAndView("/admin_dashbord/edit-invoice");
    }

    @RequestMapping("/edit-patients")
    public ModelAndView editPatient() {
        return new ModelAndView("/admin_dashbord/edit-patients");
    }

    @RequestMapping("/invoice-reports")
    public ModelAndView invoiceReport() {
        return new ModelAndView("/admin_dashbord/invoice-reports");
    }

    @RequestMapping("/invoice-view")
    public ModelAndView invoiceView() {
        return new ModelAndView("/admin_dashbord/invoice-view");
    }

    @RequestMapping("/invoices")
    public ModelAndView invoices() {
        return new ModelAndView("/admin_dashbord/invoices");
    }

    @RequestMapping("/payments")
    public ModelAndView payments() {
        return new ModelAndView("/admin_dashbord/payments");
    }

    @RequestMapping("/salary-view")
    public ModelAndView salaryView() {
        return new ModelAndView("/admin_dashbord/salary-view");
    }

    @RequestMapping("/salary")
    public ModelAndView salarys() {
        return new ModelAndView("/admin_dashbord/salary");
    }

    @RequestMapping(value = "/view-prescription", method = RequestMethod.GET)
    public ModelAndView viewPrescription() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Prescription> pList = prescriptionService.getList();
        map.put("pList", pList);
        return new ModelAndView("/admin_dashbord/prescription-list", "map", map);
    }

    @RequestMapping(value = "/newInvoice/{id}", method = RequestMethod.GET)
    public ModelAndView createInvoiced(ModelMap map, @PathVariable("id") int id) {
        Prescription prescription = prescriptionService.getById(id);
        map.addAttribute("prescription", prescription);
        return new ModelAndView("/admin_dashbord/create-invoice");
    }

    @RequestMapping(value = "/viewPrescription/{id}", method = RequestMethod.GET)
    public ModelAndView viewPrescription(ModelMap map, @PathVariable("id") int id) {
        Prescription prescription = prescriptionService.getById(id);
        map.addAttribute("p", prescription);
        return new ModelAndView("/admin_dashbord/view-prescription");
    }

    @RequestMapping(value = "/loginPage")
    public ModelAndView loginpage() {
        return new ModelAndView("/home/login");
    }

   
}
