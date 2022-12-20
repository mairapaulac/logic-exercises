import java.util.Scanner;

public class calculus {
    public static void main(String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            
            int cod1, qtd1;
            int cod2, qtd2;
            float value1, value2, t_value; 


            cod1 = input.nextInt();
            cod2 = input.nextInt();
            qtd1 = input.nextInt();
            qtd2 = input.nextInt();
            value1 = input.nextFloat();
            value2 = input.nextFloat();
            t_value = value1 * qtd1 + value2 * qtd2; 
        
            System.out.printf("The tools code are: %d and %d and the amount to pay is: R$%.2f \n", cod1, cod2, t_value); 
        }
    }
}

/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor 
a ser pago. */