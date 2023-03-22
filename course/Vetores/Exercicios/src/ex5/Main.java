package ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double topNumber = 0.0;
        int position = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbersArray = new double[n];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            numbersArray[i] = number;
            if (topNumber < number) {
                topNumber = number;
                position = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f", topNumber);
        System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", position);

        sc.close();
    }
}
