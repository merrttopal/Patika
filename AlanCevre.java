package giris;
import java.util.Scanner;
import java.lang.Math;
public class AlanCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        int a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        int b = input.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        int c = input.nextInt();

        double cevre = (a+b+c);
        System.out.println("Üçgenin Çevresi : "+ cevre);

        double alan = ((cevre/2)*((cevre/2)-a)*((cevre/2)-b)*((cevre/2)-c));
        System.out.println("Üçgenin Alnı = " + Math.sqrt(alan));

    }
}
