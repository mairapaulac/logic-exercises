import java.util.Scanner;

public class area {
    public static void main (String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

           double a, b, c, a_tri, a_circ, a_trap, a_square, a_ret;

            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            a_tri = (a * c)/2;
            a_circ = Math.pow(c, 2) * 3.14159;
            a_trap = ((2*b) * c)/2;
            a_square = Math.pow(b, 2);
            a_ret = (a * b)/2;

            System.out.printf("The triangle area is %.3f. \n" + "The circle area is: %.3f. \n" + "The trapezium area is: %.3f. \n"+
            "The square area is: %.3f. \n" + "The retangle area is: %.3f.", a_tri, a_circ, a_trap, a_square, a_ret);
        }
    }
}


/* Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, 
calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */