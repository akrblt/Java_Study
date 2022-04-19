package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan sayi olarak ay numarasini alip istenen ay ismini yazdiran
        // bir program yazdiriniz
        // bu soruyu if else ilede yapabiliriz ama cok uzun ve zahmetli olur
        // bunun yerine switch case kullanilabilir
        // switch icine yazilan variablin degerine gore
        // ilgili case yi bulur ve yazdirir
        // break i goruncede kodu durdurur ve disina cikar
        // if else deki son else gibi geriye kalan durumlari yazdirmak icin
        //default satirini yazariz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu sayisal olarak giriniz");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");


        }

    }
}
