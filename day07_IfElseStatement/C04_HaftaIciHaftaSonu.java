package day07_IfElseStatement;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gunismini giriniz");
        String gunIsmi= scan.next().toLowerCase();
        if (gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")
                          ||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")){
            System.out.println("Girilen gun haftaici: "+gunIsmi);
        }
        if(gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")){
            System.out.println("Girilen gun haftasonu: "+gunIsmi);
        }

    }
}
