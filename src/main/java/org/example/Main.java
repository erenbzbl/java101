import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo?: ");
        elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo?: ");
        domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo?: ");
        muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo: ");
        patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo * armut) +
                (elmaKilo * elma) +
                (domatesKilo * domates) +
                (muzKilo * muz) +
                (patlicanKilo * patlican);
        
        System.out.println("Toplam: " + toplamTutar + " TL");
    }
}