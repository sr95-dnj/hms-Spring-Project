/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;

import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.model.Patient;
import com.sr.spring.hospital.service.impl.IPatientServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "patientService")
public class PatientService implements IPatientServiceImpl {

    @Autowired
    IPatientDaoImpl patientDAO;

    @Override
    public Patient save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        Patient d = new Patient();
        d.setAdmitedDate(map.get("admitedDate")[0]);
        d.setName(map.get("name")[0]);
        d.setDoctorCode(map.get("doctorCode")[0]);
        d.setAddress(map.get("address")[0]);
        d.setMobile(map.get("mobile")[0]);
        d.setEmail(map.get("email")[0]);
        d.setAge(map.get("age")[0]);
        d.setBloodGroup(map.get("bloodGroup")[0]);
        d.setDisease(map.get("disease")[0]);
        d.setReferenceDoctor(map.get("referenceDoctor")[0]);
        d.setDepartment(map.get("department")[0]);
        d.setRoomNo(map.get("roomNo")[0]);
        d.setComment(map.get("comment")[0]);

        return patientDAO.save(d);

    }

    @Override
    public Patient update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Patient d = new Patient();
        d.setId(Integer.parseInt(map.get("id")[0]));
        d.setAdmitedDate(map.get("admitedDate")[0]);
        d.setName(map.get("name")[0]);
        d.setAddress(map.get("address")[0]);
        d.setMobile(map.get("mobile")[0]);
        d.setEmail(map.get("email")[0]);
        d.setAge(map.get("age")[0]);
        d.setBloodGroup(map.get("bloodGroup")[0]);
        d.setDisease(map.get("disease")[0]);
        d.setDoctorCode(map.get("doctorCode")[0]);
        d.setReferenceDoctor(map.get("referenceDoctor")[0]);
        d.setDepartment(map.get("department")[0]);
        d.setRoomNo(map.get("roomNo")[0]);
        d.setComment(map.get("comment")[0]);

        return patientDAO.update(d);
    }

    @Override
    public Patient delete(int id) {
        return patientDAO.delete(id);
    }

    @Override
    public Patient getById(int id) {
        return patientDAO.getById(id);
    }

    @Override
    public List<Patient> getList() {
        List<Patient> dList = patientDAO.getList();

        return dList;
    }

}
