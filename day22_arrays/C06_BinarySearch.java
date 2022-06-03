package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,0,45,25,4,9};

        int istenenSayi=27;



        // Eger Javadan hazir BinarSearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz. Sonuc olarak bize o degerin indexini  olarak dondurur

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));//-

        // eger olmayan bir elementi aratirsak
        //Java bulamadigini gostermek icin - isareti koyar. Sonrada
        // o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir

    }
}
