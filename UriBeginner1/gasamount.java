package UriBeginner1;

import java.util.Scanner;

public class gasamount {
    public static void main (String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int time, speed;

            System.out.print("Type how much time did you spend: ");
            time = input.nextInt();
            System.out.print("Type your average speed while traveling: ");
            speed = input.nextInt();

            int dist = time * speed;
            float liters = (float) dist/12;
            
            System.out.printf("You'll need %.3f liters.", liters);


        }
    }
}



/* Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. 
Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem
(em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros 
seriam necessários. Mostre o valor com 3 casas decimais após o ponto. */