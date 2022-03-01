package giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        int year = input.nextInt();

        if (((year % 4)==0)||((year%400)==0)){
            System.out.println(year + " artık bir yıldır !");
        }else {
            System.out.println(year+" artık bir yıldır değildir !");
        }


    }
}

