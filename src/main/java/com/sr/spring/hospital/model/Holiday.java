/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Siddiquer Rahman
 */
@Entity(name = "holiday")
public class Holiday {
    @Id
    private int id;
    
    private String name;
    private String holiday_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoliday_date() {
        return holiday_date;
    }

    public void setHoliday_date(String holiday_date) {
        this.holiday_date = holiday_date;
    }

    
    
    
    
}
