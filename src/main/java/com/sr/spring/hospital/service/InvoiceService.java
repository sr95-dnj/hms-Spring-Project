/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;


import com.sr.spring.hospital.dao.impl.IInvoiceDaoImpl;
import com.sr.spring.hospital.model.Invoice;
import com.sr.spring.hospital.service.impl.IInvoiceServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "invoiceService")
public class InvoiceService implements IInvoiceServiceImpl{

    @Autowired
    IInvoiceDaoImpl invoiceDao;
    
    @Override
    public Invoice save(HttpServletRequest request) {
        
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String doctor = request.getParameter("referenceDoctor");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String pAddress = request.getParameter("address");
        String bAddress = request.getParameter("billingAddress");
        String date = request.getParameter("invoiceDate");
        Double roomCharge = Double.parseDouble(request.getParameter("roomCharge"));
        Double doctorCharge = Double.parseDouble(request.getParameter("doctorCharge"));
        Double pathologyCharge = Double.parseDouble(request.getParameter("pathologyCharge"));
        Double othersCharge = Double.parseDouble(request.getParameter("othersCharge"));
        Double totalAmount = Double.parseDouble(request.getParameter("totalAmount"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        Double grandTotal = (totalAmount - (totalAmount * discount) /100);
        String others = request.getParameter("others");
        
        String admitedDate = request.getParameter("admitedDate");
        String age = request.getParameter("age");
        String blood = request.getParameter("bloodGroup");
        String disease = request.getParameter("disease");
        String roomNo = request.getParameter("roomNo");
        String comment = request.getParameter("comment");
        String pDate = request.getParameter("pDate");
        
        String pathology1 = request.getParameter("pathology1");
        String pathology2 = request.getParameter("pathology2");
        String pathology3 = request.getParameter("pathology3");
        String pathology4 = request.getParameter("pathology4");
        String pathology5 = request.getParameter("pathology5");
        
        String medicine1 = request.getParameter("medicine1");
        String medicine2 = request.getParameter("medicine2");
        String medicine3 = request.getParameter("medicine3");
        String medicine4 = request.getParameter("medicine4");
        String medicine5 = request.getParameter("medicine5");
        
        String morning1 = request.getParameter("morning1");
        String morning2 = request.getParameter("morning2");
        String morning3 = request.getParameter("morning3");
        String morning4 = request.getParameter("morning4");
        String morning5 = request.getParameter("morning5");
        
        String afternoon1 = request.getParameter("afternoon1");
        String afternoon2 = request.getParameter("afternoon2");
        String afternoon3 = request.getParameter("afternoon3");
        String afternoon4 = request.getParameter("afternoon4");
        String afternoon5 = request.getParameter("afternoon5");
        
        String evening1 = request.getParameter("evening1");
        String evening2 = request.getParameter("evening2");
        String evening3 = request.getParameter("evening3");
        String evening4 = request.getParameter("evening4");
        String evening5 = request.getParameter("evening5");
        
        String before1 = request.getParameter("before1");
        String before2 = request.getParameter("before2");
        String before3 = request.getParameter("before3");
        String before4 = request.getParameter("before4");
        String before5 = request.getParameter("before5");
        
        String after1 = request.getParameter("after1");
        String after2 = request.getParameter("after2");
        String after3 = request.getParameter("after3");
        String after4 = request.getParameter("after4");
        String after5 = request.getParameter("after5");
        
        String status = request.getParameter("status");
        
        
        
        Invoice i = new Invoice();
        i.setName(name);
        i.setDepartment(department);
        i.setReferenceDoctor(doctor);
        i.setEmail(email);
        i.setMobile(mobile);
        i.setAddress(pAddress);
        i.setBillingAddress(bAddress);
        i.setInvoiceDate(date);
        i.setRoomCharge(roomCharge);
        i.setDoctorCharge(doctorCharge);
        i.setPathologyCharge(pathologyCharge);
        i.setOthersCharge(othersCharge);
        i.setTotalAmount(totalAmount);
        i.setDiscount(discount);
        i.setGrandTotal(grandTotal);
        i.setOthers(others);
        
        
        i.setAdmitedDate(admitedDate);
        i.setAge(age);
        i.setBloodGroup(blood);
        i.setDisease(disease);
        i.setRoomNo(roomNo);
        i.setComment(comment);
        i.setpDate(pDate);
        
        i.setPathology1(pathology1);
        i.setPathology2(pathology2);
        i.setPathology3(pathology3);
        i.setPathology4(pathology4);
        i.setPathology5(pathology5);
        
        i.setMedicine1(medicine1);
        i.setMedicine2(medicine2);
        i.setMedicine3(medicine3);
        i.setMedicine4(medicine4);
        i.setMedicine5(medicine5);
        
        i.setMorning1(morning1);
        i.setMorning2(morning2);
        i.setMorning3(morning3);
        i.setMorning4(morning4);
        i.setMorning5(morning5);
        
        i.setAfternoon1(afternoon1);
        i.setAfternoon2(afternoon2);
        i.setAfternoon3(afternoon3);
        i.setAfternoon4(afternoon4);
        i.setAfternoon5(afternoon5);
        
        i.setEvening1(evening1);
        i.setEvening2(evening2);
        i.setEvening3(evening3);
        i.setEvening4(evening4);
        i.setEvening5(evening5);
        
        i.setBefore1(before1);
        i.setBefore2(before2);
        i.setBefore3(before3);
        i.setBefore4(before4);
        i.setBefore5(before5);
        
        i.setAfter1(after1);
        i.setAfter2(after2);
        i.setAfter3(after3);
        i.setAfter4(after4);
        i.setAfter5(after5);
        
        i.setStatus(status);
        
        
        
       
        return invoiceDao.save(i);
    }

    @Override
    public Invoice update(HttpServletRequest request) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String doctor = request.getParameter("referenceDoctor");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String pAddress = request.getParameter("address");
        String bAddress = request.getParameter("billingAddress");
        String date = request.getParameter("invoiceDate");
        Double roomCharge = Double.parseDouble(request.getParameter("roomCharge"));
        Double doctorCharge = Double.parseDouble(request.getParameter("doctorCharge"));
        Double pathologyCharge = Double.parseDouble(request.getParameter("pathologyCharge"));
        Double othersCharge = Double.parseDouble(request.getParameter("othersCharge"));
        Double totalAmount = Double.parseDouble(request.getParameter("totalAmount"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        Double grandTotal = (totalAmount - (totalAmount * discount) /100);
        String others = request.getParameter("others");
        
        String admitedDate = request.getParameter("admitedDate");
        String age = request.getParameter("age");
        String blood = request.getParameter("bloodGroup");
        String disease = request.getParameter("disease");
        String roomNo = request.getParameter("roomNo");
        String comment = request.getParameter("comment");
        String pDate = request.getParameter("pDate");
        
        String pathology1 = request.getParameter("pathology1");
        String pathology2 = request.getParameter("pathology2");
        String pathology3 = request.getParameter("pathology3");
        String pathology4 = request.getParameter("pathology4");
        String pathology5 = request.getParameter("pathology5");
        
        String medicine1 = request.getParameter("medicine1");
        String medicine2 = request.getParameter("medicine2");
        String medicine3 = request.getParameter("medicine3");
        String medicine4 = request.getParameter("medicine4");
        String medicine5 = request.getParameter("medicine5");
        
        String morning1 = request.getParameter("morning1");
        String morning2 = request.getParameter("morning2");
        String morning3 = request.getParameter("morning3");
        String morning4 = request.getParameter("morning4");
        String morning5 = request.getParameter("morning5");
        
        String afternoon1 = request.getParameter("afternoon1");
        String afternoon2 = request.getParameter("afternoon2");
        String afternoon3 = request.getParameter("afternoon3");
        String afternoon4 = request.getParameter("afternoon4");
        String afternoon5 = request.getParameter("afternoon5");
        
        String evening1 = request.getParameter("evening1");
        String evening2 = request.getParameter("evening2");
        String evening3 = request.getParameter("evening3");
        String evening4 = request.getParameter("evening4");
        String evening5 = request.getParameter("evening5");
        
        String before1 = request.getParameter("before1");
        String before2 = request.getParameter("before2");
        String before3 = request.getParameter("before3");
        String before4 = request.getParameter("before4");
        String before5 = request.getParameter("before5");
        
        String after1 = request.getParameter("after1");
        String after2 = request.getParameter("after2");
        String after3 = request.getParameter("after3");
        String after4 = request.getParameter("after4");
        String after5 = request.getParameter("after5");
        
        String status = request.getParameter("status");
        
        Invoice i = new Invoice();
        i.setId(id);
        i.setName(name);
        i.setDepartment(department);
        i.setReferenceDoctor(doctor);
        i.setEmail(email);
        i.setMobile(mobile);
        i.setAddress(pAddress);
        i.setBillingAddress(bAddress);
        i.setInvoiceDate(date);
        i.setRoomCharge(roomCharge);
        i.setDoctorCharge(doctorCharge);
        i.setPathologyCharge(pathologyCharge);
        i.setOthersCharge(othersCharge);
        i.setTotalAmount(totalAmount);
        i.setDiscount(discount);
        i.setGrandTotal(grandTotal);
        i.setOthers(others);
        
        
        i.setAdmitedDate(admitedDate);
        i.setAge(age);
        i.setBloodGroup(blood);
        i.setDisease(disease);
        i.setRoomNo(roomNo);
        i.setComment(comment);
        i.setpDate(pDate);
        
        i.setPathology1(pathology1);
        i.setPathology2(pathology2);
        i.setPathology3(pathology3);
        i.setPathology4(pathology4);
        i.setPathology5(pathology5);
        
        i.setMedicine1(medicine1);
        i.setMedicine2(medicine2);
        i.setMedicine3(medicine3);
        i.setMedicine4(medicine4);
        i.setMedicine5(medicine5);
        
        i.setMorning1(morning1);
        i.setMorning2(morning2);
        i.setMorning3(morning3);
        i.setMorning4(morning4);
        i.setMorning5(morning5);
        
        i.setAfternoon1(afternoon1);
        i.setAfternoon2(afternoon2);
        i.setAfternoon3(afternoon3);
        i.setAfternoon4(afternoon4);
        i.setAfternoon5(afternoon5);
        
        i.setEvening1(evening1);
        i.setEvening2(evening2);
        i.setEvening3(evening3);
        i.setEvening4(evening4);
        i.setEvening5(evening5);
        
        i.setBefore1(before1);
        i.setBefore2(before2);
        i.setBefore3(before3);
        i.setBefore4(before4);
        i.setBefore5(before5);
        
        i.setAfter1(after1);
        i.setAfter2(after2);
        i.setAfter3(after3);
        i.setAfter4(after4);
        i.setAfter5(after5);
        
        i.setStatus(status);
        
        
        return invoiceDao.update(i);
    
    }

    @Override
    public Invoice delete(int id) {
        return invoiceDao.delete(id);
    }

    @Override
    public Invoice getById(int id) {
        return invoiceDao.getById(id);
    }

    @Override
    public List<Invoice> getList() {
        List<Invoice> dList = invoiceDao.getList();
        return dList;
    }
    
}
