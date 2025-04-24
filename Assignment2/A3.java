package Alpha;
import java.util.*;
public class A3 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the size of the array= ");
    int row=Sc.nextInt();
    int col=Sc.nextInt();
    double ar[][]=new double[row+1][col+1];
    System.out.println("enter the elements ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            ar[i][j]=Sc.nextDouble();
        }
    }
    double sum=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(ar[i][j]+" ");
            sum+=ar[i][j];
        }
        System.out.println();
    }
    System.out.println("Sum= "+sum);
    System.out.println("Average= "+(sum/(row*col)));
    Sc.close();
}
}
