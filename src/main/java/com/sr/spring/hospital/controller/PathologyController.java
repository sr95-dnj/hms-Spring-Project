/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IPathologyController;
import com.sr.spring.hospital.dao.impl.IPathologyDAOImpl;
import com.sr.spring.hospital.model.Pathology;
import com.sr.spring.hospital.service.impl.IPathologyServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@RestController
@RequestMapping(value = "pathology")
public class PathologyController implements IPathologyController{

    @Autowired
    IPathologyServiceImpl pathologyService;
    
    @Autowired
    IPathologyDAOImpl pathologyDAO;
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
    return new ModelAndView("/admin_dashbord/add-pathology");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
         pathologyService.save(request);
        return new ModelAndView("redirect:/pathology/list");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        pathologyService.update(request);
        return new ModelAndView("redirect:/pathology/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        pathologyService.delete(id);
        return new ModelAndView("redirect:/pathology/list");
    }

    
    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Pathology> pathologyList = pathologyService.getList();
        map.put("pathologyList", pathologyList);
        return new ModelAndView("/admin_dashbord/pathologys", "map", map);
    
    }
   
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPatient(ModelMap map, @PathVariable("id") int id){
        Pathology pathology = pathologyService.getById(id);
        map.addAttribute("pathology", pathology);
        return new ModelAndView("/admin_dashbord/edit-pathology");
    }
    
}
