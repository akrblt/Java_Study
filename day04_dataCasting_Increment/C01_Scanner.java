package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini alin isminin bas harfini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("Girilen isim: "+name);
        System.out.println("Girilen ismin bas harfi harfi: "+name.charAt(0));

    }
}
