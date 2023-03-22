package ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int length = sc.nextInt();


        int[] vectorA = new int[length];
        int[] vectorB = new int[length];
        int[] vectorC = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Digite os valores do vetor A: \n");
            vectorA[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.print("Digite os valores do vetor B: \n");
            vectorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }
        sc.close();
    }
}
