/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;


import com.sr.spring.hospital.dao.impl.IPathologyDAOImpl;
import com.sr.spring.hospital.model.Pathology;
import com.sr.spring.hospital.service.impl.IPathologyServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "pathologyService")
public class PathologyService implements IPathologyServiceImpl{

    @Autowired
    IPathologyDAOImpl pathologyDAO;
    @Override
    public Pathology save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Pathology p = new Pathology();
        p.setName(map.get("name")[0]);
        p.setDescription(map.get("description")[0]);
        return pathologyDAO.save(p);
    }

    @Override
    public Pathology update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Pathology p = new Pathology();
        p.setId(Integer.parseInt(map.get("id")[0]));
        p.setName(map.get("name")[0]);
        p.setDescription(map.get("description")[0]);
        return pathologyDAO.update(p);
    }

    @Override
    public Pathology delete(int id) {
        return pathologyDAO.delete(id);
    }

    @Override
    public Pathology getById(int id) {
        return pathologyDAO.getById(id);
    }

    @Override
    public List<Pathology> getList() {
       List<Pathology> pList = pathologyDAO.getList();
       return pList;
    }
    
}
