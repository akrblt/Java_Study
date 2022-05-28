package day20_scope_Arrays;

public class C01_InstanceVariables {
    int sayi;
    String baransIsmi="Java";
    boolean okulAcikMi;



    public static void main(String[] args) {
       // sayi=10;  sayi variable static olmadigi icn direk kullanilamaz
        // instance variable lara static methodlardan ulasabilmek icin obje olus gerekir

        C01_InstanceVariables obj1=new C01_InstanceVariables();// obj1 i bu satirda olusturduk.
        System.out.println(obj1.sayi);// java default deger olarak 0 atar.
        obj1.sayi=10;// eger sayi ya deger atamak istersek obj1. yazip sayiyi cagiririz
        System.out.println(obj1.sayi);// 10
        obj1.baransIsmi="SQL";
        System.out.println(obj1.okulAcikMi);// false  Buradaki yazdigim degerleri obj1 icerisinde assisgment yapabilir


        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi);// obj2 nin olusturulmasiyla Class Level deki sayinin degerini getirir. yani 0.
        System.out.println(obj2.baransIsmi);// Java


        obj1.okulAcikMi=true; // obj1 de atama yaptik

        System.out.println(obj2.okulAcikMi);// false obj2 deki veriyi soruyoruz


    }
}
