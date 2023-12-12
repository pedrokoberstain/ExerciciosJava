import java.util.Scanner;

public class exFixacao3{

	public static void main(String[] args) {
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner sc = new Scanner(System.in);

		// Declaração de variáveis para armazenar um número inteiro e três strings
		// digitadas pelo usuário
		int x;
		String s1, s2, s3;

		// Leitura de um número inteiro digitado pelo usuário
		x = sc.nextInt();

		// Quando você usa um comando de leitura diferente do nextLine() e
		// dá alguma quebra de linha, essa quebra de linha fica "pendente"
		// na entrada padrão. Se você então fizer um nextLine(), 
		// aquela quebra de linha pendente será absorvida pelo nextLine().
		// Solução:
		// Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.
		
		//adicional
		sc.nextLine();

		// Leitura de três strings digitadas pelo usuário
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		// Imprimindo uma mensagem indicando que os dados digitados serão exibidos
		System.out.println("DADOS DIGITADOS:");

		// Imprimindo o número e as três strings digitadas pelo usuário
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Fechando o Scanner para evitar vazamentos de recursos
		sc.close();
	}
}
