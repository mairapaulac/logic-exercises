package UriBeginner1;

import java.util.Scanner;

public class biggest {
    public static void main (String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            
            int a, b, c;
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            int maiorAB = (a+b+Math.abs(a-b))/2;
            int maiorAC = (maiorAB+c+Math.abs(maiorAB-c))/2;
            System.out.println(maiorAC + " is the biggest number. ");

        }
    }
}
