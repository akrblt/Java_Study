package day30_passByValue;

public class C02_StaticBlocks {

    {
        System.out.println("Static olmayan blok calisti"); // static olmayan blok. bu direk calismaz methodla cagirmak gerekir
                                                           // bu blok her method calistirildiginda calisir
    }
    static {// static bloklar bir defa calisir en basta
        System.out.println("Static blok calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method basi");

        C02_StaticBlocks obj=new C02_StaticBlocks(); // static olmayan blok calisti
        C02_StaticBlocks obj2=new C02_StaticBlocks(); // static olmayan blok calisti

    }
}
