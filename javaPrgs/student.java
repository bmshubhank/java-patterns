//package java-patterns.javaPrgs;
import java.util.*;
public class student {
    int roll;
    String name;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("ROll No:"+roll);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student s1=new student();
        student s2=new student();

        s1.name=sc.nextLine();
        s1.roll=sc.nextInt();
        sc.nextLine();

        s2.name=sc.nextLine();
        s2.roll=sc.nextInt();
        sc.nextLine();

        s1.display();
        s2.display();

        sc.close();
    }
}
