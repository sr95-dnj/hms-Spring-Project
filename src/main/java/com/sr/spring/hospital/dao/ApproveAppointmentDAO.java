/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.controller.impl.IApproveAppointmentContorllerImpl;
import com.sr.spring.hospital.dao.impl.IApproveAppointmentDaoImpl;

import com.sr.spring.hospital.model.ApproveAppointment;
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
@Repository(value = "approveAppointment")
@Transactional
public class ApproveAppointmentDAO implements IApproveAppointmentDaoImpl {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ApproveAppointment save(ApproveAppointment t) {

        int id = (int) sessionFactory.getCurrentSession().save(t);
        System.out.println(".........." + id);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ApproveAppointment update(ApproveAppointment t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;

    }

    @Override
    public ApproveAppointment delete(int id) {
        ApproveAppointment p = (ApproveAppointment) sessionFactory.getCurrentSession().load(ApproveAppointment.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public ApproveAppointment getById(int id) {
        ApproveAppointment p = (ApproveAppointment) sessionFactory.getCurrentSession().get(ApproveAppointment.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<ApproveAppointment> getList() {
        List<ApproveAppointment> pList = sessionFactory.getCurrentSession().createCriteria(ApproveAppointment.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
    
    //sir
       @Override
    public List<ApproveAppointment> getList(String code) {
          String hql = "from approve_appointment where doctorCode = '"+code+"'";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<ApproveAppointment> pList = sessionFactory.getCurrentSession().createQuery(hql).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
///
    @Override
    public long getCount() {
        String hql = "select count(*) from approveAppointment";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count=(long) q.uniqueResult();
        return count;
    }

}
