package day29_staticKeyword;

public class C01_Static {

    String okulIsmi= "Yildiz Koleji";
    static String okulTelefonu="4112460";
    public static void staticMethod(){
        System.out.println("Statik method calsiti");
    }

    public  void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
    }

    /*

    public static void main(String[] args) { // yine yukaridaki ayni telefon numarasini yazdirir
        System.out.println(okulTelefonu);
    }

     */


}
