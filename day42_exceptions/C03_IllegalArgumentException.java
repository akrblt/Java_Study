package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalArgumentException {
        /*
        Kullanicidan yasini isteyin.Kullanici -,0 ve >120 bir sayi girerse
        IllegalArgumentExceptionolusacak sekilde
        bir code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if(yas<=0 || yas>120){
         //   System.out.println("Lutfen gecerli bir yas giriniz");
            // Java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        }else
            System.out.println("Uygun yas girdiniz tesekkurler");

    }
}
