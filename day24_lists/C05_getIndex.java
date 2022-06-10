package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);

        System.out.println(sayilar.get(2));//(7)  2. indexte ne var diye sorduk. Ya yazdirmaliyiz yada bir degere atamaliyiz
        System.out.println(sayilar);//[7, 5, 7, 3] sadece var mi yok mu kontrol etti.Herhangi bir degisiklik yapmadi
    }
}
