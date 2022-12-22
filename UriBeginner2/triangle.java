package UriBeginner2;


import java.util.Scanner;

public class triangle {
    public static void main(String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            double a, b, c, per, area;

            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            if (a > Math.abs( b - c ) && a < ( b + c )) {
                per = a + b + c;
                System.out.printf("Perimeter: %.1f", per);
            }
            else if (b > Math.abs( a - c ) && b < ( a + c )) {
                per = a + b + c;
                System.out.printf("Perimeter: %.1f", per);
            }
            else if (c > Math.abs ( a - b ) && c < ( a + b )) {
                per = a + b + c;
                System.out.printf("Perimeter: %.1f", per);
            }
            else {
                area = ((a+b) * c)/2;
                System.out.printf("Area: %.1f", area);
            }
        }
    }
}

/* Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule 
o perímetro do triângulo e apresente a mensagem: Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X */