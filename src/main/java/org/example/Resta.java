package org.example;

import java.util.Scanner;

public class Resta {
    public void numeros() {
        Scanner ingrese = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int numero1 = ingrese.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = ingrese.nextInt();
        multiplicar(numero1, num2);
    }
    public void multiplicar(int numero1, int num2){
        int numeroMultiplicado = numero1 - num2;
        System.out.printf("el resultado de la resta de %d - %d es: %d ", numero1, num2, numeroMultiplicado);
    }
}
