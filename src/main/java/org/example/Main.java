package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        double sayi = scanner.nextInt();
        double toplam = 0;

        for (double i = 1; i <= sayi; i++) {
            toplam += 1.0 / i;
            System.out.println(toplam);
        }

        System.out.println("Harmonik Toplam: " + toplam); // Sonucu yazdır
    }
}
