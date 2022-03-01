package giris;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double kdvOran = 0.18;
        double kdvOran2 = 0.08;

        System.out.print("Hesaplanacak Tutar : ");

        double tutar = input.nextDouble();

        boolean redline = tutar>=1000;
        double sonuc = (redline) ? (tutar*kdvOran2) :(tutar*kdvOran) ;

        System.out.println("KDV oranınız : "+(sonuc)+" TL");
        System.out.println("KDV\'li tutar : "+(sonuc+tutar)+" TL");

    }
}
