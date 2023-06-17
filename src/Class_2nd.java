import java.util.Scanner;

public class Class_2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter website ");
//        int a = 40;
//        int b = 50;
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a+ " " +b);
//    }
//}
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organisational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } else {
            System.out.println("Please search for valid one");
        }
    }
}
