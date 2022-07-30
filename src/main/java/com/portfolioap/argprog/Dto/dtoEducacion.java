package com.portfolioap.argprog.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreD;
    @NotBlank
    private String descripcionD;
    @NotBlank
    private String imagenD;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreD, String descripcionD, String imagenD) {
        this.nombreD = nombreD;
        this.descripcionD = descripcionD;
        this.imagenD = imagenD;
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
