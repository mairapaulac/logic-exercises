import java.util.Scanner;

public class gasoline {
    public static void main (String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int km = input.nextInt();
            float l = input.nextFloat();
            float t_km = km/l;

            System.out.printf("The amount of km per liter is: %.3f km/l", t_km);
        

        }
    }
}

/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de 
combustível gasto (em litros). */