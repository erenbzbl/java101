import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int  n1, n2, select;
       Scanner scanner = new Scanner(System.in);
       System.out.print("İlk Sayıyı Giriniz: ");
       n1 = scanner.nextInt();
       System.out.print("İkinci Sayıyı Giriniz: ");
       n2 = scanner.nextInt();
       System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
       System.out.print("Seçiminizi Giriniz: ");
       select = scanner.nextInt();

       switch (select) {
           case 1:
               System.out.println("Toplama İşleminin Sonucu = " + n1 + " + " + n2 + " = " + (n1 + n2));
               break;
               case 2:
                   System.out.println("Çıkarma İşleminin Sonucu = " + n1 + " - " + n2 + " = " + (n1 - n2));
                   break;
                   case 3:
                       System.out.println("Çarpma İşleminin Sonucu = " + n1 + " * " + n2 + " = " + (n1 * n2));
                       break;
                       case 4:
                           System.out.println("Bölme İşleminin Sonucu = " + n1 + " / " + n2 + " = " + (n1 / n2));
       }
    }
}