package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran bir method olusturun

        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler";
        String harf="x";

        harfKacKereKullanilmis(cumle,harf);
    }

    public static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac=0;
        String karakterler[]=cumle.split("");
        for (int i = 0; i <karakterler.length ; i++) {
            if(karakterler[i].equals(harf)){
                sayac++;
            }

        }
        System.out.println("Aradiginiz "+harf+ " harfi verilen cumlede "+sayac+" adet kullanilmis.");


    }
}
