import java.util.Scanner;

public class selection {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {

            int a, b, c, d;

            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();

            if (b > c && d > a && (c+d) > (a+b) && a % 2 == 0 && c > 0 && d > 0) {
                System.out.print("Valores aceitos");
            }    
            else {
                System.out.print("Valores não aceitos");
            }
        }        
    }
}


/* Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma 
de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever 
"Valores nao aceitos". */