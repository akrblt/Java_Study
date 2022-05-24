package day18_NestedFoorLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun.
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya sayiyi kuculy diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz!");
        System.out.println("Lütfen 1-50 arasında bir sayı giriniz: ");
// Kullanıcıdan sayı alıyoruz
        int tahmin = input.nextInt();
        int sayac=0;
// Bilgisayardan rastgele sayı alıyoruz
        int sayi = rnd.nextInt(50);


       // System.out.println(sayi);
        while (tahmin != sayi) {
            if(tahmin < 0 || tahmin > 50) {
                System.out.println("1 ile 100 arasında bir değer giriniz: ");
                tahmin = input.nextInt(); }
            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = input.nextInt(); sayac++; }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = input.nextInt(); sayac++;}
        }
        System.out.println((sayac+1)+" defada buldunuz.");
// Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
// ve print komutunu yazdırırız
        System.out.println("Tebrikler, kazandınız!");
    }

    }

