/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;
import com.sr.spring.hospital.model.Doctor;
import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IDoctorDAOImpl extends IDAO<Doctor>{
   public Doctor getLogin(String user_name, String password);
        
    long getCount();
    
    public List<Doctor> getEmail();
    
    public Doctor getDetails(String first_name);
    public Doctor getDetail(String email);
    
    
    
    
    
}
