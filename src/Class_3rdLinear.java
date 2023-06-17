public class Class_3rdLinear {
    public static void main(String[] args) {
        // Q- Find minimum element in array
        int[] arr = {18,12,7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int ans = arr[0];
        for(int i =1;i< arr.length;i++) {
            if(arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
