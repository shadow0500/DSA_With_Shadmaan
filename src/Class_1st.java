import java.util.Scanner;

public class Class_1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Temp");
//        int F = sc.nextInt();
//        int C = (F * 9/5)+32;
//        System.out.println(C);
//
//    }
//}
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the number");
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
