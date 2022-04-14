package day07_IfElseStatement;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {


//Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin
        // yanlis yazarsa yanlis giris yzdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfn gun ismini giriniz");
        String gunIsmi= scan.next().toLowerCase();
        if (gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")){
            System.out.println("Girilen gun haftasonu");
        }
        else if (gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")
                ||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")) {
            System.out.println("Girilen gun haftaici: " + gunIsmi);
        }
        else
            System.out.println("Hatali giris Lutfen gecerli gun ismi giriniz");
        // if else if statement else ile bitiyorsa olaskliklardan biri calisir
        //Java ilk buldugu true yu calistirir true dan sonra hicbir sarta bakmaz


    }
}
