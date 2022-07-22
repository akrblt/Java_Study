package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{


    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi);

    //    C01_Final.okulIsmi="Java Koleji";

    }

    public final static void method1(){
        System.out.println("Parent class final method1");
    }
}
