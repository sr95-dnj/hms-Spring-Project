/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IAdminInboxDaoImpl;
import com.sr.spring.hospital.dao.impl.IAdminInboxDaoImpl;
import com.sr.spring.hospital.model.AdminInbox;
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

@Repository(value = "adminInbox")
@Transactional
public class AdminInboxDAO implements IAdminInboxDaoImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AdminInbox save(AdminInbox t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AdminInbox update(AdminInbox t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public AdminInbox delete(int id) {
        AdminInbox p =(AdminInbox) sessionFactory.getCurrentSession().load(AdminInbox.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public AdminInbox getById(int id) {
        AdminInbox p = (AdminInbox) sessionFactory.getCurrentSession().get(AdminInbox.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<AdminInbox> getList() {
        List<AdminInbox> pList = sessionFactory.getCurrentSession().createCriteria(AdminInbox.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
       @Override
    public List<AdminInbox> getList(String code) {
          String hql = "from adminInbox where doctorCode = '"+code+"'";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<AdminInbox> pList = sessionFactory.getCurrentSession().createQuery(hql).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
