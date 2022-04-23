package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";
        // Biz String methodlarini arka arkaya kullanabiliriz
        // mesela 2. kelimenin ilk harfini kucuk olarak yazdiralim
        System.out.println("2. kelimenin ilk harfinin kucuk hali: "+str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        // yerel dillerde bazi kelimelerin anlami degisecegi icin bu method kullanilir
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));


    }
}
