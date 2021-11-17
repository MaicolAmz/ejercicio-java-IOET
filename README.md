# Proyecto Ejercicio en Java para IOET
## Comenzando 🚀
_Proyecto desarrollado para resolver el problema planteado sobre la empresa ACME para saber qué empleados han estado en la oficina dentro del mismo período de tiempo._

### Construido con 🛠

* [JAVA 8](https://docs.oracle.com/javase/8/docs/api/) - El lenguaje de programación usado
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - El IDE usado


### Solución General
- Cargar un archivo .txt con los conjuntos de datos de las jornadas de cada uno de los empleados, estos datos contienen el nombre del Empleado, el tiempo en dia, meses, años y horas, en el siguiente formato (nombre = fecha horaInicio-fecha horaFin).
```
RENE = 2021/11/01 10:00-2021/11/01 12:00, 2021/11/02 10:00-2021/11/02 12:00, 2021/11/04 13:00-2021/11/04 15:00, 2021/11/06 14:00-2021/11/06 18:00, 2021/11/07 20:00-2021/11/07 21:00
ASTRID = 2021/11/01 10:00-2021/11/01 12:00, 2021/11/04 12:00-2021/11/04 14:00, 2021/11/07 20:00-2021/11/07 21:00
```
- Desarrollar clases y métodos que separen las jornadas de cada empleado, y recorrer cada una de estas con ciclos for.

### Pre-requisitos 📋
1. IDE que soporte proyectos en JAVA (Netbeans, Eclipse, IntelliJ)

### Instalación
1. Abrir el Proyecto Java
2. Ejecutar la clase principal `Ejercicio.class` del proyecto con el archivo "ejemplo1.txt.

![ejecucion-proyecto.png](resources/ejecucion-proyecto.png 'Ejecución del Proyecto con el archivo "ejemplo1.txt"')

Los archivos .txt estan el la carpeta `/resources` del proyecto, existen el archivo `/ejemplo1.txt` y `/ejemplo2.txt`. 
- Para cambiar el archivo que se utiliza en el proyecto, colocar `"resources\\ejemplo1.txt"` ó `"resources\\ejemplo2.txt"` en el archivo `Ejercicio.class`.

### Arquitectura
- La arquitectura aplicada fue Cliente-Servidor, específicamente la capa de **Cliente**, en la cual se aplico la lógica para resolver el problema planteado más no para comunicarse con el servidor. El proyecto se dividió en dos grupos:
  1. El principal es el Empleado en el cual se encuentran su nombre y jornadas. 
  2. El segundo grupo es el Archivo el cual se encarga de subir el .txt donde se encuentran los datos de cada uno de los empleados.

### Paradigma o enfoque
- El enfoque utilizado fue el orientado a objetos en el cual se analizó el requerimiento o problema y se lo dividió en dos clases (Empleados y Archivos), donde cada uno de ellos tienen sus atributos y funciones para poder estructurar los datos de los Empleados y separar las coincidencias de jornadas.
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

### Metodología
- Debido al tamaño del proyecto se decidió aplicar la metodología tradicional en cascada, ya que es la mejor para poder desarrollar este tipo de sistemas. En esta metodología se aplicaron los siguientes procedimientos:
  1. Análisis
  2. Diseño
  3. Programación
  4. Pruebas




