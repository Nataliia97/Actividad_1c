package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer08 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        int broad = 0;
        int height = 0;
        double inches = 0;
        int pot = 2;

        screen.println(("vamos a calcular las pulgaddas de un tv, por favor ingrese el ancho en CM: "));
        broad = keyboard.nextInt();
        screen.println(( " ingrese el alto en CM: " ));
        height = keyboard.nextInt();
        inches = (Math.sqrt((Math.pow(broad, pot))+(Math.pow(height, pot))))/2.54;

        screen.println("las pulgadas del tv son: "+ inches);


    }
    }