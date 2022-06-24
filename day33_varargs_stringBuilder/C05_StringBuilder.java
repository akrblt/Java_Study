package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        /*
        Compare iki sb `i esit mi diyekontrol etmek icin
         ilk harften baslayarak tum karakterleri karsilastirir
         Ayni olan karakterler icin bir sey yazdirmaz
         farkli olan ilk karakterler icin ascii tablosuna gore
         kac deger geride veya ileride oldugunu yazdirir.
         Tamamen ayniysa 0 dondururur.
         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Bli Can");

        String str="Ali can";

        System.out.println(sb1.compareTo(sb2));//-32 Harflerin ascii degeri arasindaki farki verir

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true bu method burada kullanilmasi mantiksiz

        //System.out.println(sb1==str);  Farkli obje turleri old icin java kiyas yapmaz


    }
}
