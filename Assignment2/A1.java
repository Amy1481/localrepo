package Alpha;
import java.util.*;
public class A1 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the size of the array= ");
    int row=Sc.nextInt();
    int col=Sc.nextInt();
    int ar[][]=new int[row+1][col+1];
    System.out.println("enter the elements ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            ar[i][j]=Sc.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        int sum=0;
        for(int j=0;j<col;j++){
            sum+=ar[i][j];
        }
        ar[i][col]=sum;
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(ar[i][j]+" ");;
        }
        System.out.println();
    }
    Sc.close();
}
}
