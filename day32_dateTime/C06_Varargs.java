package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        // Verilen iki sayiyi toplayan bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        // birde 3 sayiyi toplayan method olusturalim
        // bir de

        toplaGel();
        toplaGel(sayi1);
        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5);


    }

    private static void toplaGel(int... num) {// Boyle 3 nokta koyarsak hepsini kabul ediyor
        int toplam=0;
        for (int each:num
             ) {
            toplam+=each;

        }
        System.out.println(toplam);
    }



}
