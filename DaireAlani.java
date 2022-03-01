package giris;
import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapı : ");
        int r = input.nextInt();

        System.out.print("Dairenin Merkez Açısı : ");
        int a = input.nextInt();
        double pi = 3.14;
        double alan = (pi*r*r);
        double cevre = (2*pi*r);
        double dilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı = "+alan+"\nDairenin Çevresi = "+cevre );
        System.out.print("Dairenin Dilim Alanı : "+ dilimAlan);






    }


}
