import java.util.Scanner;
public class taksiMetre {
    public static void main(String[] args) {
        int km;
        double taksimetre = 2.20;
        double hesap;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen Kilometre: ");
        km = scanner.nextInt();

        hesap = km * taksimetre + 10;

        hesap = (hesap < 20 ) ? 20 : hesap;
        System.out.println("Ödenecek Hesap: " + hesap);

    }
}