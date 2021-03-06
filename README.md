# Proyecto Ejercicio en Java para IOET
## Comenzando 馃殌
_Proyecto desarrollado para resolver el problema planteado sobre la empresa ACME para saber qu茅 empleados han estado en la oficina dentro del mismo per铆odo de tiempo._

### Construido con 馃洜

* [JAVA 8](https://docs.oracle.com/javase/8/docs/api/) - El lenguaje de programaci贸n usado
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - El IDE usado


### Soluci贸n General
- Cargar un archivo .txt con los conjuntos de datos de las jornadas de cada uno de los empleados, estos datos contienen el nombre del Empleado, el tiempo en dia, meses, a帽os y horas, en el siguiente formato (nombre = fecha horaInicio-fecha horaFin).
```
RENE = 2021/11/01 10:00-2021/11/01 12:00, 2021/11/02 10:00-2021/11/02 12:00, 2021/11/04 13:00-2021/11/04 15:00, 2021/11/06 14:00-2021/11/06 18:00, 2021/11/07 20:00-2021/11/07 21:00
ASTRID = 2021/11/01 10:00-2021/11/01 12:00, 2021/11/04 12:00-2021/11/04 14:00, 2021/11/07 20:00-2021/11/07 21:00
```
- Desarrollar clases y m茅todos que separen las jornadas de cada empleado, y recorrer cada una de estas con ciclos for.

### Pre-requisitos 馃搵
1. IDE que soporte proyectos en JAVA (Netbeans, Eclipse, IntelliJ)

### Instalaci贸n
1. Abrir el Proyecto Java
2. Ejecutar la clase principal `Ejercicio.class` del proyecto con el archivo "ejemplo1.txt.

![ejecucion-proyecto.png](resources/ejecucion-proyecto.png 'Ejecuci贸n del Proyecto con el archivo "ejemplo1.txt"')

Los archivos .txt estan el la carpeta `/resources` del proyecto, existen el archivo `/ejemplo1.txt` y `/ejemplo2.txt`. 
- Para cambiar el archivo que se utiliza en el proyecto, colocar `"resources\\ejemplo1.txt"` 贸 `"resources\\ejemplo2.txt"` en el archivo `Ejercicio.class`.

### Arquitectura
- La arquitectura aplicada fue Cliente-Servidor, espec铆ficamente la capa de **Cliente**, en la cual se aplico la l贸gica para resolver el problema planteado m谩s no para comunicarse con el servidor. El proyecto se dividi贸 en dos grupos:
  1. El principal es el Empleado en el cual se encuentran su nombre y jornadas. 
  2. El segundo grupo es el Archivo el cual se encarga de subir el .txt donde se encuentran los datos de cada uno de los empleados.

### Paradigma o enfoque
- El enfoque utilizado fue el orientado a objetos en el cual se analiz贸 el requerimiento o problema y se lo dividi贸 en dos clases (Empleados y Archivos), donde cada uno de ellos tienen sus atributos y funciones para poder estructurar los datos de los Empleados y separar las coincidencias de jornadas.
```
Ejemplo de estructura del dato Empleado
{
    nombre: "RENE",
    jornada: [
        "2021/11/01 10:00-2021/11/01 12:00",
        "2021/11/02 10:00-2021/11/02 12:00", 
        "2021/11/04 13:00-2021/11/04 15:00",
        "2021/11/06 14:00-2021/11/06 18:00",
        "2021/11/07 20:00-2021/11/07 21:00"
    ]
}
```

### Metodolog铆a
- Debido al tama帽o del proyecto se decidi贸 aplicar la metodolog铆a tradicional en cascada, ya que es la mejor para poder desarrollar este tipo de sistemas. En esta metodolog铆a se aplicaron los siguientes procedimientos:
  1. An谩lisis
  2. Dise帽o
  3. Programaci贸n
  4. Pruebas




