package day41_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;

        try {
             c=a/b;
        } catch (Exception e) {
            // burada yazilan e javanin exception i atayacagi obje
            // Exception ise olusan exception`in turu
           // e.printStackTrace();//.ArithmeticException: hatayi yazdirir ama calismaya devam eder
            System.out.println(e.getMessage());/// by zero hatanin sebebini verir

        }
        System.out.println(c);
    }
}
