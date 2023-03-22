package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;

        System.out.print("\nVALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", numbers[i]);
        }
        sc.nextLine();
        System.out.printf("\nSOMA: %.2f%n", sum);
        System.out.printf("MEDIA: %.2f%n", average);
        sc.close();
    }
}
