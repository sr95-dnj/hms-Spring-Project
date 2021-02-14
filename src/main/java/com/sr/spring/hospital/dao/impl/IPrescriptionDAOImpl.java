/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;
import com.sr.spring.hospital.model.Patient;


import com.sr.spring.hospital.model.Prescription;
import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IPrescriptionDAOImpl extends IDAO<Prescription>{
    List<Prescription> getList(String code);
}
