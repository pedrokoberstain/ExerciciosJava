package exerciciosEstruturaRepetitiva.src;

import java.util.Scanner;

public class whileEx03 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Inicializa contadores para os tipos de combustível
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        // Lê o tipo de combustível inicial
        int tipo = sc.nextInt();

        // Loop enquanto o tipo de combustível não for 4
        while (tipo != 4) {
            // Atualiza os contadores com base no tipo de combustível
            if (tipo == 1) {
                alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else if (tipo == 3) {
                diesel = diesel + 1;
            }

            // Lê o próximo tipo de combustível para continuar o loop
            tipo = sc.nextInt();
        }

        // Exibe a mensagem de agradecimento e os totais de cada combustível
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}