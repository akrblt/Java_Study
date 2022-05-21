package day17_ForLoop;

public class C06_ForLoop {
    public static void main(String[] args) {


        // Verilen iki harf ve aralarindaki harfleri yazdiran bir code yaziniz

        char harf1='a'; // degiskenimizi char seciyoruz. Cunku ascii degerlerinden ileri geri gidebiliriz.
                        // String de boyle bir sey yapamiyoruz
        char harf2='h';

        for (char i = harf1; i <=harf2 ; i++) {
            System.out.print(i+" ");

        }

        double baslangic=10;  // baslangic bitis ve artis degerlerine gore butun sayilari yazdirin
        double bitis=20;
        double artis=0.2;
        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i+" ");

        }
    }
}
