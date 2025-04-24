package Assignment_1;
import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the size of array= ");
    int row=Sc.nextInt();
    int col=Sc.nextInt();
    int ar[][]=new int[row][col];
    System.out.println("Enter the elements= ");
    int sum=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            ar[i][j]=Sc.nextInt();
            sum+=ar[i][j];
        }
    }
    System.out.println("The matrix= ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(ar[row][col]+" ");
        }
        System.out.println();   
    }
    System.out.println("The sum of the sum= "+sum);             
    Sc.close();
}
}
