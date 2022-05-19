package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zevkli";

        // str in ilk 4 harfini almak istersek
        str.substring(0,4);

        // bir program yaparken kodlarimizin daha kisa ve anlasilir olmasi icin
        //surekli kullanabilecegimiz kod bloklarini bir yere koyar
        //ihtiyacimiz old oradan alip kullaniriz

        //methodlar robotlara benzer
        //method olusturmak bazen o metodun yapacagi isi yapmaktan zor olabilir
        //bir islemi sadece bir kere yapacaksak method olusturmamiza gerek olmayabilir
        //ancak cok kullanacagimiz islemler icin her seferinder kod yazmak yerine
        //bu islemi yapan bir metod olusturmak daha pratik olur


        //bazen bir Class in icerisinde cok uzun kodlar yazarsak
        //tum class in anlasilmasi zorlasabilir
        //bunun yerine kodun belli kisimlarini ayri metodlar olarak olusturup
        //main metod icerisinden istedigimiz sekilde bu metodlari yonetebiliriz


    }
}
