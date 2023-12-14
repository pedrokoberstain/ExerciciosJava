package exerciciosEstruturaCondicional.src;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        number = sc.nextInt();

        if ( number > 0){
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
