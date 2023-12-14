package exerciciosEstruturaRepetitiva.src;

import java.util.Scanner;

public class whileEx02 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Lê os valores de x e y a partir da entrada do usuário
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Loop enquanto ambos x e y são diferentes de zero
        while (x != 0 && y != 0) {

            // Verifica em qual quadrante o ponto (x, y) está localizado
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            } else {
                System.out.println("quarto quadrante ou eixo");
            }

            // Lê os próximos valores de x e y para continuar o loop
            x = sc.nextInt();
            y = sc.nextInt();
        }

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
