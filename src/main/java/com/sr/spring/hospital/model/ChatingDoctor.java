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
@Entity(name = "chatingDoctor")
public class ChatingDoctor {
    @Id
    private int id;
    
    private String chating;
    private String chatingTime;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChating() {
        return chating;
    }

    public void setChating(String chating) {
        this.chating = chating;
    }

    public String getChatingTime() {
        return chatingTime;
    }

    public void setChatingTime(String chatingTime) {
        this.chatingTime = chatingTime;
    }

   

    
    
    
    
    
}
