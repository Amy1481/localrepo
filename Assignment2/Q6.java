package Assignment_1;
import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the no ");
    int n=Sc.nextInt();
    System.out.println(n+"is Odd?"+isOdd(n));
    Sc.close();
}
public static boolean isOdd(int n){
    return(n & 1)==1;
}
}
