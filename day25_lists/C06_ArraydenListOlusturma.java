package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        // verilen bir array i listeye cevirin

        String arr[]={"A","B","C"};
        List<String> arraydenList =Arrays.asList(arr);

        // Yeni olusturulan list add(),remove(), ve clear() methodlarini kullanamayiz.Uzunlugunu degistiremeyiz.
        // .UnsupportedOperationException
        //arraydenList.add("J");
        System.out.println("17. satirdaki list: "+arraydenList);
        arr[1]="F";
        // yapilan atamalar her iki tarafida degistirir
        System.out.println("19. satirdaki Array: "+Arrays.toString(arr));
        System.out.println("20. satirdaki list: "+arraydenList);

        arraydenList.set(0,"Y");
        System.out.println("23. satirdaki Array: "+Arrays.toString(arr));
        System.out.println("24. satirdaki list: "+arraydenList);

    }
}
