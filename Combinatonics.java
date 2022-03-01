package giris;

import java.util.Scanner;

public class Combinatonics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        int n = input.nextInt();
        System.out.println("r sayısını giriniz: ");
        int r = input.nextInt();
        double totalN =1;
        double totalR =1;
        double a = n-r;
        double totalNR = 1;
        double combi;

        for (int i =1;i<=n;i++){
            totalN = totalN*=i;
        }
        for (int l =1;l<=r;l++){
            totalR = totalR*=l;
        }
        for (int k =1;k<=a;k++){
            totalNR = totalNR*=k;
        }

        combi = totalN/(totalR*(totalNR));

        System.out.println("C'nin R'ye Kombinasyonu ="+combi);











    }
}
