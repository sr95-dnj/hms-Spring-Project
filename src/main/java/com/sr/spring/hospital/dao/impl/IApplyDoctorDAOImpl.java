/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;
import com.sr.spring.hospital.model.ApplyDoctor;
import com.sr.spring.hospital.model.Doctor;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IApplyDoctorDAOImpl extends IDAO<ApplyDoctor>{
    long getCount();
    public ApplyDoctor getLogin(String user_name, String password);
}
