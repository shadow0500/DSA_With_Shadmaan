public class DSA_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<25;i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
            System.out.println(builder);
        builder.delete(0,3);
        System.out.println(builder);
    }
}
