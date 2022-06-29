package day35_inheritance;

public class Isci extends Personel {
    public static void main(String[] args) {
        Personel objPersonel=new Personel();
        objPersonel.isim="Eren";
        objPersonel.soyIsim="Terzioglu";
        objPersonel.adres="Amsterdam";

        Isci objIsci=new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyIsim="Efe";
        objIsci.adres="Ankara";

    }
}
