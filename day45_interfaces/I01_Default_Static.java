package day45_interfaces;

public interface I01_Default_Static {

    /*
    Interface`lerde sadece abstract method`lar bulunur.
    body`si olan concrete bir method olusturmak istedigimizde
    Java CTE verir

     Ancak Java8 ve uzeri versiyonlarda , istisnai olarak
     static veya default olarak tanimlanan methodlarin
     body`si olabilir

     */

    void method1();

    public default void method2(){
        System.out.println("Interface`deki default method");
    }
    static void method3(){
        System.out.println("Interface`deki Static method");
    }
}
