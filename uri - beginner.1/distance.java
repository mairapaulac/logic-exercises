import java.util.Scanner;

public class distance {
    public static void main (String [] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            float x1, x2, y1, y2;
            double distance;

            x1 = input.nextFloat();  
            x2 = input.nextFloat();
            y1 = input.nextFloat();
            y2 = input.nextFloat();

            distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            System.out.printf("The distance between these two poins is: %.4f", distance);
        }
    }
}


/* Aparently i need a double type to use math.sqrt method */