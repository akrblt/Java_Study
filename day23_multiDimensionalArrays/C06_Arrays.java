package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // verilen bir arrays e yeni bir element ekleyen bir method olusturun
        int arr[]={3,5,7,1,0,9};

        int eklenecekEleman=4;

        arr=arrayeElemanEkle(arr,eklenecekEleman);

        System.out.println(Arrays.toString(arr));//[3, 5, 7, 1, 0, 9, 4]
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekEleman) {

        int yeniArrays[]=new int[arr.length+1];//[0,0,0,0]
        for (int i = 0; i <arr.length ; i++) {
            yeniArrays[i]=arr[i];

        }
        yeniArrays[yeniArrays.length-1]=eklenecekEleman;



        return yeniArrays;


    }
}
