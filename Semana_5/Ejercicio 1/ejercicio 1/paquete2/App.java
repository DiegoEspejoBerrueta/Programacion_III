package paquete2;

import paquete1.Clase1;
// import paquete1.Clase2; // ERROR DE COMPILACIÓN

public class App {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();

        System.out.println(obj1.atributoPublic);    // Funciona correctamente
        // System.out.println(obj1.atributoDefault);   // ERROR DE COMPILACIÓN
        // System.out.println(obj1.atributoProtected); // ERROR DE COMPILACIÓN
        // System.out.println(obj1.atributoPrivate);   // ERROR DE COMPILACIÓN

        obj1.metodoPublic();    // Funciona correctamente
        // obj1.metodoDefault();   // ERROR DE COMPILACIÓN
        // obj1.metodoProtected(); // ERROR DE COMPILACIÓN
        // obj1.metodoPrivate();   // ERROR DE COMPILACIÓN
    }
}

// El propósito principal de los modificadores de visibilidad es implementar el principio de encapsulamiento 
// de la Programación Orientada a Objetos. Permiten proteger el estado interno de los objetos, ocultar detalles 
// de implementación que no deben ser manipulados externamente y controlar estrictamente cómo interactúan entre sí 
// los componentes de una aplicación.

// El modificador public da acceso total, 
// protected permite el acceso a miembros de la clase dentro del mismo entorno,
// sin modificador restringe la visibilidad al paquete donde se declara,
// y private ofrece el nivel máximo de encapsulamiento y protección.