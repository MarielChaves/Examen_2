package com.example.examen_2.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EstudianteLab {

    private static EstudianteLab EstLab;
    private List<Estudiante> LEstudiante;

    public static EstudianteLab get(Context context) {
        if (EstLab == null) {
            EstLab = new EstudianteLab(context);
        }
        return EstLab;
    }
    private EstudianteLab(Context context) {
        LEstudiante = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Estudiante EstLab = new Estudiante();
            EstLab.setNombre("Estudiante #" + i);
            EstLab.setEdad("Estudiante #" + i); // Every other one
            EstLab.setEmail("Estudiante #" + i);
            LEstudiante.add(EstLab);
        }

    }
    public List<Estudiante> getCrimes() {
        return LEstudiante;
    }
    public Estudiante getCrime(UUID IdEstudiante) {
        for (Estudiante estudiante : LEstudiante) {
            if (estudiante.getIdEstudiante().equals(IdEstudiante)) {
                return estudiante;
            }
        }
        return null;
    }
}
