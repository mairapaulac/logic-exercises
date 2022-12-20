import java.util.Scanner;

public class sum {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) { 
            System.out.print("Type a integer number: ");
            int num1 = (int) input.nextInt();
            System.out.print("Type a integer number: ");
            int num2 = (int) input.nextInt();
            int suum = (int) (num1 + num2);
            System.out.printf("The sum value is equal to: %d ", suum);
        }    
    }
}
