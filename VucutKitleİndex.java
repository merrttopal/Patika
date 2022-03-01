package giris;
import java.util.Scanner;
public class VucutKitleİndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double index = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+ index);

    }
}
