import java.util.Scanner;

public class prodct {
        public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            float num1 = (float) input.nextFloat();
            System.out.print("Type a number: ");
            float num2 = (float) input.nextFloat();
            float product = (float) (num1 * num2); 
            System.out.printf("The product value is equal to: %.2f.", product);


        }
    }
}
