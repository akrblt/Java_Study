package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // Verilen sayinin pozif mi negatif mi oldugunu kontrol edip
        // 0 veya poz ise tek veya cift
        // neg ise -100 den kucuk veya buyuk
        // old belirleyen bir ternary yaziniz

        int sayi=121;
        if(sayi>=0){
            if(sayi%2==0){
                System.out.println("Sayi pozitif cift sayi");
            } else {
                System.out.println("Pozitif tek sayi");

        }

        }else {
            if (sayi<=-100){
                System.out.println("Sayi -100 den kucuk negatif sayi");
            } else {
                System.out.println("Sayi -100 den buyuk negatif sayi");
        }
        }
        // Ternary ile cozum
        String sonuc=sayi>=0 ?
                     (sayi%2==0?"pozitif tek sayi":"pozitif tek sayi"):
                     (sayi<-100?"-100 den kucuk negatif":"-100 den buyuk negatif sayi");
        System.out.println(sonuc);


    }
}
