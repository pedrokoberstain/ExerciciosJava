import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.234523;
		String nome = "Maria";
		int idade = 24;
		double renda = 10000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	
		
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS" );
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		
		
	}

}