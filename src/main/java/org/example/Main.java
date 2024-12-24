package org.example;

import java.util.Scanner;

public class Main {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen n değerini giriniz: ");
        int n = scanner.nextInt();
        System.out.print("Lütfen r değerini giriniz: ");
        int r = scanner.nextInt();

        if (r > n) {
            System.out.println("Hatalı giriş! r değeri n'den büyük olamaz.");
        } else {
            int combination = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("C(" + n + "," + r + ") = " + combination);
        }

        scanner.close();
    }
}
