// Importa as classes Locale e Scanner do pacote java.util.
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe principal chamada "ex06".
public class ex06 {

    // Método principal que é executado quando o programa é iniciado.
    public static void main(String[] args) {
        
        // Configura o Locale para utilizar o padrão americano (ponto como separador decimal).
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis do tipo double "A", "B", "C" e das variáveis para as áreas de diferentes formas geométricas.
        double A, B, C, areaTriRet, areaCirc, areaTrap, areaQuad, areaRet;
        double pi = 3.14159;
        
        // Solicita e armazena a entrada do usuário para as variáveis "A", "B" e "C".
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        // Calcula as áreas das diferentes formas geométricas com base nos valores fornecidos.
        areaTriRet = A * C / 2;
        areaCirc = C * C * pi;
        areaTrap = (A + B) / 2 * C;
        areaQuad = B * B;
        areaRet = A * B;
        
        // Exibe as áreas calculadas formatadas na tela.
        System.out.printf("TRIANGULO: %.3f%n", areaTriRet);
        System.out.printf("CIRCULO: %.3f%n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETANGULO: %.3f%n", areaRet);
        
        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();
    }

}
