package day08_IfElseIfStatement;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin. 50’den kucukse “D”,
        // 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 uzerindan aldiginiz notu giriniz");
        double not= scan.nextDouble();
        if(not<0|| not<100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }
         else if(not>=80){
            System.out.println("A");}

            else if (not>=60){
                System.out.println("B");}

                else if(not>=50){
            System.out.println("C");}
                else
            System.out.println("D");
            }
        }


