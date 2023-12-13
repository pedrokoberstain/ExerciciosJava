// Importa as classes Locale e Scanner do pacote java.util.
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe principal chamada "ex05".
public class ex05 {

    // Método principal que é executado quando o programa é iniciado.
    public static void main(String[] args) {
        
        // Configura o Locale para utilizar o padrão americano (ponto como separador decimal).
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis inteiras "cod1", "cod2", "numPeca1", "numPeca2" e das variáveis do tipo double "valorUni1", "valorUni2" e "total".
        int cod1, cod2, numPeca1, numPeca2;
        double valorUni1, valorUni2, total;
        
        // Solicita e armazena a entrada do usuário para as informações da primeira peça.
        cod1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorUni1 = sc.nextDouble();
        
        // Solicita e armazena a entrada do usuário para as informações da segunda peça.
        cod2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUni2 = sc.nextDouble();
        
        // Calcula o total a ser pago multiplicando a quantidade de cada peça pelo seu valor unitário e somando os resultados.
        total = valorUni1 * numPeca1 + valorUni2 * numPeca2;
        
        // Exibe o valor total a ser pago formatado na tela.
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        
        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();
        
    }

}
