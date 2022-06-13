package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
        // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr[]={"Ahmet","Burak","Ali"};
        String arr1[]={"Ahmet","Mehmet","Saban"};

        List<String> ortakEleman=new ArrayList<>();

        for (String each1 : arr
             ) {
            for (String each2: arr1
                 ) {
                if(each1.equals(each2)){
                    ortakEleman.add(each2);// buraya each1 de yazabiliriz
                }

            }

        }
        if(ortakEleman.isEmpty()){
            System.out.println("Ortak eleman yok");
        }
        else System.out.println("Iki array deki ortak elemanlar: "+ortakEleman);
    }
}
