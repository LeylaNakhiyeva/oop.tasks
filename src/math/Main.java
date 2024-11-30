package math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Verilmiş əməliyyatlardan birini seçin: ");
            System.out.println("1. Toplama - '+' \n" +
                    "2. Çıxma - '-' \n" +
                    "3. Vurma - '*' \n" +
                    "4. Bölmə - '/' \n" +
                    "5. Faktorial - '!' \n" +
                    "6. Sonlandır!");
            System.out.println();
            System.out.println("Seçilmiş əməliyyat: ");
            int number = sc.nextInt();
            switch (number) {
                case 1: case 2: case 3: case 4: System.out.println("ədədləri daxil edin ");break;
                case 5: System.out.println("ədədi daxil edin: ");break;
            }
            switch (number) {
                case 1 -> {
                   double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println(a + " + " + b + " = " + MathUtils.addition(a, b));
                }
                case 2 -> {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println(a + " - " + b + " = " + MathUtils.subtraction(a, b));
                }
                case 3 -> {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println(a + " * " + b + " = " + MathUtils.multiplication(a, b));
                }
                case 4 -> {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println(a + " / " + b + " = " + MathUtils.division(a, b));
                }
                case 5 -> {
                    int a = sc.nextInt();
                    System.out.println(a + "!= " + MathUtils.factorial(a));
                }
                case 6 -> System.exit(0);
            }
            System.out.println();

        }
    }
}