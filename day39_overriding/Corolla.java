package day39_overriding;

public class Corolla extends Toyota {
   protected String hiz="Corolla max 220 km hiz yapar.";
    protected String yakit="Corolla benzinli veya elektriklidir.";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla arabalar cevreci motor kullanir");
    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir.");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor`in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin variable`lar
        data turunun secildigi class ve onun parent classlarindan deger alabilir.

         Methodlar icin ise yine Data turunun oldugu class`a gideriz.
         */

        // sout larin saginda comment edilen yerler datalarin geldigi class i gosteriyor.
        Corolla araba1=new Corolla();
        System.out.println(araba1.hareket);// araba
        System.out.println(araba1.hiz);//Corolla
        System.out.println(araba1.yakit);//Corolla
        System.out.println(araba1.marka);// Toyota
        System.out.println(araba1.sirketMerkezi);//Toyota
        System.out.println(araba1.model);// Corolla

        araba1.motor();// Corolla


        Toyota araba2=new Corolla();
        System.out.println(araba2.hareket);// araba
        System.out.println(araba2.hiz);//Corolla
        System.out.println(araba2.yakit);//Corolla
        System.out.println(araba2.marka);// Toyota
        System.out.println(araba2.sirketMerkezi);//Toyota
      //  System.out.println(araba2.model);// CTE

        araba2.motor();//Corolla arabalar cevreci motor kullanir
        araba2.garanti();//Toyota
        araba2.yakitTuketimi();//Corolla
        //araba2.vitesSayisi(); once parent a bakiyoruz. Orada yoksa onun parentina bakariz. Icinde bulundugumuz class da
        // bu method olsa bile cte verir




        Araba araba3=new Corolla();
        System.out.println(araba3.hareket);// araba
        System.out.println(araba3.hiz);//Araba
        System.out.println(araba3.yakit);//Araba
        System.out.println(araba3.marka);// Araba
      // System.out.println(araba3.sirketMerkezi);//CTE
       // System.out.println(araba3.model);// CTE

        araba3.yakitTuketimi();//Corolla
        araba3.motor();//Corolla
       // araba3.garanti();//Araba classsinda garanti methodu olmadigi icin CTE verir
      //  araba3.vitesSayisi();//Araba classsinda garanti methodu olmadigi icin CTE verir


    }
}
