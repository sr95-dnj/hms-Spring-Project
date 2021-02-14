/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;
import com.sr.spring.hospital.model.Patient;
import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IPatientDaoImpl extends IDAO<Patient>{
    long getCount();
    
    public List<Patient> searchPatient(String name);
    
    public Patient searchByMobile(String mobile);
    
    public Patient downloadInvoice(String mobile);
    
    List<Patient> getList(String code);
}
