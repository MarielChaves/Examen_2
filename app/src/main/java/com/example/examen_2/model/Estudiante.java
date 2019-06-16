package com.example.examen_2.model;

import java.util.Date;
import java.util.UUID;

public class Estudiante {

    private UUID IdEstudiante;
    private String nombre;
    private String edad;
    private String email;
    private Date mDate;

    public Estudiante() {
        IdEstudiante = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(UUID idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
