package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i*=4) {
            System.out.println("4'ün katları " + i);
        } for (int i = 1; i <= n; i*=5) {
            System.out.println("5'in katları" + i);
        }
    }
}