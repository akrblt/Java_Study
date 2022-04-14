package day07_IfElseStatement;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

//Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("Sayi cifttir");

        }
        if (sayi%2==1){
            System.out.println("Sayi tektir");
        }
        // normalde bir tamsayi ya tektir ya cifttir
        // o zaman tek olmasini ve cift olmasini iki ayri if ile degil
        // tek if else satement ta yapmak daha guzel olur
        // if else ile cozum
        if(sayi%2==0){
            System.out.println("sayi cifttir");
        }
        else
            System.out.println("Sayi tektir");







    }
}
