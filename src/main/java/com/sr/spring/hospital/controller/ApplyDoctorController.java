/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IApplyDoctorControllerImpl;
import com.sr.spring.hospital.dao.impl.IApplyDoctorDAOImpl;
import com.sr.spring.hospital.model.ApplyDoctor;
import com.sr.spring.hospital.model.Doctor;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "applyDoctor")
public class ApplyDoctorController implements IApplyDoctorControllerImpl{
    
    @Autowired
    ServletContext servletContext;
    
    @Autowired
    IApplyDoctorDAOImpl doctorDao;
    

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

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        ApplyDoctor d = doctorDao.delete(id);
        
        return new ModelAndView("redirect:/applyDoctor/applyDoctorList");
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/applyDoctorList", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ApplyDoctor> docList = doctorDao.getList();
        map.put("docList", docList);
        return new ModelAndView("/admin_dashbord/apply-doctor", "map", map);
    }
    
    
    private void saveFile(MultipartFile file, String fileName, String path) throws IOException {
		      System.out.println("Start");
        
        byte[] bytes  = file.getBytes();
	
		String filePath = servletContext.getRealPath(path);
		File directory = new File(filePath);
		File cFile = new File(
                        "E:\\Project\\Spring Project\\hms1\\hms\\src\\main\\webapp\\resources\\assets\\img"
				+ File.separator + fileName);

		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(cFile));
		stream.write(bytes);
		stream.close();
              System.out.println(cFile);
	}
    
    
    @RequestMapping(value = "/store", method = RequestMethod.POST)
     public ModelAndView store( HttpServletRequest request, @RequestParam("image") MultipartFile file) throws IOException, ServletException {
       String firstName = request.getParameter("first_name");
       String lastName = request.getParameter("last_name");
       String department = request.getParameter("department");
       String userName = request.getParameter("user_name");
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       String address = request.getParameter("address");
       String phone = request.getParameter("phone");
       String bio = request.getParameter("bio");
       
       if(!file.isEmpty()){
           String image = file.getOriginalFilename();
           saveFile(file, image, "/resources/img");
           
           ApplyDoctor d = new ApplyDoctor();
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
       return new ModelAndView("redirect:/applyDoctor/loginPage");
     }
     
     @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
     public ModelAndView loginpage(){
         return new ModelAndView("/doctor/doctor-login");
     }
    
    
    
    
    
}
