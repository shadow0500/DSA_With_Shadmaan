public class DSA_Even_Ques1 {
    public static void main(String[] args) {
        // Q- find no. of no. that have even no.of digit
        int[] nums={12,345,2,6,7896};
        System.out.println(FindNumber(nums));
    }

    static int FindNumber(int[]nums) {
        int count = 0;
        for(int num:nums) {
            if(even(num)){
                count ++;

            }
        }
        return count;
    }

     static boolean even(int num) {
        int numberOfDigits=digits(num);
        if(numberOfDigits%2==0) {
            return true;
        }
        return false;
    }

     static int digits(int num) {
        if(num<0) {
            num=num*-1;
        }
        if(num==0) {
            return 1;
        }
        int count = 0;
        while(num>0) {
            count++;
            num=num/10;

        }
        return count;
    }
}
