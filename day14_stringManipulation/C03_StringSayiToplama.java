package day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";
        double str3=Double.valueOf(str1.replaceAll("\\D",""));
        double str4=Double.valueOf(str2.replaceAll("\\D",""));
        double ort=(str3+str4)/100;
        System.out.println("ort = " +"$"+ ort);

    }
}
