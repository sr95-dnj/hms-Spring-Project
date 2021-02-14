/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;

import com.sr.spring.hospital.dao.impl.IAppointmentDAOImpl;
import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.model.Appointment;
import com.sr.spring.hospital.model.Doctor;
import com.sr.spring.hospital.service.impl.IAppointmentServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "appointmentService")
public class AppointmentService implements IAppointmentServiceImpl{

    @Autowired
    IAppointmentDAOImpl appointmentDao;
    @Autowired
    IDoctorDAOImpl doctorDao;
    
    @Override
    public Appointment save(HttpServletRequest request) {
        String aDate = request.getParameter("appointment_date");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String doctor = request.getParameter("doctor");
        String department = request.getParameter("department");
        String comment = request.getParameter("comment");
        String docCode = request.getParameter("doctorCode");
        
        Appointment a = new Appointment();
        a.setAppointment_date(aDate);
        a.setName(name);
        a.setAddress(address);
        a.setMobile(mobile);
        a.setDoctor(doctor);
        a.setComment(comment);
        a.setDepartment(department);
        a.setDoctorCode(docCode);
        return appointmentDao.save(a);
        
        
//        Map<String, String[]> map = request.getParameterMap();
//        Appointment a = new Appointment();
//        a.setAppointment_date(map.get("appointment_date")[0]);
//        a.setName(map.get("name")[0]);
//        a.setAddress(map.get("address")[0]);
//        a.setMobile(map.get("mobile")[0]);
//        a.setDoctor(map.get("doctor")[0]);
//        a.setComment(map.get("comment")[0]);
//        return appointmentDao.save(a);
    }

    @Override
    public Appointment update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String aDate = request.getParameter("appointment_date");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String doctor = request.getParameter("doctor");
        String comment = request.getParameter("comment");
        
        Appointment a = new Appointment();
        a.setId(id);
        a.setAppointment_date(aDate);
        a.setName(name);
        a.setAddress(address);
        a.setMobile(mobile);
        a.setDoctor(doctor);
        a.setComment(comment);
     
//        Map<String, String[]> map = request.getParameterMap();
//        Appointment a = new Appointment();
//        a.setId(Integer.parseInt(map.get("id")[0]));
//        a.setAppointment_date(map.get("appointment_date")[0]);
//        a.setName(map.get("name")[0]);
//        a.setAddress(map.get("address")[0]);
//        a.setMobile(map.get("mobile")[0]);
//         a.setDoctor(map.get("doctor")[0]);
//        a.setComment(map.get("comment")[0]);
        return appointmentDao.update(a);
    }

    @Override
    public Appointment delete(int id) {
        return appointmentDao.delete(id);
    }

    @Override
    public Appointment getById(int id) {
        return appointmentDao.getById(id);
    
    }

    @Override
    public List<Appointment> getList() {
        List<Appointment> aList = appointmentDao.getList();
        return aList;
        
        
    }
    
}
