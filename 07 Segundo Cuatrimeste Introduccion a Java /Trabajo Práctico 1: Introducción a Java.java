/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.introduccion.a.java;

/**
 *
 * @author adriel
 */

import java.util.Scanner;

public class TrabajoPrácticoIntroduccionAJava {

    public static void main(String[] args) {
        //2.​ Escribir y ejecutar un programa básico en Java.
        System.out.println("¡Hola, Java!");
        
        //3.​ Crea un programa que declare las siguientes variables con valores asignados:
        
        String nombre = "Adriel";
        int edad = 22;
        double altura = 1.70;
        boolean estudiante = true;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println(nombre + " ¿Es estudiante?: " + estudiante);
        
        //4.​ Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
        //los muestre en pantalla. Usa Scanner para capturar los datos.
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad2 = scanner.nextInt();

        System.out.println("Tu nombre es " + nombre2 + " y tienes " + edad2 + " años.");
        
        //5.Escribe un programa que solicite dos números enteros y realice las siguientes
        //operaciones:
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        
        
        int suma = 15 + 10 ;
        int resta = 50 - 45 ;
        int multi = 5 * 5 ;
        int div_resta = 12 % 3;
        int div = 20 / 2;
        float divi_float = 13f / 2f;
        //System.out.println(suma);
        //System.out.println(resta);
        //System.out.println(multi);        
        //System.out.println(div);
        //System.out.println(div_resta);
        //System.out.println(divi_float);
        
        //6.Escribe un programa que muestre el siguiente mensaje en consola:
        String nombre3 = "Juan Perez";
        String edad3 = "30 años";
        String direc = "'Calle Falsa 123'";
        
        System.out.println("Nombre:" + nombre3 + "\n" + "Edad:" + edad3 + "\n"
        + "Direccion: " + direc);
        
        //7.Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son
        //instrucciones? Explica la diferencia en un breve párrafo.
        
        int x = 10; // Línea 1
        x = x + 5; // Línea 2
        System.out.println(x); // Línea 3
        
        //La expresión devuelve un valor.
        //La instrucción indica al programa que haga algo como 
        //declarar, asignar, imprimir.
        
        
        //8.Manejar conversiones de tipo y división en Java.
        //int:
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Resultado división: " + (a / b));
        
        //double:
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double c = sc2.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double d = sc2.nextDouble();
        System.out.println("Resultado división: " + (c / d));
        
        //Con int se descarta los decimales, con double conserva la parte decimal.
        
        
        //9.Corrige el siguiente código para que funcione correctamente. Explica qué error
        //tenía y cómo lo solucionaste.
        
        //el erro esta en que el metodo nextInt devuelve un numero entero y se le esta 
        // un string, para corregirlo cambiamos el metodo a nextLine
        
        Scanner correct = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre4 = correct.nextLine();  // CORREGIDO
        System.out.println("Hola, " + nombre4);
        
        //10.Completa la tabla de prueba de escritorio para el siguiente código. ¿Cuál es el
        //valor de resultado y por qué?
        
        
        int valor1 = 5;
        int valor2 = 2;
        int resultado = valor1 / valor2;
        System.out.println("Resultado: " + resultado);
        //El valor final de resultado es 2,porque la división 5 / 2 se hace con 
        //enteros (int) y descarta los decimales

        
        
        
    }
    
}
