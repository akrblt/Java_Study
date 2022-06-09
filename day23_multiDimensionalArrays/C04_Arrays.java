package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // kullaniciya kac elementlik bir arrays olusturacagini sorun
        // Arrays i olusturup elementleri kullanicidan alip , array i atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir arrays istediginizi yaziniz");

        int uzunluk= scan.nextInt();// kullaniciyi 5 yazdi ise
        int arr[]=new int[uzunluk];// [0,0,0,0,0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Arrays icin "+(i+1)+". elemani giriniz. ");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
