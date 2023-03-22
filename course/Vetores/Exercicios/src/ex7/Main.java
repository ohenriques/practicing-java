package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sumValues = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();

            System.out.print("Digite um numero: ");
            double v = sc.nextDouble();

            vector[i] = v;
            sumValues += v;
        }

        double averageValues = sumValues / vector.length;
        System.out.printf("\nMEDIA DO VETOR = %.3f", averageValues);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");

        for (double v : vector) {
            if (v < averageValues) System.out.println(v);
        }

        sc.close();
    }
}
