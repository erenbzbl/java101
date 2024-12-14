import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdv = 0.18;
        double kdvFiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar : ");
        tutar = input.nextDouble();

        if (tutar >= 1000) {
            kdv = tutar * 0.08;
            kdvFiyat = tutar + kdv;
            System.out.println("KDV : " + kdv + " TL");
            System.out.println("Toplam Tutar : " + kdvFiyat + " TL");
        }
        else {
            kdv = tutar * kdv;
            kdvFiyat = tutar + kdv;
            System.out.println("KDV : " + kdv + " TL");
            System.out.println("Toplam Tutar : " + kdvFiyat + " TL");
        }


    }
}