package UriBeginner1;

import java.util.Scanner;

public class payment { 
     public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type your company number: ");
            int n_func = input.nextInt();
            System.out.print("Type the number of hours that you worked this month: ");
            int wrkd_h = input.nextInt();
            System.out.print("Type much money you receive per hour: ");
            int hour_m = input.nextInt();
            /* payment calculus */
            int payment = (wrkd_h * hour_m);
            System.out.printf("Well number %s your payment is: %d. ", n_func, payment);

        }
    }
}


        /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
        o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o 
        salário do funcionário, com duas casas decimais. */