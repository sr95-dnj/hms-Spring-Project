/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IDepartmentDAOImpl;
import com.sr.spring.hospital.model.Department;
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
@Repository(value = "department")
@Transactional
public class DepartmentDAO implements IDepartmentDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Department save(Department t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Department update(Department t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Department delete(int id) {
        Department d = (Department) sessionFactory.getCurrentSession().load(Department.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Department getById(int id) {
        Department d = (Department) sessionFactory.getCurrentSession().get(Department.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    
    }

    @Override
    public List<Department> getList() {
        List<Department> departments = sessionFactory.getCurrentSession().createCriteria(Department.class).list();
        sessionFactory.getCurrentSession().flush();
        return departments;
    }
    
    @Override
    public long getCount() {
        String hql = "select count(*) from doctor";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count=(long) q.uniqueResult();
        return count;
    }
    
}
