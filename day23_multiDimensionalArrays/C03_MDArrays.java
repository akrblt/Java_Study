package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        // boyutlari belirli bir arrays i elementleri girmeden olusturalim

        // bir okulda icinde 24 ogrenci olan 8 sinif vardir

        int arr[][]=new int[8][24];

        // bir ilcede herbirinde 24 ogrencilik 8 sinif bulunan 5 okul vardir.

        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kisilik 2 tanede 22 ksilik sinif vardir.
        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][22];

        // olustururken elementleri atama yaparsak farkli uzunluktaki arrays leri tanimlayabiliriz

        int arr1[][]={{3,1,7,5,11},{6,10,2}};// bu arrays i manuel olarak tanimladik.Elemanlarini degistirebiliriz
    }
}
