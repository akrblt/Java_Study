package day12_strimgManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        // butun herseyi degistirmek icin kullaniliyor
        // replace char olur replaceAll da char olmaz
        // replaceAll da Regular Expressions kullanilabilir
        // butun harflaerin yerine * yaz
        //butun Stringlerin yerine rakam yaz
        /*
        \\s  : bosluk(space)
        \\S  :bosluk disindaki tum karakterler
        \\w  :harfler ve rakamlar(a-z,A-Z,0-9)
        \\W  :harf ve rakam harici hersey
        \\d  :rakamlar(0-9)
        \\D  :rakamlar disindaki tum karakterler
         */


        String str="Bugun ne cok sey ogrendik";

        // kullanicidan isim soyisim bilgisini alip
        //butun harfleri * yapalim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soy isminizi giriniz");
        String name=scan.nextLine();

        String nameSon=name.replaceAll("\\S","*");
        System.out.println("nameSon = " + nameSon);










    }
}
