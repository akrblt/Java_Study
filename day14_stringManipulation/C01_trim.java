package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        //trim() metodu string in basindaki ve sonundaki gereksiz bosluklari silmemize yarar.

        String str="  Java ogren yasa hayatini  ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());


    }
}
