package day18_NestedFoorLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        int input=5;


        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                // nested for loop kare dikdortgen veya ucgen formatinda olabilir.
                //Dikdortgen istedigimizde 2 loop icin de bagimsiz end point belirleriz
                // 3 gen sekli vermek icin icin inner loop un end point ini  olarak outer degiskene baglamaliyiz
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
