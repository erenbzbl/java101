package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan girişler alınır
        System.out.print("Mesafeyi (KM) giriniz: ");
        double distance = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:");
        System.out.println("1. Tek Yön");
        System.out.println("2. Gidiş-Dönüş");
        System.out.print("Seçiminizi yapınız (1 veya 2): ");
        int tripType = scanner.nextInt();

        // Kullanıcıdan alınan değerlerin geçerliliğini kontrol et
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return; // Program sonlandırılır
        }

        // Mesafe başına ücret
        double pricePerKm = 0.10;
        double totalPrice = distance * pricePerKm;

        // Yaş indirimi
        double discount = 0;
        if (age < 12) {
            discount = totalPrice * 0.50; // %50 indirim
        } else if (age >= 12 && age <= 24) {
            discount = totalPrice * 0.10; // %10 indirim
        } else if (age > 65) {
            discount = totalPrice * 0.30; // %30 indirim
        }

        // İndirimli fiyatı hesapla
        totalPrice -= discount;

        // Yolculuk tipi indirimi
        if (tripType == 2) { // Gidiş-Dönüş
            totalPrice -= totalPrice * 0.20; // %20 indirim
            totalPrice *= 2; // Gidiş-Dönüş fiyatı
        }

        // Sonuçları ekrana yazdır
        System.out.println("Toplam Bilet Fiyatı: " + totalPrice + " TL");

        scanner.close();
    }
}
