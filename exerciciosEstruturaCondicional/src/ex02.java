package exerciciosEstruturaCondicional.src;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declaração da variável que irá armazenar o número fornecido pelo usuário
        int number;

        // Lê um número inteiro fornecido pelo usuário e armazena na variável 'number'
        number = sc.nextInt();

        // Verifica se o número é par usando o operador de módulo (%) resto da divisão, se a divisao por 2 for 0 entao
        if (number % 2 == 0) {
            // Se o número é par, imprime "PAR" no console
            System.out.println("PAR");
        }
        else {
            // Se o número não é par, imprime "IMPAR" no console
            System.out.println("IMPAR");
        }

        // Fecha o objeto Scanner para liberar os recursos associados à leitura de entrada do usuário
        sc.close();

    }
}
