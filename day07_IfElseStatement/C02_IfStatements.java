package day07_IfElseStatement;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if (a<b && b<100) {
            System.out.println("Isteginiz gerceklesecek");
            System.out.println("Body icindeki tum kodlar calisir");


        }
        // if de sadece boolean kabul eder
        if (a>0) System.out.println("Suslu parantez olmazsa bir satir calisir");
        // bu if suslu parantez kullanilmadigi icin ilk noktali virgule kadar calisir
        // if in anlasilir olmasini istiyorsaniz suslu parantez icine yazin
        // body {} icine yazmasak da calisir ancak ilk ; de bitmis olur


          //20. satirdaki kod 13. satirdaki if e bagli degildir
        System.out.println("2.satirda calisti");

        }

    }

