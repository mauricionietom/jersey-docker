/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo.dao;

import com.dekses.jersey.docker.demo.model.Patient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DaoPatient {
    
    private static final Map<String, Patient> patMap = new HashMap<String, Patient>();
    
static {
    
    initPAtients();
    
}

    private static void initPAtients() {
        
        Patient pat1 = new Patient ("Juan","Calle",222,"publico");
        
        patMap.put(pat1.getNombre(), pat1);        
    }
    
    public static Patient getPatient(String patNo){
        
        return patMap.get(patNo);
    }
     
 
 
}
