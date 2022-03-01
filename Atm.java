package giris;

import java.util.Scanner;
import java.util.SortedMap;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        boolean isFalse = false;
        int right = 3;
        int balance = 1500;
        int select;
        int price=1;
        while (right>0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();



            switch (userName){
                case "patika":
                    break;

                default:
                    isFalse = true;

            }


            switch (password){
                case "dev123":
                    break;
                default:
                    isFalse = true;

            }

            if (isFalse==true){
                --right;
                System.out.println("Hatalı Kullanıcı adı veya şifre. Tekrar deneyiniz.");

                System.out.println("Kalan deneme hakkınız."+right);

                if (right==0){
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen banka ile irtibata geçiniz.");
                }else {
                    System.out.println("Kalan deneme hakkınız."+right);
                }
            }else {
                System.out.println("M bankasına hoşgeldiniz.");
                do {
                    System.out.println("1- Para Yatırma\n" +
                                    "2- Para Çekme\n" +
                                    "3- Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı: ");
                            price = input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz.");

                            }else {
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            break;
                    }

                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere!");
                break;




            }


        }
















    }
}

