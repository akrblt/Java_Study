package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=1000;
        // verilen sayinin 3 veya daha cok  basamakli ploup olmadigini kontrol eden
        // ve yazdiran bi ternary yazdirin

        String sonuc=sayi>=100 ? "Sayi 3 ve daha fazla basamakli":"Sayi negatif yada 3 basamaktan kucuk";
        System.out.println(sonuc);
        // ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da data turune gore bir variable a atama yapabiliriz

    }
}
