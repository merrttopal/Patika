package giris;
import java.util.Scanner;

public class KucukBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayıa,sayıb,sayıc;
        System.out.print("1. Sayı(a): ");
        sayıa = input.nextInt();
        System.out.print("2. Sayı(b): ");
        sayıb = input.nextInt();
        System.out.print("3. Sayı(c): ");
        sayıc = input.nextInt();

        if ((sayıa<sayıb)&&(sayıa<sayıc)) {
            if (sayıb<sayıc){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }

        }

        else if((sayıb<sayıa)&&(sayıb<sayıc)){
            if (sayıa<sayıc){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }

        }else if((sayıc<sayıa)&&(sayıc<sayıb)){
            if (sayıa<sayıb){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }

    }
}
