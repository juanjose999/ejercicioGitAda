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
                    2- restar.
                    3- dividir.
                    4- multiplicar.
                    5- mostrar la tabla de un numero.
                    6- salir.    
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
                    Dividir dividir = new Dividir();
                    dividir.numeros();
                    break;
                case 4:
                    Multiplicar multiplicando = new Multiplicar();
                    multiplicando.numeros();
                    break;
                case 5:
                    TablaMultiplicar tabla = new TablaMultiplicar();
                    tabla.numeros();
                    break;
                case 6:
                    System.out.printf("gracias por usar nuestros servicios %nhasta pronto.");
                    bandera = true;
            }
        } while (!bandera);
    }

}