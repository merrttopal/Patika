package giris;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {

        Scanner notlar = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        int mat = notlar.nextInt();
        if ((mat<0)||(mat>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            mat = notlar.nextInt();
        }

        System.out.println("Fizik Notunuzu Giriniz : ");
        int fizik = notlar.nextInt();
        if ((fizik<0)||(fizik>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            fizik = notlar.nextInt();
        }

        System.out.println("Kimya Notunuzu Giriniz : ");
        int kimya = notlar.nextInt();
        if ((kimya<0)||(kimya>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            kimya = notlar.nextInt();
        }

        System.out.println("Türkçe Notunuzu Giriniz : ");
        int turkce = notlar.nextInt();
        if ((turkce<0)||(turkce>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            turkce = notlar.nextInt();
        }

        System.out.println("Tarih Notunuzu Giriniz : ");
        int tarih = notlar.nextInt();
        if ((tarih<0)||(tarih>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            tarih = notlar.nextInt();
        }

        System.out.println("Müzik Notunuzu Giriniz : ");
        int muzik = notlar.nextInt();
        if ((muzik<0)||(muzik>100)){
            System.out.println("Girilen değer 0-100 aralıgında olmalı.");
            muzik = notlar.nextInt();
        }

        int a = (mat + fizik + kimya + turkce + tarih + muzik);
        int notOrtalama = a / 6;
        System.out.println("Not Ortalamanız : " + notOrtalama);


        boolean gecti = notOrtalama >= 55;

        String ders = (gecti) ? "Sınıfı geçtiniz !" : "Sınıfta kaldın";
        System.out.println(ders);



    }
}
