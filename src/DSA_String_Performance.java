public class DSA_String_Performance {
    public static void main(String[] args) {
        String series = " ";
        for(int i=0;i<25;i++){
            char ch  = (char) ('a'+i);
            series = series+ch;
            System.out.println(series);
            // all of these large strings will have no type variable since so wastage of space O(N2)
        }
    }
}
