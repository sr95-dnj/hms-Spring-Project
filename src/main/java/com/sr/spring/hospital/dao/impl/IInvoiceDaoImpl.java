/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;

import com.sr.spring.hospital.model.Invoice;
import com.sr.spring.hospital.model.Patient;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IInvoiceDaoImpl extends IDAO<Invoice>{
    public Invoice searchByMobile(String mobile);
    
    public Invoice searchByMobileAndBloodGroup(String mobile, String bloodGroup);
}
