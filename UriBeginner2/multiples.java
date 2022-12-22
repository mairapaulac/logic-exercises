package UriBeginner2;

import java.util.Scanner;

public class multiples {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int a, b;

            a = input.nextInt();
            b = input.nextInt();

            if ( a % b == 0 || b % a == 0) {

                System.out.print("São múltiplos");
            }
            else {
                
                System.out.print("Não são múltiplos");
            }
        }
    }
}

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. */