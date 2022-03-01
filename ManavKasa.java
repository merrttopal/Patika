package giris;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14;

        double elma = 3.67;

        double domates = 1.11;

        double muz = 0.95;

        double patlican = 5;

        System.out.print("Armut Kaç Kilo ? :");
        double armutkg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double elmakg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double domateskg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double muzkg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicankg = input.nextDouble();

        double toplam = ((armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg));

        System.out.println("Toplam Tutar : "+ toplam);


    }
}
