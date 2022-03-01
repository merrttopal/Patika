package giris;


public class PrimeNumber {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        String  primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int t=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    t = t + 1;
                }
            }
            if (t ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Asal sayılar :");
        System.out.println(primeNumbers);
    }
}

