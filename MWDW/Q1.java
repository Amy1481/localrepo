package Assignment_3;
import java.util.Scanner;
class myException extends Exception{
    myException(String s){
        super(s);
    }
}
public class Q1 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter lucky no= ");
    Sc.close();
    try {
        int num=Sc.nextInt();
        if(num<0){
            throw new myException("Negative no are not allowed");
        }
        System.out.println("the lucky no= "+num);
    }
    catch (myException e) {
        System.out.println("Error"+e);
    }
}
}
