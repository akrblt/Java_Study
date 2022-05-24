package day18_NestedFoorLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // kullanicidan 10 dan kucuk bir sayi isteyin faktoriyelini bulun

        int input = 5;
        int faktoryel = 1;
        String faktoryelAcikYazim = "";
        for (int i = input; i >= 1; i--) {
            faktoryel *= i;
            if (i == input) {
                faktoryelAcikYazim = faktoryelAcikYazim + i;

            } else {
                faktoryelAcikYazim = faktoryelAcikYazim + "*" + i;
            }

        } System.out.println(input + "!=" + faktoryelAcikYazim + "=" + faktoryel);
    }
}
