/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;


import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.service.impl.IDoctorServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */

@Service(value = "doctorService")
public class DoctorService implements IDoctorServiceImpl{

    @Autowired
    IDoctorDAOImpl doctorDAO;
    
    @Override
    public Doctor save(HttpServletRequest request) {
        Map<String, String[]> map=request.getParameterMap();
        
        Doctor d = new Doctor();
        d.setFirst_name(map.get("first_name")[0]);
        d.setLast_name(map.get("last_name")[0]);
        d.setUser_name(map.get("user_name")[0]);
        d.setEmail(map.get("email")[0]);
        d.setPassword(map.get("password")[0]);
        
        d.setAddress(map.get("address")[0]);
        d.setPhone(map.get("phone")[0]);
        d.setBio(map.get("bio")[0]);
        d.setImage(map.get("image")[0]);
        
        return doctorDAO.save(d);
    
    }

    @Override
    public Doctor update(HttpServletRequest request) {
        Map<String, String[]> map=request.getParameterMap();
        
        Doctor d = new Doctor();
        d.setId(Integer.parseInt(map.get("id")[0]));
        d.setFirst_name(map.get("first_name")[0]);
        d.setLast_name(map.get("last_name")[0]);
        d.setUser_name(map.get("user_name")[0]);
        d.setEmail(map.get("email")[0]);
        d.setPassword(map.get("password")[0]);
      
        d.setAddress(map.get("address")[0]);
        d.setPhone(map.get("phone")[0]);
        d.setBio(map.get("bio")[0]);
        d.setImage(map.get("image")[0]);
        
        return doctorDAO.update(d);
    }

    @Override
    public Doctor delete(int id) {
        return doctorDAO.delete(id);
    }

    @Override
    public Doctor getById(int id) {
        return doctorDAO.getById(id);
    }

    @Override
    public List<Doctor> getList() {
        List<Doctor> dList = doctorDAO.getList();
        
            
        return dList;
    }
    
    
    
}
