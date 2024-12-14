package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int = mat, tarih, muzik, turkce, kimya, fizik;
        double toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Matematik notunuzu giriniz: ");
        fizik = input.nextInt();

        toplam = mat + tarih + muzik + turkce + kimya + fizik;
        toplam = toplam / 6;

        if (toplam > 60) {
            System.out.println("Geçtiniz");
        }
        else if (toplam < 60) {
            System.out.println("Kaldınız");
        }
    }
}