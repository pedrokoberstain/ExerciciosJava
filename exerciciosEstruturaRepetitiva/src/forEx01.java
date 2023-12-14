package exerciciosEstruturaRepetitiva.src;

import java.util.Scanner;

public class forEx01 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Lê o valor de x a partir da entrada do usuário
        int x = sc.nextInt();

        // Loop for para iterar de 1 até x
        for (int i = 1; i <= x; i++) {
            // Verifica se i é ímpar (resto da divisão por 2 é diferente de zero)
            if (i % 2 != 0) {
                // Imprime o valor de i, que é ímpar
                System.out.println(i);
            }
        }

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
