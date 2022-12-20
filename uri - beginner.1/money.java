import java.util.Scanner;

public class money {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            /* Cédulas*/

           double value;
           int value2 = 0;

           value = input.nextDouble();

            value2 = (int) value / 100;
            System.out.printf("%d nota(s) de R$100,00 \n", value2);
            value = value % 100;

            value2 = (int) value / 50;
            System.out.printf("%d nota(s) de R$50,00 \n", value2); 
            value = value % 50;

            value2 = (int) value / 20;
            System.out.printf("%d nota(s) de R$20,00 \n", value2);
            value = value % 20;

            value2 = (int) value / 10;
            System.out.printf("%d nota(s) de R$10,00 \n", value2);
            value = value % 10;

            value2 = (int) value / 5;
            System.out.printf("%d nota(s) de R$5,00 \n", value2);
            value = value % 5;

            value2 = (int) value / 2;
            System.out.printf("%d nota(s) de R$2,00 \n", value2);
            value = value % 2;


            /* MOEDAS */

            System.out.println("MOEDAS:");

            value = value * 100;

            value2 = (int) value / 100;
            System.out.printf("%d moeda(s) de R$1,00 \n", value2);
            value = value % 100;

            value2 = (int) value / 50;
            System.out.printf("%d moeda(s) de R$0.50 \n", value2);
            value = value % 50;

            value2 = (int) value / 25;
            System.out.printf("%d moeda(s) de R$0,25 \n", value2);
            value = value % 25;

            value2 = (int) value / 10;
            System.out.printf("%d moeda(s) de R$0,10 \n", value2);
            value = value % 10;

            value2 = (int) value / 5;
            System.out.printf("%d moeda(s) de R$,05 \n", value2);
            value = value % 5;

            value2 = (int) value / 1;
            System.out.printf("%d moeda(s) de R$0,01 \n", value2);
            value = value % 1;






 

        }
    }
}


/* Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 
0.01. A seguir mostre a relação de notas necessárias. */