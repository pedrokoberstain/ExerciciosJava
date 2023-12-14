package exerciciosEstruturaRepetitiva.src;

import java.util.Scanner;

public class forEx02 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Lê o valor de n a partir da entrada do usuário
        int n = sc.nextInt();

        // Inicializa contadores para os números dentro e fora do intervalo [10, 20]
        int in = 0;
        int out = 0;

        // Loop for para iterar n vezes
        for (int i = 0; i < n; i++) {
            // Lê o próximo valor x a partir da entrada do usuário
            int x = sc.nextInt();

            // Verifica se x está dentro do intervalo [10, 20]
            if (x >= 10 && x <= 20) {
                // Incrementa o contador para números dentro do intervalo
                in = in + 1;
            } else {
                // Incrementa o contador para números fora do intervalo
                out = out + 1;
            }
        }

        // Exibe o número de valores dentro e fora do intervalo
        System.out.println(in + " in");
        System.out.println(out + " out");

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
