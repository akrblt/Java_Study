package day39_overriding;

public class OverridingChild extends OverridingParent{

    public  void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir obje olusturulurken Data turu ve Constructor ayni class`dan secilmisse
        Java direk o class `a gider
        hem variable hem de method icin
        o class da varsa kullanilir, yoksa o class`in
        parent`larina bakar.
         */
        OverridingChild obj1=new OverridingChild();
        obj1.method1();// icinde bulundugumuz class ta oldugu icin buradan aldi.ilk once icindeki class a bakar
        obj1.method2();// Bu class ta olmadigi icin Parent class agider

        OverridingParent obj2=new OverridingChild();
        obj2.method2();// Parent class method2
        obj2.method1(); // Child class method1

        /*
        Eger Data turu Parent, Constructor Child Class`dan secildiyse
        variable`larda yukaridaki sekilde calisma devam edeer
        Ancak
        Method`lar icin Data turunun oldugu class`daki method
        Child class tarafindan Override edilmis mi diye kontrol etmeniz gerekir
        Eger child class`larda bu method override edilmisse
        override eden method calisir
         */

        OverridingParent obj3=new OverridingParent();
        obj3.method2();// Parent class method2
        obj3.method1(); // Parent class method1
    }
}
