import java.util.Scanner;

public class sphere {
    public static void main (String [] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Type the radius value: ");
            double radius = input.nextDouble();
            double pi = 3.14159;
            double sphere = (4.0/3) * pi * Math.pow(radius,3);

            System.out.printf ("Sphere volume is: %.4f", sphere);

        }
    }
}
    


/* Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: 
(4/3) * pi * R^3. Considere (atribua) para pi o valor 3.14159. Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas 
linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro */