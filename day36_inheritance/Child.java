package day36_inheritance;

public class Child extends Parent{

    Child(int i){

    }

    Child(){
        super();
        System.out.println("Child calisti");
    }

    // Tum classlarda biz gormesek bile
    // Jana`nin olusturdugu default constructor vardir

    //Extends keywords
    // Tum constructirlarin ilk satirinda biz gormesek bile super()
    // constructor call vardir.
    // yani parent class`in parametresiz constructor call

    public static void main(String[] args) {
        Child child=new Child();
    }
}
