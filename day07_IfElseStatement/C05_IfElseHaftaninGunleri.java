package day07_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gunismini giriniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("CUMARTESI")||gunIsmi.equals("PAZAR")){
            System.out.println("Girilen gun haftasonu");
        }
        else
            System.out.println("Girilen gun haftaici: ");
    }
}
