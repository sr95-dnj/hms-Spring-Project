/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IPatientDaoImpl;
import com.sr.spring.hospital.model.ApproveAppointment;
import com.sr.spring.hospital.model.Patient;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "patient")
@Transactional
public class PatientDAO implements IPatientDaoImpl{

    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public Patient save(Patient t) {
         sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Patient update(Patient t) {
      sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;  
    }

    @Override
    public Patient delete(int id) {
        Patient d = (Patient) sessionFactory.getCurrentSession().load(Patient.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Patient getById(int id) {
        Patient d = (Patient) sessionFactory.getCurrentSession().get(Patient.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public List<Patient> getList() {
        List<Patient> dList = sessionFactory.getCurrentSession().createCriteria(Patient.class).list();
        sessionFactory.getCurrentSession().flush();
        return dList;
    }

    @Override
    public long getCount() {
        String hql = "select count(*) from patient";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count=(long) q.uniqueResult();
        return count;
    }

    
    
    @Override
    public List<Patient> searchPatient(String name) {
        String hql = "from patient where name = :name";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("name", name);
        
        List<Patient> searchList = q.list();
        sessionFactory.getCurrentSession().flush();
        return searchList;
    }

    @Override
    public Patient searchByMobile(String mobile) {
        String hql = "from patient where mobile = :mobile";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("mobile", mobile);
        
        Patient p = (Patient) q.uniqueResult();
        if(p != null){
            return p;
        }else{
            return null;
        }
    }

    @Override
    public Patient downloadInvoice(String mobile) {
        String hql = "from patient where mobile = :mobile";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("mobile", mobile);
        
        Patient p = (Patient) q.uniqueResult();
        if(p != null){
            return p;
        }else{
            return null;
        }
    }
    
       @Override
    public List<Patient> getList(String code) {
          String hql = "from patient where doctorCode = '"+code+"'";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Patient> pList = sessionFactory.getCurrentSession().createQuery(hql).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
