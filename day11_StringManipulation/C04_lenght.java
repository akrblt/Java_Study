package day11_StringManipulation;

import java.util.Scanner;

public class C04_lenght {
    public static void main(String[] args) {

        String isim="";// isim variablina hiclik atanmis. "" hiclik bir degerdir.
        System.out.println(isim.length());// hicligin lenght i 0 dir.
        String ad=null;// null bir deger degildir. Sadece deger atanmadiginin belirtecidir.
       // System.out.println(ad.length());
        // calistirildiginda rte verir.

        //Kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("Ilk harf: "+name.toUpperCase().charAt(0));
        System.out.println("Son harf: "+(name.toUpperCase().charAt(name.length()-1)));

        String str3;//str3 e deger atnmamistir.Yazdiracak olursak cte verir
        String str4=null;
       // System.out.println(str3);
        //str4 e null pointer ile isaretlendiginden java olayin kontrol altinda old bilir
        // ancak str3 bir deger atamasi olmadigi icin yazdiracak olursak cte verir


    }
}
