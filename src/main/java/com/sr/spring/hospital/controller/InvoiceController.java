/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IEmployeeControllerImpl;
import com.sr.spring.hospital.controller.impl.IHolidayControllerImpl;
import com.sr.spring.hospital.controller.impl.IInvoiceControllerImpl;
import com.sr.spring.hospital.model.Invoice;
import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.service.impl.IInvoiceServiceImpl;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@RequestMapping("invoice")
public class InvoiceController implements IInvoiceControllerImpl{

    
    @Autowired
    IInvoiceServiceImpl invoiceService;
    
    @Autowired
    IPatientServiceImpl patientService;
    
    @RequestMapping(value = "/add")
    @Override
    public ModelAndView home() {
        
        Map<String, Object> map = new HashMap<String, Object>();
        List<Patient> patientList = patientService.getList();
        map.put("patientList", patientList);
        return new ModelAndView("admin_dashbord/create-invoice", "map", map);
    }

    @RequestMapping(value = "/save")
    @Override
    public ModelAndView create(HttpServletRequest request) {
       invoiceService.save(request);
       return new ModelAndView("redirect:/invoice/list");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        invoiceService.update(request);
        return new ModelAndView("redirect:/invoice/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        invoiceService.delete(id);
        return new ModelAndView("redirect:/invoice/list");
    }

    
    @Override
    public ModelAndView edit(HttpServletRequest request) {
        return new ModelAndView("admin_dashbord/edit-invoice");
        }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Invoice> invoiceList = invoiceService.getList();
        map.put("invoiceList", invoiceList);
        return new ModelAndView("admin_dashbord/invoices", "map", map);
    }
    
    @RequestMapping(value = "/report")
    public ModelAndView report() {
        return new ModelAndView("admin_dashbord/invoice-reports");
    }
    
    @RequestMapping(value = "/invoice_view")
    public ModelAndView invoiceView() {
        
        return new ModelAndView("admin_dashbord/invoice-view");
    }
    
    @RequestMapping(value = "/view/{id}",  method = RequestMethod.GET)
    public ModelAndView editPatient(ModelMap map, @PathVariable("id") int id){
        Invoice invoice = invoiceService.getById(id);
        map.addAttribute("invoice", invoice);
        return new ModelAndView("/admin_dashbord/invoice-view");
    }
    
    
    
//     @RequestMapping("/pdf/{fileName:.+}")
//    public void downloadPDFResource( HttpServletRequest request, 
//                                     HttpServletResponse response, 
//                                     @PathVariable("fileName") String fileName) 
//    {
//        //If user is not authorized - he should be thrown out from here itself
//         
//        //Authorized user will download the file
//        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/downloads/pdf/");
//        Path file = Paths.get(dataDirectory, fileName);
//        if (Files.exists(file)) 
//        {
//            response.setContentType("application/pdf");
//            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
//            try
//            {
//                Files.copy(file, response.getOutputStream());
//                response.getOutputStream().flush();
//            } 
//            catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }

    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editInvoice(ModelMap map, @PathVariable("id") int id){
        Invoice invoice = invoiceService.getById(id);
        map.addAttribute("invoice", invoice);
        return new ModelAndView("/admin_dashbord/edit-invoice");
    }
    
    
}
