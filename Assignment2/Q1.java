package Assignment_1;
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the no greater than 2= ");
    int n=Sc.nextInt();
    int c=0;
    while(n>=2){
        n=n/2;
        c++;
    }
    System.out.println("Repeating time= "+c);
    Sc.close();
}
}
