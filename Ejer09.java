package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer09 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

   long time = 0;
   long distance = 0;
   long speed = 0;

   screen.println("Ingrese la distancia en kilometros. ");
   distance = keyboard.nextLong();
   screen.println("Ingrse un tiempo de recorrido: ");
   time = keyboard.nextLong();
   speed = distance/time;
   screen.println("velocidad necesaria para recorrer la distancia en ese tiempo es de " + speed + " km/h");


    }
    }