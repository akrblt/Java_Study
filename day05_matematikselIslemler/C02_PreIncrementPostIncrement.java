package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int a=15;
        int b=a++;// once atama yapar sonra deger arttirir
        System.out.println(b);
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2=sayi1++;
        System.out.println(sayi1+","+sayi2+","+sayi3);
        sayi3=++sayi1;
        System.out.println(sayi1+","+sayi2+","+sayi3);
        System.out.println(sayi3++);
        System.out.println(19*14);




    }
}
