package UriBeginner1;

import java.util.Scanner;

public class arimean {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            float n1 = input.nextFloat();
            System.out.print("Type another number: ");
            float n2 = input.nextFloat();
            float a_mean = (float) ((n1 + n2)/2);
            System.out.printf("The arithmetic mean of these numbers are %.2f", a_mean);

        }
    }
}
