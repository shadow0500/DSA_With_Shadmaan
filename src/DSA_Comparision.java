public class DSA_Comparision {
    public static void main(String[] args) {
        String a = "Shadmaan";
        String b = "Shadmaan";
        //== method is a comparator , a-> "Shadmaan" b-> "Shadmaan"
        System.out.println(a==b);

        String name1 = new String("Shadmaan");
        String name2 = new String("Shadmaan");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));// its a method so it doesn't care,it only check the value whether it is same or not.
        System.out.println(name1.charAt(1));
    }
}
