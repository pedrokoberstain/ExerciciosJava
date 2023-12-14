package exerciciosEstruturaRepetitiva.src;

import java.util.Locale;
import java.util.Scanner;

public class forEx03 {

    public static void main(String[] args) {

        // Define a configuração regional para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Lê o valor de n a partir da entrada do usuário
        int n = sc.nextInt();

        // Loop for para iterar n vezes
        for (int i = 0; i < n; i++) {

            // Lê os valores de a, b e c a partir da entrada do usuário
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            // Calcula a média ponderada conforme a fórmula dada
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            // Exibe a média formatada com uma casa decimal
            System.out.printf("%.1f%n", media);
        }

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
