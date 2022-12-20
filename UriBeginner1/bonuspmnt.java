package UriBeginner1;

import java.util.Scanner;

public class bonuspmnt {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Type your name: ");
            String name = input.nextLine();
            System.out.print("How much do you receive for month? ");
            double payment = input.nextDouble();
            System.out.print("How much did you sell this month? ");
            double amount_s = input.nextDouble();
            double bonus_p = (payment + (amount_s*15)/100);
            System.out.printf("%s, your payment at the end of this month will be: %.2f", name, bonus_p);

        }
    }
}



/* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o 
total a receber no final do mês, com duas casas decimais */
