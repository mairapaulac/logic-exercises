import java.util.Scanner;

public class ponderada_2 {

    public static void main(String[] args) throws Exception {
        /* wheigths established from the exercise */
            int x = 2;
            int y = 3;
            int z = 5;

        /* User inputs and formula especification */
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            float n1 = input.nextFloat();
            System.out.print("Type a number: ");
            float n2 = input.nextFloat();
            System.out.print("Type a number: ");
            float n3 = input.nextFloat();
            float pond = (n1*x + n2*y + n3*z)/(x+y+z);
            System.out.printf("The result is %.2f", pond);

        }
        
    }
}