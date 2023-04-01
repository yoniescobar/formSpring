package com.colegiox.colegio;

import java.sql.Date;

public class Estudiante {
    private String nombre;
    private String correo;
    private Date fechaNacimiento;

    private boolean genero;

    private String carrera;

    private String observaciones;

    // Constructor
    public Estudiante() {
    }

    // Constructor
    public Estudiante(String nombre, String correo, Date fechaNacimiento, boolean genero, String carrera, String observaciones) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.carrera = carrera;
        this.observaciones = observaciones;
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // override toString
@Override
public String toString() {
    return "Estudiante{" + "nombre=" + nombre + ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", carrera=" + carrera + ", observaciones=" + observaciones + '}';

}

    }
