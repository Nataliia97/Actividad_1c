package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer03 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        int horas = 0;
        float costoxhora = 0;
        int retefuente = 0;
        float salariobruto = 0;
        float salarioneto = 0;
        float retefuente2 = 0;

        screen.println("ingrese la cantidad de horas trabajadas");
        horas = keyboard.nextInt();

        screen.println("ingrese el costo por hora trabajada");
        costoxhora = keyboard.nextFloat();

        screen.println("ingrese el porcentaje de retencion de la fuente");
        retefuente = keyboard.nextInt();

        salariobruto = horas * costoxhora;

        retefuente2 = salariobruto * retefuente/100;

        salarioneto = salariobruto - retefuente2;

        screen.println("el salario bruto es:"+salariobruto);
        screen.println("la retencion de la fuente es:"+ retefuente2);
        screen.println("el salario neto es:"+ salarioneto);










    }
}
