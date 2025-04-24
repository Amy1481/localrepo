package Assignment_1;
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a no= ");
    int x=Sc.nextInt();
    System.out.println("Sum of digits of "+x+"until the no is a single digit is= "+Sum_Of_Digit(x));
    Sc.close();
}
public static int Sum_Of_Digit(int n){
    int sum=0;
    while(n>0){
        int r=n%10;
        n=n/10;
        sum=sum+r;
    }
    if(sum>=10){
        return Sum_Of_Digit(sum);
    }
    else {
        return sum;
    }
}
}
