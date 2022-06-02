package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayse"};
        // array icindeki elementlere ulasabilmek icin index kullaniriz
        System.out.println(arr1[0]);
        arr1[1]="Esila";
        System.out.println(arr1[1]);
        // array in icindeki index i kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
       // System.out.println(arr2[5]);// execption

        // Array in tamamini yazdirmak istersek
        System.out.println(arr2);//[I@58ceff1 Array ler non primitive olduklarindan direk yazdirmak istersek
                                 // Java referans bilgisini yazdirir

        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]);
        }

            // Array i yazdirmak icin Javadaki Array Class indan toString() kullanilir

            System.out.println(Arrays.toString(arr2));

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));// Array e yeni degerler atadik ve yazdirdik
        System.out.println(Arrays.toString(arr1));



















        }

    }

