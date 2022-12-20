package UriBeginner2;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            
            int a, b, c;
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if (a > b && a > c) {
                System.out.println(a);
                if (b > c) {
                    System.out.println(b); 
                    System.out.println(c);               
                }
                else {
                    System.out.println(c);
                    System.out.println(b); 
                }
            }    
            else if (b > a && b > c) {
                System.out.println(b);
                if (a > c) {
                    System.out.println(a);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(a);
                }
            }  
            else if (c > a && c > b) {
                System.out.println(c);
                if (a > b) { 
                    System.out.println(a);
                    System.out.println(b);
                }
                else {
                    System.out.println(b);
                    System.out.println(a);
                }
            }
            
           System.out.println(a);
           System.out.println(b);
           System.out.println(c); 
            
        }
    }
}

/* Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, 
os valores na sequência como foram lidos. */
