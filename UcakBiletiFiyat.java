package giris;

import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;
        int age;
        double way;
        boolean isError = false;
        double total = 0;
        double disTotal = 0;


        System.out.print("Mesafe Giriniz (km cinsinden) : ");
        distance = input.nextDouble();
        System.out.print("Yaşınız : ");
        age = input.nextInt();
        System.out.println("1)Tek yön  \n2)Gidiş Dönüş :");
        way = input.nextDouble();


        if (age<0){
            isError=true;
        }else if (distance<0){
            isError=true;
        }

        if (way==1){
            disTotal = (distance*0.10);
        }
        else if (way==2){
            disTotal = 2*(distance*0.10);
        }
        else {
            isError=true;
        }



        if (age>0 && age<=12){
            total = (disTotal)*0.5;
        }
        else if(age<=24){
            total = (disTotal)*0.9;
        }
        else if(age<65){
            total=disTotal;
        }
        else if(age>65){
            total = (disTotal)*0.7;
        }



        if (way==2){
            total = total*0.8;
        } else if (way==1) {
            total= total;
        }

        if(isError){
            System.out.println("Hatalı Veri Girdiniz !");

        }
        else {
            System.out.println("Toplam tutar : "+total);
        }








    }
}
