package giris;
import java.util.Scanner;
public class WeatherAdvice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        int heat = input.nextInt();

        if (heat<5){
            System.out.println("Kayak Yapabilirsin.");

        }
        else if (heat<=15){
            System.out.println("Sinemaya gidebilirsin.");
        }

        else if (heat<=25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else if (heat>25){
            System.out.println("Yüzmeye gidebilirsin.");
        }






    }
}

