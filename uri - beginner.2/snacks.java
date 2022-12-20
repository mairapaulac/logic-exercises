import java.util.Scanner;

public class snacks {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int cod, qtd;
            float total;

            cod = input.nextInt();
            qtd = input.nextInt();

            if (cod == 1) {
                
                total = (float) (qtd*4.0);   
                System.out.printf ("Total price: R$ %.2f", total);             
            }
            else if (cod == 2) {

                total = (float) (qtd * 4.50);
                System.out.printf ("Total price: R$ %.2f", total);
            }
            else if (cod == 3) {

                total = (float) (qtd*5.0);
                System.out.printf ("Total price: R$ %.2f", total);
            }
            else if (cod == 4) {

                total = (float) (qtd*2.0);
                System.out.printf ("Total price: R$ %.2f", total);
            }
            else if (cod == 5) {

                total = (float) (qtd*1.50);
                System.out.printf ("Total price: R$ %.2f", total);
            }
        }
    }
}


/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar. */ 