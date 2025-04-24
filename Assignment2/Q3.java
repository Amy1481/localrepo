package Assignment_1;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a no= ");
    int n=Sc.nextInt();
    int r=0,sum=0,prod=1;
    while(n>0){
        r=n%10;
        n=n/10;
        sum=sum+r;
        prod=prod*r;
    }
    if(sum==prod){
        System.out.println("spy");
    }
    else{
        System.out.println("Not");
    }
    Sc.close();
}
}
