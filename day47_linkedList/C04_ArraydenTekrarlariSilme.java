package day47_linkedList;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen array den tekrar eden elementleri silip
        // unique elementler olusturan bir array haline donduren bir method olusturun

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arr=benzersizYap(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8]
    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet=new TreeSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet);//[1, 2, 3, 4, 5, 6, 7, 8]
        // Set`de index yapisi yoktur, dolayisiyla forloop kullanamayiz.Foreach kullanmaliyiz
        int index=0;
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];

        for (Integer each:benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;

        }
        return arrBenzersiz;
    }
}
