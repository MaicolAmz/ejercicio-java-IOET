package com.ejercicio.ioet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Empleado {
    private String nombre;
    private final ArrayList<String> jornada = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada.add(jornada);
    }

    //contar frecuencia con la que han coincididen los empleados en la oficina
    public void frecuenciaHorasEmpleados(ArrayList<Empleado> empleados) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        ArrayList<String> combinationsEmploys = new ArrayList<>(); // Pares de Empleados combinados
        ArrayList<String> frequencyEmploys = new ArrayList<>(); // Pares de Empleados que Coincidieron

        for (int index = 0; index < empleados.size(); index++) {
            int finalIndex = index;
            empleados.get(index).getJornada().forEach(hora -> {
                for (int indice = 0; indice < empleados.size(); indice++) {
                    if ((finalIndex != indice) && !combinationsEmploys.contains(indice + "-" + finalIndex)) {
                        int finalIndice = indice;
                        empleados.get(indice).getJornada().forEach(horaComparator -> {
                            try {
                                if (this.horaCoincidencia(
                                        format.parse(hora.split("[-]")[0]), // Tiempo Inicial del Empleado 1
                                        format.parse(hora.split("[-]")[1]), // Tiempo Final del Empleado 1
                                        format.parse(horaComparator.split("[-]")[0].trim()), // Tiempo Inicial del Empleado 2
                                        format.parse(horaComparator.split("[-]")[1].trim()) // Tiempo Final del Empleado 2
                                )) {
                                    frequencyEmploys.add(empleados.get(finalIndex).getNombre() +
                                            "-" + empleados.get(finalIndice).getNombre());
                                }
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        });
                        if (!combinationsEmploys.contains(finalIndex + "-" + indice)) {
                            combinationsEmploys.add(finalIndex + "-" + indice);
                        }
                    }
                }
            });
        }
        this.contarFrecuenciaHoras(frequencyEmploys);
    }

    // Contar frecuencia de Empleados que coincidieron
    public void contarFrecuenciaHoras(ArrayList<String> frecuenciaHoraEmpleado) {
        ArrayList<String> frecuencia = new ArrayList<>();
        int contador = 0;
        for (String combinar : frecuenciaHoraEmpleado) {
            for (String aCombinar : frecuenciaHoraEmpleado) {
                if (combinar.equals(aCombinar)) {
                    contador += 1;
                }
            }
            if (!frecuencia.contains(combinar + ":" + contador)) { // Filtrar combinaciones de empleados
                frecuencia.add(combinar + ":" + contador);
                System.out.println(combinar + ":" + contador);
            }
            contador = 0;        }
    }

    // validar coincidencias en las jornadas de trabajo
    public boolean horaCoincidencia(Date inicio, Date fin, Date inicioQuestion, Date finQuestion) {
        return (inicio.before(finQuestion) && fin.after(inicioQuestion)) ||
                (inicioQuestion.after(fin) && finQuestion.before(inicio));
    }
}
