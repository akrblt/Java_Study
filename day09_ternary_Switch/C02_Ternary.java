package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Ternary ile yapilan tum islemer if else ile de yapilabilir.
        // Kolay basit anlasilabilir bir yapisi vardir
        //Ternary icersinde kompleks kodlar olmaz. Bizi sonuca goturen basit islemler olabilir

        // Kullanicidan 1 tam sayi alip t mi C oldugunu goteren bir kod create edin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        }else
            System.out.println("SAyi tek");

        System.out.println(sayi%2==0? "Sayi cift":"SAyi tek");
    }
}
