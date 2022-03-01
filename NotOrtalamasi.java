package giris;
import  java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner notlar = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        int mat = notlar.nextInt();


        System.out.println("Fizik Notunuzu Giriniz : ");
        int fizik = notlar.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        int kimya = notlar.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        int turkce = notlar.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        int tarih = notlar.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        int muzik = notlar.nextInt();

        int notOrtalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Not Ortalamanız : "+notOrtalama);

        boolean gecti = notOrtalama>=60 ;

        String ders = (gecti) ? "Sınıfı geçtiniz !" : "Sınıfta kaldın";
        System.out.println(ders);

    }
}
