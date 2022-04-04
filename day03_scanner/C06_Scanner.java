package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lutfen isminizi ve soyisminizi giriniz");
       // String name=scan.nextLine();
       // System.out.println("Isim-Soyisim :"+name);
        // Kullanicidan ismini alin isminin bas harfini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("Girilen isim: "+name);
        System.out.println("Girilen ismin son harfi harfi: "+name.charAt(name.length()-1));

    }
}
