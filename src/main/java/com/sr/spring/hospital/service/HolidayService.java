/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;



import com.sr.spring.hospital.dao.impl.IHolidayDaoImpl;
import com.sr.spring.hospital.model.Holiday;
import com.sr.spring.hospital.service.impl.IHolidayServiceImpl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "holidayService")
public class HolidayService implements IHolidayServiceImpl{

    @Autowired
    IHolidayDaoImpl holidayDao;
    @Override
    public Holiday save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Holiday p = new Holiday();
        p.setName(map.get("name")[0]);
        p.setHoliday_date(map.get("holiday_date")[0]);
        return holidayDao.save(p);
    }

    @Override
    public Holiday update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Holiday p = new Holiday();
        p.setId(Integer.parseInt(map.get("id")[0]));
        p.setName(map.get("name")[0]);
        p.setHoliday_date(map.get("holiday_date")[0]);
        return holidayDao.update(p);
    }

    @Override
    public Holiday delete(int id) {
        return holidayDao.delete(id);
    }

    @Override
    public Holiday getById(int id) {
        return holidayDao.getById(id);
    }

    @Override
    public List<Holiday> getList() {
       List<Holiday> pList = holidayDao.getList();
       return pList;
    }
    
}
