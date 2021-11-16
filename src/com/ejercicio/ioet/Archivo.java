package com.ejercicio.ioet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Archivo {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    // leer archivo .txt
    void readFile(String path) {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                Empleado empleado = new Empleado();
                int index = 0;
                for (String filter : line.split("[=,]")) {
                    if (filter.length() > 0) {
                        if (index > 0) {
                            empleado.setJornada(filter.trim()); // ingresar jornada de empleado
                        } else {
                            empleado.setNombre(filter.trim()); // ingresar nombre de empleado
                        }
                        index++;
                    }
                }
                this.empleados.add(empleado);
            }
        } catch (Exception e) {
            System.err.println("Error, no se encontró el archivo");
            System.err.println(e.getMessage());
        }
    }
}