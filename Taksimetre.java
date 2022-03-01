package giris;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Yolumuz kaç kilometre ? ");
        int yol = input.nextInt();

        int baslangic = 10 ;
        double kmUcreti = 2.20;
        int kisaMesafe = 20;
        double ucret = baslangic+(yol*kmUcreti);
        boolean kisa = ucret>=20;
        double sonuc = kisa ? ucret : kisaMesafe;

        System.out.println(sonuc);

    }
}
