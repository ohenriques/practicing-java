package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double averageHeight = 0.0;
        double sumHeight = 0.0;
        int countMenor16 = 0;


        Person[] arrayPerson = new Person[n];

        for (int i = 0; i < arrayPerson.length; i++) {

            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();
            if (age < 16) {
                countMenor16++;
            }

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            arrayPerson[i] = new Person(name, age, height);
        }

        for (Person person : arrayPerson) {
            sumHeight += person.getHeight();
        }
        averageHeight = sumHeight / arrayPerson.length;

        System.out.printf("\nAltura média:  %.2f", averageHeight);

        double porcentagemMenor16 = (double) countMenor16 / arrayPerson.length * 100;
        System.out.printf("\nPessoas com menos de 16 anos: %.2f %", porcentagemMenor16);

        for (Person person : arrayPerson) {
            if (person.getAge() < 16) System.out.println("\n" + person.getName());
        }

    }
}
