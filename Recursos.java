/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursos;

/**
 *
 * @author gerar
 */
public class Recursos {
    
    // Primer metodo: Retorna un mensaje
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos";
    }
    
    // Segundo metodo: Verifica si la edad es mayor o menor de 21
    public String verificarEdad(int edad) {
        return (edad >= 21) ? "Mayor de edad" : "Menor de edad";
    }
    
    // Tercer metodo: Multiplica dos numeros enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    // Cuarto metodo: Retorna una lista de numeros del 1 al X
    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }

    public static void main(String[] args) {
        Recursos recurso = new Recursos();
        
        // Probando los metodos
        System.out.println(recurso.obtenerMensaje());
        System.out.println(recurso.verificarEdad(18));
        System.out.println("Multiplicacion: " + recurso.multiplicar(5, 4));
        
        int[] lista = recurso.generarLista(10);
        System.out.print("Lista generada: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
