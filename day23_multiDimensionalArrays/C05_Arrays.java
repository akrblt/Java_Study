package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // verilen bir arrays e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};


        //arr[3]=8;// arrays de olmayan bir index e deger atamayiz, rte verir

      //  arr={1,9,8}; var olan bir arrays e icindeayni boyutta bile olsa direk yeni degerler iceren bir arrays atayamayiz

        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0] eski arr yi oldurup lenght i 4 olan default degerlere sahip bir arrays oldu

        int arrYeni[]=new int[5];

        arr=arrYeni;//[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;//[2, 0, 0, 5, 0]
        System.out.println(Arrays.toString(arr));

        // Bir arrays e icinde hazir elementlarin oldugu yeni bir array atamak isterseniz
        // bunu{1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz arrays i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]









    }
}
