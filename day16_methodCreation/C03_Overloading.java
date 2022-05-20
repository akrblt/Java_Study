package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayip yazdiran metod olusturalim

        int sayi1=10;
        int sayi2=20;


        ikiSayiTopla(sayi1,sayi2);

        // iki double sayinin toplamini yazdiran method
        double sayi3=15.2;
        double sayi4=10.3;

        ikiSayiTopla(sayi3,sayi4);

        int sayi5=30;
        double sayi6=10;
        ikiSayiTopla(sayi5,sayi6);




    }
    private static void ikiSayiTopla(int sayi3, double sayi4) {
        System.out.println(" Bir int bir double toplami: "+(sayi3+sayi4));

    } private static void ikiSayiTopla(double sayi3, int sayi4) {
        System.out.println(" Bir  double int bir toplami: "+(sayi3+sayi4));
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println(" 2 Double toplami: "+(sayi3+sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println(" Iki int toplami: "+(sayi1+sayi2));
    }
}
