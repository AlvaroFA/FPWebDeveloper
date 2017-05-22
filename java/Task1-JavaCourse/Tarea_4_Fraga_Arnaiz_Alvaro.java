/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Autor: Alvaro Fraga Arnaiz 
 * Tarea obligatoria DAW primer semestre
 */
package tarea_4_fraga_arnaiz_alvaro;

import java.util.Scanner;

public class Tarea_4_Fraga_Arnaiz_Alvaro {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public Tarea_4_Fraga_Arnaiz_Alvaro() {
    }

    public static void mostrarMenu() {
        System.out.println("Pulse un numero para ejecutar la tarea designada");
        System.out.println("1-Pintar escalera ascedente");
        System.out.println("2- pintar escalera descendente");
        System.out.println("3- pintar escalera numerica");
        System.out.println("4- Sumar multiplo de 5");
        System.out.println("5- Volver");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                pintarEscaleraAscendente();
                break;
            case 2:
                pintarEscaleraDescendiente();
                break;
            case 3:
                pintarEscaleraNumerica();
                break;
            case 4:
                sumarMultiplos();
                break;
            case 5:
                mostrarMenu();
                break;
            default:
                System.out.println("El valor introducido es incorrecto");
                break;
        }
    }

    // pinta una escalera ascendente  con base dada por consola
    public static void pintarEscaleraAscendente() {
        int base = pedirNumero();
        int contador = 0;
        while (base > contador) {
            String resultado = pintarCaracter(contador);
            System.out.println(resultado);
            contador++;
        }
    }

    // pinta una escalera descendiente con base dada por consola
    public static void pintarEscaleraDescendiente() {
        int base = pedirNumero();
        int contador = 0;
        while (base > contador) {
            String resultado = pintarCaracter(base - contador);
            System.out.println(resultado);
            contador++;
        }
    }

    public static String pintarCaracter(int numeroVeces) {
        String linea = "";
        int contador = 0;
        while (numeroVeces > contador) {
            linea += "*";
            contador++;
        }
        return linea;
    }

    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println("elnumero es negativo");
        }
        return numero;
    }

    public static void pintarEscaleraNumerica() {
        int base = pedirNumero();
        String resultado = "";
        for (int i = 1; i <= base; i++) {
            resultado += i + ""; //hace un toString implicito, porque es un objeto, y el método de concatenación necesita String
            System.out.println(resultado);
        }
    }

    public static void sumarMultiplos() {
        System.out.println("Suma muñtiplos");
        // Declaracion y asignacion 
        int rngMin;
        int rngMax;
        int resultado = 0;
        System.out.println("introduce el primer numero");
        int a = pedirNumero();
        System.out.println("introduce el segundo numero");
        int b = pedirNumero();
        // Validador numerico. a es menor que b
        if (a < b) {
            rngMin = a;
            rngMax = b;
        } else {
            System.out.println("el segundo valor es menor que el segundo. reorganizando");
            rngMax = a;
            rngMin = b;
        }
        // Calcula los multiplo de 5 ente dos valores
        for (int i = rngMin; i <= rngMax; i++) {
            if (i % 5 == 0) {
                resultado += i;
            }
        }
        System.out.println(resultado);
    }
}
