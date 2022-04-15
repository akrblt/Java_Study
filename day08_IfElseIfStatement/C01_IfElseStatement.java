package day08_IfElseIfStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        // girilen karakterin, harf olup olmadigini bulalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);
        // ternary ile cozum
        System.out.println((karakter>='A'&& karakter<='Z')?("karakterdir"):("degildir"));
        // If Else ile cozum
        if(karakter<='A'&& karakter>='Z'){
            System.out.println(karakter+": Girilen deger karakterdir");

        }
        else
            System.out.println(karakter+": Girilen deger karakter degildir");

    }
}
