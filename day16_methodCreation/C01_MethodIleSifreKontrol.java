package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        //        Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
//    - Ilk harf buyuk harf olmali
//    - Son harf kucuk harf olmali
//    - Sifre bosluk icermemeli
//    - Sifre uzunlugu en az 8 karakter olmali
//Collapse
        // bu 4 kontrolu method ile yapin

        String sifre="Ahmet 123";
        boolean ilkHarf=ilkHarfKontrolet(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if(ilkHarf&&sonHarfKontrol&&boslukKontrol&&uzunlukKontrol){
            System.out.println("Sifreniz basarili bir sekilde tanimlandi");
        }else {
            System.out.println("Islem basarisiz lutfen tekrar deneyiniz");
        }





    }

    public static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc=false;
        }
        return uzunlukKontrolSonuc;

    }


    public static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if(!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else {
            System.out.println("Sifre bosluk icermemeli");
        }
        return boslukKontrolSonuc;
    }

    public static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        return sonHarfSonuc;
    }

    public static boolean ilkHarfKontrolet(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;// true yada false onemli degil
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
            //ilkHarfSonuc=false; bunu yazmamiz onemli degil
        }
        return ilkHarfSonuc;
    }
}
