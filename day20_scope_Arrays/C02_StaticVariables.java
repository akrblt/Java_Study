package day20_scope_Arrays;

public class C02_StaticVariables {

   static String okulIsmi="Yildiz Koleji";
   static int okulNo;
   static boolean okulAcikMi;
    public static void main(String[] args) {

        // Main method static Class Level deki variable larda static old icin direk yazdirabiliriz

        // instance variable lar obje ye bagimlidir ve her obje farkli degerler alabilir
        // ogr notlari veya ogretmen maaslari gibi
        // bir objeye ait variable nin son degerini bulmak icin sadece o objeyi dikkate aliriz


        // Static variable lar ise class variable olarak tanimlanir
        // ve tum class uyeleri icin aynidir. Okul ismi , okul mud adi gibi
        // eger static variablenin

        System.out.println(okulIsmi);
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);// false

        staticMethod();// method u main method da cagiririz
        System.out.println(okulNo);//200



    }
    public  static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200 Bu kod calismaz. Methodun calismasi icin cagrilmasi gerekir
    }
}
