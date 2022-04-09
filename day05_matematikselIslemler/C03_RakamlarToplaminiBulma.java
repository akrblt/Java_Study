package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        int birlerbasamagi=sayi%10;
        System.out.println("birler basamagi: "+birlerbasamagi);
        int kalan=sayi/10;
        int onlar=kalan%10;

        System.out.println("Onlar basamagi:"+onlar);
        int kalanon=kalan/10;

        int yuzler=kalanon%10;
        System.out.println("Yuzler basamagi: "+yuzler);
        int kalanyuz=kalanon/10;
        int binler=kalanyuz%10;
        System.out.println("Binler basamagi: "+binler);
        System.out.println("Sayinin rakamlari toplami: "+(birlerbasamagi+onlar+yuzler+binler));


    }
}
