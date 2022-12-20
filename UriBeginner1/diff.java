package UriBeginner1;

import java.util.Scanner;

public class diff {
    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            int n1 = input.nextInt();
            System.out.print("Type a number: ");
            int A = input.nextInt();
            System.out.print("Type a number: ");
            int n3 = input.nextInt();
            System.out.print("Type a number: ");
            int D = input.nextInt();
            int diff = (n1*A - n3*D);
            System.out.printf("The result is: %d", diff);
            
        }
        
    }
}

/*
 * %d é para números declarados como inteiros se encaixarem no printf
 */