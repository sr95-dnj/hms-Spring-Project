/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Siddiquer Rahman
 */
@Entity(name = "prescription")
public class Prescription {
    @Id
    
    private int id;
    private String admitedDate;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String age;
    private String bloodGroup;
    private String disease;
    private String referenceDoctor;
    private String department;
    private String doctorCode;
   
    private String roomNo;
    private String comment; 
    private String pDate;
    
    private String pathology1;
    private String pathology2;
    private String pathology3;
    private String pathology4;
    private String pathology5;
    private String medicine1;
    private String morning1;
    private String afternoon1;
    private String evening1;
    private String before1;
    private String after1;
    private String medicine2;
    private String morning2;
    private String afternoon2;
    private String evening2;
    private String before2;
    private String after2;
    private String medicine3;
    private String morning3;
    private String afternoon3;
    private String evening3;
    private String before3;
    private String after3;
    private String medicine4;
    private String morning4;
    private String afternoon4;
    private String evening4;
    private String before4;
    private String after4;
    private String medicine5;
    private String morning5;
    private String afternoon5;
    private String evening5;
    private String before5;
    private String after5;
    private String status;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getReferenceDoctor() {
        return referenceDoctor;
    }

    public void setReferenceDoctor(String referenceDoctor) {
        this.referenceDoctor = referenceDoctor;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getPathology1() {
        return pathology1;
    }

    public void setPathology1(String pathology1) {
        this.pathology1 = pathology1;
    }

    public String getPathology2() {
        return pathology2;
    }

    public void setPathology2(String pathology2) {
        this.pathology2 = pathology2;
    }

    public String getPathology3() {
        return pathology3;
    }

    public void setPathology3(String pathology3) {
        this.pathology3 = pathology3;
    }

    public String getPathology4() {
        return pathology4;
    }

    public void setPathology4(String pathology4) {
        this.pathology4 = pathology4;
    }

    public String getPathology5() {
        return pathology5;
    }

    public void setPathology5(String pathology5) {
        this.pathology5 = pathology5;
    }

    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMorning1() {
        return morning1;
    }

    public void setMorning1(String morning1) {
        this.morning1 = morning1;
    }

    public String getAfternoon1() {
        return afternoon1;
    }

    public void setAfternoon1(String afternoon1) {
        this.afternoon1 = afternoon1;
    }

    public String getEvening1() {
        return evening1;
    }

    public void setEvening1(String evening1) {
        this.evening1 = evening1;
    }

    public String getBefore1() {
        return before1;
    }

    public void setBefore1(String before1) {
        this.before1 = before1;
    }

    public String getAfter1() {
        return after1;
    }

    public void setAfter1(String after1) {
        this.after1 = after1;
    }

    public String getMedicine2() {
        return medicine2;
    }

    public void setMedicine2(String medicine2) {
        this.medicine2 = medicine2;
    }

    public String getMorning2() {
        return morning2;
    }

    public void setMorning2(String morning2) {
        this.morning2 = morning2;
    }

    public String getAfternoon2() {
        return afternoon2;
    }

    public void setAfternoon2(String afternoon2) {
        this.afternoon2 = afternoon2;
    }

    public String getEvening2() {
        return evening2;
    }

    public void setEvening2(String evening2) {
        this.evening2 = evening2;
    }

    public String getBefore2() {
        return before2;
    }

    public void setBefore2(String before2) {
        this.before2 = before2;
    }

    public String getAfter2() {
        return after2;
    }

    public void setAfter2(String after2) {
        this.after2 = after2;
    }

    public String getMedicine3() {
        return medicine3;
    }

    public void setMedicine3(String medicine3) {
        this.medicine3 = medicine3;
    }

    public String getMorning3() {
        return morning3;
    }

    public void setMorning3(String morning3) {
        this.morning3 = morning3;
    }

    public String getAfternoon3() {
        return afternoon3;
    }

    public void setAfternoon3(String afternoon3) {
        this.afternoon3 = afternoon3;
    }

    public String getEvening3() {
        return evening3;
    }

    public void setEvening3(String evening3) {
        this.evening3 = evening3;
    }

    public String getBefore3() {
        return before3;
    }

    public void setBefore3(String before3) {
        this.before3 = before3;
    }

    public String getAfter3() {
        return after3;
    }

    public void setAfter3(String after3) {
        this.after3 = after3;
    }

    public String getMedicine4() {
        return medicine4;
    }

    public void setMedicine4(String medicine4) {
        this.medicine4 = medicine4;
    }

    public String getMorning4() {
        return morning4;
    }

    public void setMorning4(String morning4) {
        this.morning4 = morning4;
    }

    public String getAfternoon4() {
        return afternoon4;
    }

    public void setAfternoon4(String afternoon4) {
        this.afternoon4 = afternoon4;
    }

    public String getEvening4() {
        return evening4;
    }

    public void setEvening4(String evening4) {
        this.evening4 = evening4;
    }

    public String getBefore4() {
        return before4;
    }

    public void setBefore4(String before4) {
        this.before4 = before4;
    }

    public String getAfter4() {
        return after4;
    }

    public void setAfter4(String after4) {
        this.after4 = after4;
    }

    public String getMedicine5() {
        return medicine5;
    }

    public void setMedicine5(String medicine5) {
        this.medicine5 = medicine5;
    }

    public String getMorning5() {
        return morning5;
    }

    public void setMorning5(String morning5) {
        this.morning5 = morning5;
    }

    public String getAfternoon5() {
        return afternoon5;
    }

    public void setAfternoon5(String afternoon5) {
        this.afternoon5 = afternoon5;
    }

    public String getEvening5() {
        return evening5;
    }

    public void setEvening5(String evening5) {
        this.evening5 = evening5;
    }

    public String getBefore5() {
        return before5;
    }

    public void setBefore5(String before5) {
        this.before5 = before5;
    }

    public String getAfter5() {
        return after5;
    }

    public void setAfter5(String after5) {
        this.after5 = after5;
    }

    public String getAdmitedDate() {
        return admitedDate;
    }

    public void setAdmitedDate(String admitedDate) {
        this.admitedDate = admitedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
    
}
