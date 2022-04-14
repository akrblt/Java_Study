package day07_IfElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        // 65 ve uzerindeyse emekli degilse emekli olamazsin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if(yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }
        else
            System.out.println("emekli olamazsiniz");
        System.out.println(65-yas+" sene calismalisin");
        // if else statement da SADECE 1 i calisir.








    }
}
