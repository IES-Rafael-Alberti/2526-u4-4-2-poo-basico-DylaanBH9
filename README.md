[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c. svg)](https://classroom.github.com/a/rI46BDue)
# Práctica 4.1: Programación orientada a objetos

Apóyate en los siguientes recursos para realizar la práctica:

[U4: 1. POO](./EjerciciosSencillosPOO.md)

---

# Ejercicios de Introducción a POO

## Identificación de la Actividad

- **ID de la Actividad:** 2526-u4-4-2-poo-basico-DylaanBH9
- **Módulo:** PROG
- **Unidad de Trabajo:** UD 4 - Programación orientada a objetos
- **Fecha de Creación:** 15/01/26
- **Fecha de Entrega:** 16/01/26
- **Alumno(s):**
    - **Nombre y Apellidos:** Dylan Bauti Huelva
    - **Correo electrónico:** dbauhue1708@g.educaand.es
    - **Iniciales del Alumno/Grupo:** DBH

## Descripción de la Actividad

Esta práctica consiste en realizar 5 ejercicios de programación orientada a objetos en Kotlin. En cada ejercicio hay que crear una clase con sus propiedades y métodos, aplicando conceptos como encapsulamiento, validación de datos y manejo de excepciones.

Las clases a implementar son:
1. **CuentaBancaria** - Gestión de ingresos y retiros
2. **Vehiculo** - Registro de viajes y kilometraje
3. **Libro** - Control de lectura con validaciones
4. **Estudiante** - Gestión de notas con rango válido
5. **Producto** - Control de stock y ventas

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**

    - Kotlin 1.9.x
    - JDK 21 o superior
    - IntelliJ IDEA (recomendado)

2. **Pasos para Compilar el Código:**

   ```bash
   ./gradlew build
   ```

3. **Pasos para Ejecutar el Código:**

   Ejecutar directamente desde IntelliJ IDEA haciendo clic derecho sobre el archivo `Main.kt` y seleccionando "Run 'MainKt'".

## Desarrollo de la Actividad

### Descripción del Desarrollo

He creado cada clase siguiendo los diagramas UML proporcionados en el enunciado. Para cada una he tenido en cuenta:

- Hacer privadas las propiedades que no deben modificarse directamente desde fuera
- Usar el bloque `init` o setters personalizados para validar los datos
- Lanzar excepciones cuando los datos no son válidos
- Sobrescribir el método `toString()` cuando se pide

### Código Fuente

#### Ejercicio 1: CuentaBancaria
Clase que simula una cuenta bancaria donde puedes ingresar y retirar dinero. El saldo solo se puede modificar con los métodos y no permite retirar más de lo que hay ni ingresar cantidades negativas.

- Clase: [`src/main/kotlin/ejercicio1/CuentaBancaria. kt`](src/main/kotlin/ejercicio1/CuentaBancaria.kt)
- Main: [`src/main/kotlin/ejercicio1/main.kt`](src/main/kotlin/ejercicio1/main.kt)

#### Ejercicio 2: Vehiculo
Clase que representa un vehículo con marca, modelo y kilometraje. Permite registrar viajes que van sumando kilómetros.

- Clase: [`src/main/kotlin/ejercicio2/Vehiculo. kt`](src/main/kotlin/ejercicio2/Vehiculo.kt)
- Main: [`src/main/kotlin/ejercicio2/main.kt`](src/main/kotlin/ejercicio2/main.kt)

#### Ejercicio 3: Libro
Clase que representa un libro con título, autor, páginas y estado de lectura. Valida que el título y autor no estén vacíos y que las páginas estén entre 1 y 5000.

- Clase: [`src/main/kotlin/ejercicio3/Libro.kt`](src/main/kotlin/ejercicio3/Libro.kt)
- Main: [`src/main/kotlin/ejercicio3/main.kt`](src/main/kotlin/ejercicio3/main.kt)

#### Ejercicio 4: Estudiante
Clase que guarda el nombre y nota de un estudiante. El nombre es privado e inmutable, y la nota solo acepta valores entre 0 y 10.

- Clase: [`src/main/kotlin/ejercicio4/Estudiante.kt`](src/main/kotlin/ejercicio4/Estudiante.kt)
- Main: [`src/main/kotlin/ejercicio4/main.kt`](src/main/kotlin/ejercicio4/main.kt)

#### Ejercicio 5: Producto
Clase para gestionar productos con nombre, precio y stock. Permite vender y reabastecer, validando que siempre haya stock suficiente.

- Clase: [`src/main/kotlin/ejercicio5/Producto.kt`](src/main/kotlin/ejercicio5/Producto.kt)
- Main: [`src/main/kotlin/ejercicio5/main.kt`](src/main/kotlin/ejercicio5/main.kt)

### Ejemplos de Ejecución

- **Entrada 1:** Crear cuenta bancaria, ingresar 100€ y retirar 50€
- **Salida Esperada 1:** Saldo final de 50€

- **Entrada 2:** Intentar retirar 200€ de una cuenta con 50€
- **Salida Esperada 2:** Excepción indicando que no hay saldo suficiente

- **Entrada 3:** Crear vehículo y registrar viaje de 100 km
- **Salida Esperada 3:** Kilometraje actualizado a 100 km

- **Entrada 4:** Crear libro con título vacío
- **Salida Esperada 4:** Excepción indicando que el título no puede estar vacío

- **Entrada 5:** Asignar nota 15 a un estudiante
- **Salida Esperada 5:** Excepción indicando que la nota debe estar entre 0 y 10

### Resultados de Pruebas

He probado cada clase manualmente desde el main verificando:
- Que las operaciones válidas funcionan correctamente
- Que las operaciones inválidas lanzan las excepciones esperadas
- Que el `toString()` muestra la información en el formato correcto

## Conclusiones

Con esta práctica he aprendido a:
- Crear clases en Kotlin con propiedades y métodos
- Proteger los datos usando encapsulamiento (propiedades privadas)
- Validar datos con el bloque `init` y setters personalizados
- Manejar errores con excepciones
- Personalizar el `toString()` para mostrar información de los objetos

## Referencias y Fuentes

- [Documentación oficial de Kotlin](https://kotlinlang.org/docs/home. html)
- Apuntes de clase - UD 4: Programación orientada a objetos
- Enunciado de la práctica: [EjerciciosSencillosPOO.md](./EjerciciosSencillosPOO.md)