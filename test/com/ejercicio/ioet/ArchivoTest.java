package com.ejercicio.ioet;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArchivoTest {

    @Test
    public void readFile() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\maike\\Documents\\test.txt"));
            assertTrue((line = bufferedReader.readLine()) != null);
            while ((line = bufferedReader.readLine()) != null) {
                Empleado empleado = new Empleado();
                int index = 0;
                for (String filter : line.split("[=,]")) {
                    assertTrue(filter.length() > 0);
                    if (filter.length() > 0) {
                        if (index > 0) {
                            empleado.setJornada(filter.trim()); // ingresar jornada de empleado
                        } else {
                            empleado.setNombre(filter.trim()); // ingresar nombre de empleado
                        }
                        index++;
                    }
                }
                empleados.add(empleado);
            }
            assertTrue(empleados.size() > 0);
        } catch (Exception e) {
            System.err.println("Error, no se encontró el archivo");
            System.err.println(e.getMessage());
        }
    }
}