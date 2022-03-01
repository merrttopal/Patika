package giris;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();


        for(int i=1;i<n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


        int a=1;
        for(int i=n-2;i>=0;i--){


            for(int k=0;k<=a;k++){
                System.out.print(" ");
            }


            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
            a++;

        }




    }
}