package exerciciosEstruturaCondicional.src;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis A e B que armazenarão os números fornecidos pelo usuário
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Operador lógico "OU" (OR). A condição dentro do if será verdadeira
        // Se pelo menos uma das duas condições (A é múltiplo de B ou B é múltiplo de A) for verdadeira.
        if (A % B == 0 || B % A == 0) {
            // Se são múltiplos, imprime "Sao Multiplos" no console
            System.out.println("Sao Multiplos");
        }
        else {
            // Se não são múltiplos, imprime "Nao sao Multiplos" no console
            System.out.println("Nao sao Multiplos");
        }

        // Fecha o objeto Scanner para liberar os recursos associados à leitura de entrada do usuário
        sc.close();

    }
}
