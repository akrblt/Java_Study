package day15_methodCreation;

public class C04 {
    // bu class i calistiramayiz cunki main metodu olusturmadik
    // Ancak baska class lardan bu class kullanilabilir
    //Sadece depo gorevi gorur bu class
    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+
                          kelime.substring(0,1);
        System.out.println("girdiginiz kelimenin harf sayisi: 5 ");
        System.out.println("Kelimenin tersten yazdirilmis hali: "+tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimenin harf sayisi: 4 ");
        System.out.println("Kelimenin tersten yazdirilmis hali: "+tersKelime);

    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimenin harf sayisi: 3 ");
        System.out.println("Kelimenin tersten yazdirilmis hali: "+tersKelime);

    }



}





