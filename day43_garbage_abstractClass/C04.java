package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    Bir abstract class`da abstract veya concrete methodlar bulunabilir.
    Child classlarin abstract methodlari override etmesi MECBURI iken
                     concrete methodlarin override edilmesi OPSIYONEL`dir.
     */
    public abstract void absMethod();

    public void concreteMethod(){
        System.out.println("Co4 concrete method");


    }
    public static void concreteMethod1(){
        System.out.println("Co4 concrete method1");


    }

    public static void main(String[] args) {
        /*
        Abstract classlar constructor a sahiptir
        ancak Abstract claslardan OBJE OLUSTURULAMAZ
        Abstract classlar OBJE BARINDIRMAYAN
        sadece child classlar icin UYULMASI SART OLAN VEYA OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir.
         */
        //C04 obj=new C04();
        System.out.println("Bu class abstract");
        concreteMethod1();
    }

}
