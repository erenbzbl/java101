import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double ucgen;
        double sonuc;

        Scanner sc = new Scanner(System.in);

        System.out.print("1.Kenar Uzunluğunu Giriniz: ");
        a = sc.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz: ");
        b = sc.nextInt();

        System.out.print("3.Kenar Uzunluğunu Giriniz: ");
        c = sc.nextInt();

        ucgen = (a+b+c)/2;
        sonuc = Math.sqrt(ucgen*(ucgen - a)*(ucgen - b)*(ucgen - c));

        System.out.println("Üçgen Alan " + sonuc);




    }
}