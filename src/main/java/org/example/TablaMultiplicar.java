package org.example;

import java.util.Scanner;

public class TablaMultiplicar {
    public void numeros() {
        Scanner ingrese = new Scanner(System.in);
        System.out.println("ingrese la tabla que quiere ver: ");
        int numeroTabla = ingrese.nextInt();
        System.out.printf("la tabla de numero %d es: /n",numeroTabla);
        tabla(numeroTabla);
    }
    public void tabla(int numeroTabla){
        for (int i = 0; i <= 10; i++) {System.out.printf("%d * %d = %d%n", numeroTabla , i, (numeroTabla * i));
        }
    }
}
