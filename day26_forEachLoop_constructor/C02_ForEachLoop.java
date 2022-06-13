package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // 10 elementli bir list olusturalim

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        List<Integer> sayilar=new ArrayList<>();
        for (int each: arr
             ) {
            sayilar.add(each);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sayilar);

        // sayilar listesinde 3 e bolunemeyen sayilari for-each loop ile yazdiralim

        for (int bolunemeyen: sayilar
             ) {
            if(bolunemeyen%3!=0){
                System.out.print(bolunemeyen+" ");

            }


        }
    }
}
