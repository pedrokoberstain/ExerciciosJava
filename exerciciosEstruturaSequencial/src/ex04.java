// Importa as classes Locale e Scanner do pacote java.util.
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe principal chamada "ex04".
public class ex04 {

    // Método principal que é executado quando o programa é iniciado.
    public static void main(String[] args) {
        
        // Configura o Locale para utilizar o padrão americano (ponto como separador decimal).
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis inteiras "numero" e "horas", e das variáveis do tipo double "valorHora" e "calc".
        int numero, horas;
        double valorHora, calc;
        
        // Solicita e armazena a entrada do usuário para as variáveis "numero", "horas" e "valorHora".
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        
        // Calcula o salário multiplicando o valor da hora pelo número de horas trabalhadas e armazena em "calc".
        calc = valorHora * horas;
        
        // Exibe o número do funcionário e o salário formatado na tela.
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", calc);
        
        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();

    }

}
