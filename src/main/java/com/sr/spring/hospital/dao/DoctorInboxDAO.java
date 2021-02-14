/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IDoctorInboxDaoImpl;
import com.sr.spring.hospital.model.DoctorInbox;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "doctorInbox")
@Transactional
public class DoctorInboxDAO implements IDoctorInboxDaoImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public DoctorInbox save(DoctorInbox t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public DoctorInbox update(DoctorInbox t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public DoctorInbox delete(int id) {
        DoctorInbox p =(DoctorInbox) sessionFactory.getCurrentSession().load(DoctorInbox.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public DoctorInbox getById(int id) {
        DoctorInbox p = (DoctorInbox) sessionFactory.getCurrentSession().get(DoctorInbox.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<DoctorInbox> getList() {
        List<DoctorInbox> pList = sessionFactory.getCurrentSession().createCriteria(DoctorInbox.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
