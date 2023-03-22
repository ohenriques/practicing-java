package ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alunos serao digitados? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < names.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno:\n", i + 1);

            names[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < names.length; i++) {
            if ((nota1[i] + nota2[i]) / 2 >= 6) System.out.println(names[i]);
        }
    }
}
