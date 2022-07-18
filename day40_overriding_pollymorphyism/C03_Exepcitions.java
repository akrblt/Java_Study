package day40_overriding_pollymorphyism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi alip , bolerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=1){

            System.out.println("Bolmek istediginiz sayiyi giriniz");
            int sayi1= scan.nextInt();

            System.out.println("Kaca Bolmek istediginizi  giriniz");
            int sayi2= scan.nextInt();

            try {
                System.out.println("Sonuc: "+(sayi1/sayi2));
            } catch (Exception e) {
                e.printStackTrace();
                // istersek manuel olarak da hata mesaji yazabiliriz
                System.out.println("Girdiginiz sayilarda problem var");
            }
            System.out.println("Devam etmek icin 1\nbitirmek icin 2`ye basiniz");

        }


        /*
        sayi2=0 olursa sayi1/0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir
        Cikan execption mesajinda ne tur bir sorun oldugu
        Neden kaynaklandigi ve hangi satirda old cikar

         */



    }
}
