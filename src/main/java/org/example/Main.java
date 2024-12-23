package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz (1-12): ");
        month = scanner.nextInt();

        // Ay kontrolü
        if (month < 1 || month > 12) {
            System.out.println("Geçersiz ay girdiniz! Ay 1 ile 12 arasında olmalıdır.");
        } else {
            System.out.print("Doğum gününüzü giriniz (1-31): ");
            day = scanner.nextInt();

            // Gün kontrolü
            if (day < 1 || day > 31) {
                System.out.println("Geçersiz gün girdiniz! Gün 1 ile 31 arasında olmalıdır.");
            } else {
                // Burç hesaplama
                if (month == 1) {
                    if (day <= 20) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else if (month == 2) {
                    if (day <= 19) {
                        System.out.println("Kova Burcu");
                    } else if (day <= 29) { // Şubat için özel gün kontrolü
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Şubat ayı en fazla 29 gün olabilir!");
                    }
                } else if (month == 3) {
                    if (day <= 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                } else if (month == 4) {
                    if (day <= 20) {
                        System.out.println("Koç Burcu");
                    } else if (day <= 30) { // Nisan için gün kontrolü
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("Nisan ayı en fazla 30 gün olabilir!");
                    }
                } else if (month == 5) {
                    if (day <= 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                } else if (month == 6) {
                    if (day <= 22) {
                        System.out.println("İkizler Burcu");
                    } else if (day <= 30) { // Haziran için gün kontrolü
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Haziran ayı en fazla 30 gün olabilir!");
                    }
                } else if (month == 7) {
                    if (day <= 22) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                } else if (month == 8) {
                    if (day <= 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                } else if (month == 9) {
                    if (day <= 22) {
                        System.out.println("Başak Burcu");
                    } else if (day <= 30) { // Eylül için gün kontrolü
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Eylül ayı en fazla 30 gün olabilir!");
                    }
                } else if (month == 10) {
                    if (day <= 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                } else if (month == 11) {
                    if (day <= 21) {
                        System.out.println("Akrep Burcu");
                    } else if (day <= 30) { // Kasım için gün kontrolü
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Kasım ayı en fazla 30 gün olabilir!");
                    }
                } else if (month == 12) {
                    if (day <= 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                }
            }
        }

        scanner.close();
    }
}
