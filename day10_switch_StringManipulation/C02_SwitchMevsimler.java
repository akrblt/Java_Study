package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        //Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran
        // bir switch yazdirin
        // Switch statement da long double float ve boolean KULLANILAMAZ

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu sayisal olarak giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println(" kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");

        }
    }
}