/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;



import com.sr.spring.hospital.dao.impl.IPrescriptionDAOImpl;

import com.sr.spring.hospital.model.Prescription;
import com.sr.spring.hospital.service.impl.IPrescriptionServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "prescriptionService")
public class PrescriptionService implements IPrescriptionServiceImpl{

    @Autowired
    IPrescriptionDAOImpl prescriptionDao;
    @Override
    public Prescription save(HttpServletRequest request) {
       
       
       
       String name=request.getParameter("name");
       String address=request.getParameter("address");
       String mobile=request.getParameter("mobile");
       String disease=request.getParameter("disease");
       String referenceDoctor=request.getParameter("referenceDoctor");
       String department=request.getParameter("department");
       
       String email=request.getParameter("email");
       String age=request.getParameter("age");
       String blood=request.getParameter("bloodGroup");
       String roomNo=request.getParameter("roomNo");
       String comment=request.getParameter("comment");
       String admitedDate=request.getParameter("admitedDate");
       
       String doctorCode=request.getParameter("doctorCode");
       
       
       String pDate=request.getParameter("pDate");
       
       
       String pathology1=request.getParameter("pathology1");
       String pathology2=request.getParameter("pathology2");
       String pathology3=request.getParameter("pathology3");
       String pathology4=request.getParameter("pathology4");
       String pathology5=request.getParameter("pathology5");
       
       String medicine1=request.getParameter("medicine1");
       String medicine2=request.getParameter("medicine2");
       String medicine3=request.getParameter("medicine3");
       String medicine4=request.getParameter("medicine4");
       String medicine5=request.getParameter("medicine5");
       
       String morning1=request.getParameter("morning1");
       String morning2=request.getParameter("morning2");
       String morning3=request.getParameter("morning3");
       String morning4=request.getParameter("morning4");
       String morning5=request.getParameter("morning5");
       
       String afternoon1=request.getParameter("afternoon1");
       String afternoon2=request.getParameter("afternoon2");
       String afternoon3=request.getParameter("afternoon3");
       String afternoon4=request.getParameter("afternoon4");
       String afternoon5=request.getParameter("afternoon5");
       
       String evening1=request.getParameter("evening1");
       String evening2=request.getParameter("evening2");
       String evening3=request.getParameter("evening3");
       String evening4=request.getParameter("evening4");
       String evening5=request.getParameter("evening5");
       
       String before1=request.getParameter("before1");
       String before2=request.getParameter("before2");
       String before3=request.getParameter("before3");
       String before4=request.getParameter("before4");
       String before5=request.getParameter("before5");
       
       String after1=request.getParameter("after1");
       String after2=request.getParameter("after2");
       String after3=request.getParameter("after3");
       String after4=request.getParameter("after4");
       String after5=request.getParameter("after5");
       
       String status=request.getParameter("status");
       
       Prescription p = new Prescription();
       
     
       
       p.setName(name);
       p.setAddress(address);
       p.setMobile(mobile);
       p.setDisease(disease);
       p.setpDate(pDate);
       p.setReferenceDoctor(referenceDoctor);
       p.setDepartment(department);
       
       p.setEmail(email);
       p.setAge(age);
       p.setBloodGroup(blood);
       p.setRoomNo(roomNo);
       p.setComment(comment);
       p.setDoctorCode(doctorCode);
       p.setAdmitedDate(admitedDate);
       
       p.setPathology1(pathology1);
       p.setPathology2(pathology2);
       p.setPathology3(pathology3);
       p.setPathology4(pathology4);
       p.setPathology5(pathology5);
       
       p.setMedicine1(medicine1);
       p.setMedicine2(medicine2);
       p.setMedicine3(medicine3);
       p.setMedicine4(medicine4);
       p.setMedicine5(medicine5);
       
       p.setMorning1(morning1);
       p.setMorning2(morning2);
       p.setMorning3(morning3);
       p.setMorning4(morning4);
       p.setMorning5(morning5);
       
       p.setAfternoon1(afternoon1);
       p.setAfternoon2(afternoon2);
       p.setAfternoon3(afternoon3);
       p.setAfternoon4(afternoon4);
       p.setAfternoon5(afternoon5);
       
       p.setEvening1(evening1);
       p.setEvening2(evening2);
       p.setEvening3(evening3);
       p.setEvening4(evening4);
       p.setEvening5(evening5);
       
       p.setBefore1(before1);
       p.setBefore2(before2);
       p.setBefore3(before3);
       p.setBefore4(before4);
       p.setBefore5(before5);
       
       p.setAfter1(after1);
       p.setAfter2(after2);
       p.setAfter3(after3);
       p.setAfter4(after4);
       p.setAfter5(after5);
       
       p.setStatus(status);
       
       
       return prescriptionDao.save(p);
       
     
    }

    @Override
    public Prescription update(HttpServletRequest request) {
    return null;
    }

    @Override
    public Prescription delete(int id) {
        return prescriptionDao.delete(id);
    }

    @Override
    public Prescription getById(int id) {
        return prescriptionDao.getById(id);
    }

    @Override
    public List<Prescription> getList() {
       List<Prescription> pList = prescriptionDao.getList();
       return pList;
    }

   
    
}
