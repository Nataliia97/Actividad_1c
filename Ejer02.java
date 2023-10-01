package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

  public class Ejer02 {
      public static PrintStream screen = System.out ;

      public static Scanner Keyboard = new Scanner(System.in);

      public static void main(String[] args) {

          long  celular = 0;
          long respuesta = 0;

          screen.println("introdusca el nuemero de celular");

          celular = Keyboard.nextLong();
          respuesta = celular / 10000000;

                  screen.println(" el prefijo es :"+ respuesta);



      }




}
