import java.util.*;

public class largestOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        else if(b>a)
            System.out.println(b+" is greaer than "+a);
        else
            System.out.println("both are equal");
        sc.close();
    }
}
