package day30_passByValue;

public class C01_StaticBlocks {

    static {
        System.out.println("Static blok calisti"); // static blok her seyden once calisir. Class calismaya baslamadan
                                                   // once atamalari yapar
    }                                              // yazildigi yerin hicbir onemi yoktur , class icerisinde istenen yerde yazilabilir
                                                    // Birden fazla static blok olursa yukaridan asagiya dogru calisir

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }
    static {
        System.out.println("Static blok2 calisti.");
    }

    public static void main(String[] args) {

        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();



    }
}
