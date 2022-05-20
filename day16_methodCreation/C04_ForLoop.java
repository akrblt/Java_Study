package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        // verilen string i tersten yazdiran bir code yazin

        String kelime="Bunlar burada  java cok zevkli";


        for (int i = kelime.length()-1; i >=0 ; i--) {


            System.out.print(kelime.charAt(i));

        }
    }
}
