package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir array de en kucuk ve en buyuk degerleri yazdirin

        int arr[]={3,5,6,1,9,0,45,25,4,9};
        // sort methodu olmadan yapalim


        //int enKucukSayi=arr[0];
            int enKucukSayi=Integer.MAX_VALUE; // bu sekildede uzak bir deger atarsak en kucuk sayiyi bulabiliriz
           int enBuyukSayi=Integer.MIN_VALUE;
            // onemmli olan bizim atadigimiz sayi array deki sayilardan kucuk olmamali

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }

            if(arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }
        System.out.println("Array deki en kucuk sayi : "+enKucukSayi);//0
        System.out.println("Array deki en buyuk sayi : "+enBuyukSayi);//45

        Arrays.sort(arr);
        System.out.println("Array deki en kucuk sayi : "+arr[0]);
        System.out.println("Array deki en buyuk sayi : "+arr[arr.length-1]);
    }
}
