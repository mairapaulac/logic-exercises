package UriBeginner1;

import java.util.Scanner;

public class ponderada {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            /* Pesos da media */
            int x = (int) 3;
            int y = (int) 6;

            /*Pedindo inputs para poder multiplicar com os pesos e logo após declarando a fórmula
             * da média ponderada.
             */
            System.out.print("Type a number: ");
            float n1 = input.nextFloat();
            System.out.print("Type another number: ");
            float n2 = input.nextFloat();
            float pond = (n1*x + n2*y)/(x+y);
            System.out.printf("The weighted arithmetic mean of these numbers is: %.2f", pond); 

        }
    }
    
}
