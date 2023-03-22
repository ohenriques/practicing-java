package ex9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        int topAge = 0;
        String topAgePersonName = "";

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            String nameTyped = sc.nextLine();
            name[i] = nameTyped;

            System.out.print("Idade: ");
            int ageTyped = sc.nextInt();
            age[i] = ageTyped;

            if (ageTyped > topAge) {
                topAge = ageTyped;
                topAgePersonName = nameTyped;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + topAgePersonName);


        sc.close();
    }
}
