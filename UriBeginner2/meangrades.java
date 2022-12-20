package UriBeginner2;

import java.util.Scanner;

public class meangrades {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            float n1, n2, n3, n4, m, n_ex, m_f;

            /* grades */

            n1 = input.nextFloat();
            n2 = input.nextFloat();
            n3 = input.nextFloat();
            n4 = input.nextFloat();

            /* mean formula */
            m = (n1*2 + n2*3 + n3*4 + n4*1) / 10;

            System.out.printf("Result: %.1f. \n", m);

            if (m >= 7.0) {

                System.out.println("Student status: passed");
            }
            else if (m < 5.0) {

                System.out.println("Student status: failed");
            }
            else if (5.0 <= m && m <= 6.9) {
                 
                System.out.println("Student status: ongoing examination \n");
                n_ex = input.nextFloat();
                System.out.printf("Exam grade: %.1f. \n", n_ex);
                m_f = (m + n_ex) / 2;

                if (m_f >= 5.0) {

                    System.out.printf("Final result: %.1f. \n", m_f);
                    System.out.print("Student status: passed.");
                }
                else {

                    System.out.printf("Final result: %.1f. \n", m_f);
                    System.out.print("Student status: failed");
                }
            }   
        }
    }
}


/* Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 
Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". 
Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem 
"Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: 
" acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima 
a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média 
final para esse aluno. */
