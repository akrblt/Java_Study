package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        // Verilen Array de istenen bir elementin var olup olmadigini true false yazdirarak
        // gosteren bir method olusturun

        int arr[]={3,5,6,1,9,0,45,25,4,9};

        int istenenSayi=9;

        istenenElemanVarMi(arr,istenenSayi);

        // Eger Javadan hazir BinarSearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz. Sonuc olarak bize int dondurur

        Arrays.sort(arr);
        Arrays.binarySearch(arr,istenenSayi);







    }

    public static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc=false;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==istenenSayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);

    }
}
