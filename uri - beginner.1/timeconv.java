import java.util.Scanner;

public class timeconv {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            int v = input.nextInt(); /* quantidade de segundos */
            int hours, minutes, sec;
        
            hours = v/3600;
            v = v % 3600; /* restante da quantidade de segundos */

            minutes = v/60;
            v = v % 60; /* restante da quantidade de segundos */

            sec = v;


            System.out.println("São " + hours + " hora(s) " + minutes + " minutos e, " + sec + " segundos.");

            input.close();
        }
    }
}


/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato 
horas:minutos:segundos. */
