package UriBeginner1;

import java.util.Scanner;

public class dayage {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int x, days, months, years;
            
            x = input.nextInt();

            years = x/365;
            x = x % 365; 

            months = x/30;
            x = x % 30;

            days = x;

            System.out.println("You are " + years + " years(s) " + months + " months and, " + days + " days old.");


        }
    }
}

/* Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.*/