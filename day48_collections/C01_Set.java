package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array`in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun

        Integer arr[]={3,5,4,6,2,1,4,8,9,8,7,4,7};
        arrayiTekrarsizYazdir(arr);
    }

    private static Integer[] arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);

        }
        System.out.println(tekrarsizElementKumesi);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        return(arr);
    }
}
