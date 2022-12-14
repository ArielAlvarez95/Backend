package com.portfolioap.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreD;
    private String descripcionD;
    private String imagenD;

    public Educacion() {
    }

    public Educacion(String nombreD, String descripcionD, String imagenD) {
        this.nombreD = nombreD;
        this.descripcionD = descripcionD;
        this.imagenD = imagenD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getDescripcionD() {
        return descripcionD;
    }

    public void setDescripcionD(String descripcionD) {
        this.descripcionD = descripcionD;
    }

    public String getImagenD() {
        return imagenD;
    }

    public void setImagenD(String imagenD) {
        this.imagenD = imagenD;
    }
    
    
    
}
