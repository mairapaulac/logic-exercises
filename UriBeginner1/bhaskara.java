package UriBeginner1;

import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            
            double a, b, c, delta, x1, x2;

            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            delta = Math.pow(b,2)-(4 * a * c);

            if (delta >= 0) {

                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);

                System.out.printf("r1: %.5f \n", x1);
                System.out.printf("r2: %.5f", x2);
            }
            else {

                System.out.print("Impossível calcular");
            }
        }
    }
}


/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, 
mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo. */