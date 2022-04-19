package day10_switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {

        String str="Ali";
        // A yi yazdiralim
        System.out.println(str.charAt(0));
        // i yi yazdiralim
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(0)+str.charAt(1));//173 yazdirir cunku charat matematiksel isleme sokulunca ascii degeri devreye girer

        //ALI yazdiralim
        System.out.println(str.charAt(0)+""+str.toUpperCase().charAt(1)+str.toUpperCase().charAt(2));


        //Son harfi yazdirin
        System.out.println(str.charAt(str.length()-1));


    }
}
