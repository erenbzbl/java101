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
        int n,k;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();
        System.out.print("Üssü alınacak sayıyı çarpan sayıyı giriniz: ");
        k = scanner.nextInt();

        int total =1;
        for (int i = 1; i <= k; i++) {
           total *= n;
        }
        System.out.println(total);
    }
}
