package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; // deger atamasi yapmadik ama java kabul etti

       // System.out.println(Arrays.toString(arr));
       // arr={1,3};
        // makul olan
        arr=new int[6];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);// 6 String deki lenght() parantezi yok

        // Array deki her bir elemani index degeri kadar artiralim
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=i;

        }
        System.out.println(Arrays.toString(arr));

        // son index teki elemani yazdiralim
        System.out.println(arr[arr.length-1]);// 5


    }
}
