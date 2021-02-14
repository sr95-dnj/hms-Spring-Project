/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;

import com.sr.spring.hospital.dao.impl.IDepartmentDAOImpl;
import com.sr.spring.hospital.model.Department;
import com.sr.spring.hospital.service.impl.IDepartmentServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "departmentService")
public class DepartmentService implements IDepartmentServiceImpl{

    @Autowired
    IDepartmentDAOImpl departmentDAO;
    
    @Override
    public Department save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Department d = new Department();
        d.setName(map.get("name")[0]);
        d.setDescription(map.get("description")[0]);
        return departmentDAO.save(d);
    }

    @Override
    public Department update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Department d = new Department();
        d.setId(Integer.parseInt(map.get("id")[0]));
        d.setName(map.get("name")[0]);
        return departmentDAO.update(d);
    
    }

    @Override
    public Department delete(int id) {
        return departmentDAO.delete(id);
    }

    @Override
    public Department getById(int id) {
        return departmentDAO.getById(id);
    }

    @Override
    public List<Department> getList() {
        List<Department> dList = departmentDAO.getList();
        return dList;
    }
    
}
