import java.util.Scanner;


public class Exponentiation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değer: ");
        int floor = scan.nextInt();
        System.out.println("Us değer: ");
        int base = scan.nextInt();
        System.out.println("Sonuç: "+expo(floor, base));
    }

    static double expo(int floor, int base){
        double result = Math.pow(floor, base);

        
        return result;
    }
}
