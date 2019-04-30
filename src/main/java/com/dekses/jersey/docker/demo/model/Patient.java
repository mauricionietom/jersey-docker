/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "paciente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Patient {
    
    private String Nombre;
    private String Direccion;
      private int telefono;
    private String  publico;
    
    
    public Patient() {
    }

    public Patient(String juan, String calle, int i) {
       
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

   

    public int getTelefono() {
        return telefono;
    }

    public String getPublico() {
        return publico;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }


    public Patient(String Nombre, String Direccion, int telefono, String publico) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
       
        this.telefono = telefono;
        this.publico = publico;
    }
   
    
    
}
