/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service.impl;

import com.sr.spring.hospital.common.IService;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.model.Department;
import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IApproveAppointmentServiceImpl extends IService<ApproveAppointment>{
    public List<ApproveAppointment> getList(String code);
}
