package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer01 {

    public static PrintStream screen = System.out ;

    public static Scanner Keyboard = new Scanner(System.in);



    public static void main(String[] args) {
        int numero = 0;
        int resultado = 0;

        screen.println("ingrese un numero");
        numero = Keyboard.nextInt();
        resultado = numero % 2;

        screen.println("el residuo de la division es:"+resultado);

    }
}


