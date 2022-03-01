package giris;

import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>=2 && a<=20){
            for(int i = 1; i<=10; i++){
                System.out.println(a+ " x " +i+" = "+a*i);
            }
        }

    }
}
