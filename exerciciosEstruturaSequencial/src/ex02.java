// Importa as classes Locale e Scanner do pacote java.util.
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe principal chamada "ex02".
public class ex02 {

    // Método principal que é executado quando o programa é iniciado.
    public static void main(String[] args) {
        
        // Configura o Locale para utilizar o padrão americano (ponto como separador decimal).
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis do tipo double "R" (raio), "A" (área) e "pi" (constante pi).
        double R, A, pi = 3.14159;
        
        // Solicita e armazena a entrada do usuário para a variável "R" (raio).
        R = sc.nextDouble();
        
        // Calcula a área do círculo usando a fórmula A = pi * R^2 e armazena o resultado em "A".
        A = pi * R * R;
        
        // Exibe o resultado da área formatado com quatro casas decimais.
        System.out.printf("A = %.4f%n", A);
        
        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();

    }

}
