import java.util.Locale;

public class exFixacao1 {

    public static void main(String[] args) {
        // Declaração e inicialização de variáveis representando produtos
        String product1 = "Computer";
        String product2 = "Office desk";

        // Declaração e inicialização de variáveis representando idade, código e gênero
        int age = 30;
        int code = 5290;
        char gender = 'F';

        // Declaração e inicialização de variáveis representando preços e medidas
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        
        System.out.println("");
        
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);  
        
        System.out.println("");
        
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);       
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);        
        Locale.setDefault(Locale.US);     
        System.out.printf("US decimal point: %.3f%n ", measure);
    }
}
