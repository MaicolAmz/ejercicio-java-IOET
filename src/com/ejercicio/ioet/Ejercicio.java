package com.ejercicio.ioet;

public class Ejercicio {
    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        archivo.readFile("resources\\ejemplo1.txt");

        Empleado empleado = new Empleado();
        empleado.frecuenciaHorasEmpleados(archivo.getEmpleados());
    }
}
