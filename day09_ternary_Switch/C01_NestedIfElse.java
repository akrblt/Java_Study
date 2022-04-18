package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        //Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int num = scan.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Lutfen 4 basamkli bir sayi giriniz");
        } else if (num % 5 == 0) {


                if (num % 10 == 0) {
                    System.out.println(num + ": 5 e bolunen cift sayi");


                } else if (num % 5 == 0 && num % 10 != 0) {
                    System.out.println(num + ": 5 e bolunen tek sayi");
                }
            } else
            System.out.println("Tekrar deneyin");

        }
    }

