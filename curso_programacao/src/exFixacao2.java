import java.util.Scanner;

public class exFixacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);
		
		//System.out.println("Voce digitou: " + x);
		//System.out.println("Voce digitou o inteiro: " + y);
		//System.out.printf("Voce digitou o double: %.2f%n", z);
		//System.out.printf("Voce digitou o caractere: " + a);
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
