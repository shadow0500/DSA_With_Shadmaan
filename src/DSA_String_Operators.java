import java.util.ArrayList;

public class DSA_String_Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // integer will be converted into integer that will call toString()
        // this will same as after a few steps: "a"+1
        System.out.println("Shadmaan"+new ArrayList<>());
        System.out.println("Shadmaan"+new Integer(56));
        String ans= new Integer(56)+" "+new ArrayList<>();
        System.out.println(ans);
    }
}
