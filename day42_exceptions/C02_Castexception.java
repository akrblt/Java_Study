package day42_exceptions;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=10;
        //String str=sayi;  CTE

        Object sayi2=20;
        Object str3="Java cok guzel";
        String str2=(String) sayi2;// Explicit Narrowing
                                  //
        // ClassCastException

        System.out.println(str3);// Bu sorunsuz calisir.cunku Oblect tum classlarin anasi icinde String de olabilir






    }
}
