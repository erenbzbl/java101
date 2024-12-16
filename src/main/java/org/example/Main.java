import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double  boy;
        double  kilo;
        double  sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        boy = scanner.nextDouble();

        sonuc = kilo / (boy * boy);

        if (sonuc <= 18.5){
            System.out.println("Zayıf: " + sonuc);
        }
        else if (sonuc >= 18.5 && sonuc <= 24.9){
            System.out.println("Normal Kilolu " + sonuc);
        }
        else if (sonuc >= 24.9 && sonuc <= 29.9){
            System.out.println("Fazla Kilolu " + sonuc);
        }
        else if (sonuc >= 29.9 && sonuc <= 34.9){
            System.out.println("Obez " + sonuc);
        }
        else if (sonuc >= 34.9 && sonuc <= 39.9){
            System.out.println("Aşırı Obez " + sonuc);
        }
        else if (sonuc >= 39.9 && sonuc >= 40.0){
            System.out.println("Morbid Obez " + sonuc);
        }
    }
}