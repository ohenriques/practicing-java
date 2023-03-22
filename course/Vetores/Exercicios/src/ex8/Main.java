package ex8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sumValues = 0.0;
        double averageValue = 0.0;
        int count = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numbersArray = new int[n];

        for (int i = 0; i < numbersArray.length; i++) {
            sc.nextLine();

            System.out.print("Digite um numero: ");
            int n1 = sc.nextInt();
            numbersArray[i] = n1;
            if (n1 % 2 == 0) {
                sumValues += n1;
                count += 1;
            }
        }

        if (sumValues != 0.0) {
            averageValue = sumValues / count;
            System.out.printf("MEDIA DOS PARES = %.1f", averageValue);
        } else System.out.println("NENHUM NUMERO PAR");


        sc.close();
    }
}
