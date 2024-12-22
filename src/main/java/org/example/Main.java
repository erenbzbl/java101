package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, tarih, muzik, turkce, kimya, fizik;
        double toplam = 0;
        int dersSayisi = 0; // Bu değişken ders sayısını tutacak
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            toplam += tarih;
            dersSayisi++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }


        if (dersSayisi > 0) {
            toplam = toplam / dersSayisi;
            System.out.println("Not ortalaması: " + toplam);
            if (toplam >= 60) {
                System.out.println("Geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }
        } else {
            System.out.println("Geçerli not girilmedi.");
        }
    }
}
