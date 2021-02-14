/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IEmployeeControllerImpl;
import com.sr.spring.hospital.controller.impl.IHolidayControllerImpl;
import com.sr.spring.hospital.model.Holiday;
import com.sr.spring.hospital.service.impl.IHolidayServiceImpl;
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
@RequestMapping("holiday")
public class HolidayController implements IHolidayControllerImpl {

    @Autowired
    IHolidayServiceImpl holidayService;

    @RequestMapping(value = "/add")
    @Override
    public ModelAndView home() {
        return new ModelAndView("admin_dashbord/add-holiday");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
        holidayService.save(request);
        return new ModelAndView("redirect:/holiday/list");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public ModelAndView update(HttpServletRequest request) {
        holidayService.update(request);
        return new ModelAndView("redirect:/holiday/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @Override
    public ModelAndView delete(@PathVariable("id") int id) {
        holidayService.delete(id);
        return new ModelAndView("redirect:/holiday/list");
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Holiday> holidayList = holidayService.getList();
        map.put("holidayList", holidayList);
        return new ModelAndView("admin_dashbord/holidays", "map", map);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editHoliday(ModelMap map, @PathVariable("id") int id) {
        Holiday holiday = holidayService.getById(id);
        map.addAttribute("holiday", holiday);
        return new ModelAndView("/admin_dashbord/edit-holiday");
    }

}
