package day40_overriding_pollymorphyism;

public class C02 extends C01 {

    private void method4(){
        System.out.println("Child method4");
        // Parent class`daki private method4`e
        // Child class`dan ulasmak mumkun olmadigindan
        // Java bu iki method`u
        // TAMAMEN FARKLI IKI METHOD olarak kabul eder.
        // @OverRide kullanmak istersek Java kabul etmez CTE verir
    }

    @Override
    protected String method3(){
        //Covariant icin yazildi
        return "Java";
    }

    @Override
    public void method2() {
        System.out.println("Child method2");
        /*
         @Override notasyonu overriden method ile overridding metodu birbirine baglar.
         Dolayisiyla farkinda olunmadan overridden method silinirse veya signature dgistirilirse
         bu iliski bozulacagi icin Java CTE verir.

         Notasyon kullanilmazsa Java bunlarin iliskini bilir ama
         overridden method silinirse sesini cikartmaz.
         */

    }

    public static void main(String[] args) {

        C02 obj=new C02();

        obj.method1();// parent tan method1 calisir  Parent method1 calisti
        obj.method2();//Child method2


        C01 obj2=new C02();
        obj2.method1();//Parent method1 calisti
        obj2.method2();//Child method2

        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method2

    }

}
