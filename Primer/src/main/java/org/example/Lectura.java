package org.example;

import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
                int numero;
                double real;
        System.out.println("Introdueix un numero enter i un numero real:");
        numero = ent. nextInt();
                real = ent. nextDouble();
        System.out.println("La variable val " +numero);
        System.out.println("La suma dels valors es " + (numero+real));

    }

}
