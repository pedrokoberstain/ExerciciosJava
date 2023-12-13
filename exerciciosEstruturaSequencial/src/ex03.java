// Importa a classe Scanner do pacote java.util, que é usada para a entrada de dados pelo teclado.
import java.util.Scanner;

// Declaração da classe principal chamada "ex03".
public class ex03 {

    // Método principal que é executado quando o programa é iniciado.
    public static void main(String[] args) {
        
        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis inteiras "A", "B", "C", "D" e "dif" (diferença).
        int A, B, C, D, dif;
        
        // Solicita e armazena a entrada do usuário para as variáveis "A", "B", "C" e "D".
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        // Calcula a diferença entre o produto de "A" e "B" e o produto de "C" e "D" e armazena em "dif".
        dif = A * B - C * D;
        
        // Exibe o resultado da diferença na tela.
        System.out.println("DIFERENÇA = " + dif);
        
        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();

    }

}
