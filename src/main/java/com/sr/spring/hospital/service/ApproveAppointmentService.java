/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;

import com.sr.spring.hospital.dao.impl.IAppointmentDAOImpl;
import com.sr.spring.hospital.dao.impl.IApproveAppointmentDaoImpl;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.service.impl.IApproveAppointmentServiceImpl;
import com.sr.spring.hospital.service.impl.IApproveAppointmentServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "approveAppointmentService")
public class ApproveAppointmentService implements IApproveAppointmentServiceImpl {

    @Autowired
    IApproveAppointmentDaoImpl approveDAO;
    
   

    @Autowired
    IAppointmentDAOImpl appointDao;

    @Override
    public ApproveAppointment save(HttpServletRequest request) {
      
        String aDate = request.getParameter("appointDate");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String doctor = request.getParameter("doctor");
        String department = request.getParameter("department");
        String comment = request.getParameter("comment");
        String doctorCode = request.getParameter("doctorCode");

        ApproveAppointment a = new ApproveAppointment();

        a.setAppointDate(aDate);
        a.setDoctorCode(doctorCode);
        a.setName(name);
        a.setAddress(address);
        a.setMobile(mobile);
        a.setDoctor(doctor);
        a.setDepartment(department);
        a.setComment(comment);
        
         
        approveDAO.save(a);
        

        return approveDAO.save(a);

    }

    @Override
    public ApproveAppointment update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        ApproveAppointment a = new ApproveAppointment();

        a.setComment(map.get("comment")[0]);
        return approveDAO.update(a);
    }

    @Override
    public ApproveAppointment delete(int id) {
        return approveDAO.delete(id);
    }

    @Override
    public ApproveAppointment getById(int id) {
        return approveDAO.getById(id);
    }

    @Override
    public List<ApproveAppointment> getList() {
        List<ApproveAppointment> pList = approveDAO.getList();
        return pList;
    }
    
    
    //sir
       @Override
    public List<ApproveAppointment> getList(String code) {
        List<ApproveAppointment> pList = approveDAO.getList(code);
        return pList;
    }

}
