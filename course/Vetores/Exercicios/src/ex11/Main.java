package ex11;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double maxHeight = 0.0;
        double minHeight = 0.0;
        double sumFemHeight = 0.0;
        int qntFem = 0;
        int qntMasc = 0;
        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            if (altura[i] > maxHeight) maxHeight = altura[i];
            if (minHeight == 0) minHeight = maxHeight;
            if (altura[i] < minHeight) minHeight = altura[i];

            System.out.printf("Genero da %da pessoa: ", i + 1);
            char gender = sc.next().charAt(0);
            genero[i] = Character.toUpperCase(gender);
            if (Character.toUpperCase(gender) == 'M') {
                sumFemHeight += altura[i];
                qntFem++;
            } else {
                qntMasc++;
            }
        }
        double heightFem = sumFemHeight / qntFem;

        System.out.println("Menor altura = " + minHeight);
        System.out.println("Maior altura = " + maxHeight);
        System.out.printf("Media das alturas das mulheres = %.2f", heightFem);
        System.out.println("Numero de homens: " + qntMasc);

        sc.close();
    }
}
