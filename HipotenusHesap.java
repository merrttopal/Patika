package giris;

import java.util.Scanner;
import java.lang.Math;

public class HipotenusHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        int a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        int b = input.nextInt();
        double hipoten = (a*a)+(b*b);
        //int hip = (hipoten);
        System.out.println(("Hipotenüs = ")+Math.sqrt(hipoten));





    }
}
