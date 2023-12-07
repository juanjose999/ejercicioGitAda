package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = false;
        do {
            System.out.println("elija una opcion: ");
            System.out.println("""
                    1- sumar.
                    2- restar-
                    3- multiplicar.
                    4- mostrar la tabla de un numero.
                    5- salir.    
                    """);
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    Sumar suma = new Sumar();
                    suma.numeros();
                    break;
                case 2:
                    Resta restar = new Resta();
                    restar.numeros();
                    break;
                case 3:
                    Multiplicar multiplicando = new Multiplicar();
                    multiplicando.numeros();
                    break;
                case 4:
                    TablaMultiplicar tabla = new TablaMultiplicar();
                    tabla.numeros();
                    break;
                case 5:
                    System.out.printf("gracias por usar nuestros servicios %nhasta pronto.");
                    bandera = true;
            }
        } while (!bandera);
    }

}