package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int countNumerosPares = 0;
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            sc.nextLine();

            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            numbers[i] = numero;
            if (numero % 2 == 0) countNumerosPares++;
        }

        System.out.print("NUMEROS PARES: \n");
        for (int numero : numbers) {
            if (numero % 2 == 0) System.out.print(numero + " ");
        }

        System.out.println("\nQUANTIDADE DE NUMEROS PARES: " + countNumerosPares);
        sc.close();
    }

}
