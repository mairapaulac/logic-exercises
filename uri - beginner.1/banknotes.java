import java.util.Scanner;

public class banknotes {
    public static void main (String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int value;

            value = input.nextInt();
            System.out.println(value);

            System.out.println(value/100 + " nota(s) de R$100,00");
            value = value % 100;
            System.out.println(value/50 + " nota(s) de R$50,00");
            value = value % 50;
            System.out.println(value/20 + " nota(s) de R$20,00");
            value = value % 20;
            System.out.println(value/10 + " nota(s) de R$10,00");
            value = value % 10;
            System.out.println(value/5 + " nota(s) de R$5,00");
            value = value % 5;
            System.out.println(value/2 + " nota(s) de R$2,00");
            value = value % 2;
            System.out.println(value/1 + " nota(s) de R$1,00");
           
        }
    }
}


/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas 
consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */