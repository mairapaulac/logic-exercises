package UriBeginner2;

import java.util.Scanner;

public class coordinates {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
        
            float x, y;
            x = input.nextFloat();
            y = input.nextFloat();
        
            if (x > 0 && y > 0) {

                System.out.print("Q1");
            }
            else if (x < 0 && y > 0) {

                System.out.print("Q2");
            }
            else if (x < 0 && y < 0) {

                System.out.print("Q3");   
            }
            else if (x > 0 && y < 0) {

                System.out.print("Q4");
            }
            else if (x == 0 && y == 0) {

                System.out.print("Origem");
            }
            else if (y == 0) {

                System.out.print("Eixo X");
            }
            else if (x == 0) {

                System.out.print("Eixo Y");
            }
        }
    }       
}


/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o 
quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/