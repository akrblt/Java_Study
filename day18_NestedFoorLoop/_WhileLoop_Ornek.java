package day18_NestedFoorLoop;

public class _WhileLoop_Ornek {
    public static void main(String[] args) {

        //Kullanicidan 2 tam sayi alip
        // Bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun

        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        //Ayni soruyu WhileLoop ile yapalim
        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
