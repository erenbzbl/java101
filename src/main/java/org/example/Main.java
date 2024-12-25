package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int right = 3;
        double balance = 1500;
        boolean loginSuccess = false;

        while (right > 0 && !loginSuccess) {
            System.out.print("Kullanıcı Adını Giriniz: ");
            String username = scanner.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            String password = scanner.nextLine();

            switch (username + ":" + password) {
                case "eren:123":
                    System.out.println("Giriş başarılı! Hoş geldin, " + username + ".");
                    loginSuccess = true;
                    break;
                default:
                    right--;
                    System.out.println("Giriş başarısız! Kalan Hakkın: " + right);
                    break;
            }
        }

        while (loginSuccess) {
            System.out.println("\nMENÜ:");
            System.out.println("1 - Para Yatır");
            System.out.println("2 - Para Çek");
            System.out.println("3 - Bakiye Görüntüle");
            System.out.println("4 - Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                    double deposit = scanner.nextDouble();

                    switch ((deposit > 0) ? "valid" : "invalid") {
                        case "valid":
                            balance += deposit;
                            System.out.println("Başarılı bir şekilde " + deposit + " TL yatırıldı.");
                            break;
                        case "invalid":
                            System.out.println("Geçersiz miktar. Lütfen pozitif bir değer giriniz.");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    double withdrawl  = scanner.nextDouble();

                    switch ((withdrawl < balance) ? "valid" : "invalid") {
                        case "valid":
                            balance -= withdrawl;
                            System.out.println("Başarılı bir şekilde " + withdrawl + " TL çekildi.");
                            break;
                        case "invalid":
                            System.out.println("Geçersiz miktar. Bakiyeniz yeterli değil.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println(balance + " TL");
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor Güle Güle");
                    loginSuccess = false;
                    break;
            }
        }

        switch (right) {
            case 0:
                System.out.println("Giriş hakkınız tükendi! Programdan çıkılıyor...");
                break;
        }

    }

}
