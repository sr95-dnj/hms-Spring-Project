/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IApplyDoctorDAOImpl;
import com.sr.spring.hospital.model.ApplyDoctor;
import com.sr.spring.hospital.model.Doctor;
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
@Repository(value = "applydoctor")
@Transactional
public class ApplyDoctorDAO implements IApplyDoctorDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ApplyDoctor save(ApplyDoctor t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ApplyDoctor update(ApplyDoctor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ApplyDoctor delete(int id) {
       ApplyDoctor d = (ApplyDoctor) sessionFactory.getCurrentSession().load(ApplyDoctor.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public ApplyDoctor getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ApplyDoctor> getList() {
        List<ApplyDoctor> doctor = sessionFactory.getCurrentSession().createCriteria(ApplyDoctor.class).list();
        sessionFactory.getCurrentSession().flush();
        return doctor;
    }

    @Override
    public long getCount() {
        String hql = "select count(*) from applyDoctor";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public ApplyDoctor getLogin(String user_name, String password) {
        String hqlQuery = "from doctor where user_name = :user_name and password = :password";
    Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery);
    query.setParameter("user_name", user_name);
    query.setParameter("password", password);
    
  ApplyDoctor d = (ApplyDoctor) query.uniqueResult();
  if(d != null){
      return d;
  }else{
      return null;
  }
    }
    
}
