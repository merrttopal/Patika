package giris;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i<=number;i++){
            if (number%i ==0){

                sum = sum + i;

            }
        }
        if (sum!=number){
            System.out.println(number+" bir mükemmel sayıdır.");
        }
        else {
            System.out.println(number+" bir mükemmel sayı değildir.");
        }






    }
}
