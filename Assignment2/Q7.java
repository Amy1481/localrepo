package Assignment_1;
import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the no of elements ");
    int n=Sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter the elements ");
    for(int i=0;i<n;i++){
        ar[i]=Sc.nextInt();
    }
    System.out.println("Array elements are ");
    for(int i=0;i<n;i++){
        System.out.println(ar[i]+" ");
    }
    System.out.println();
    maxx(a);minn(a);
}
public static void maxx(int[]ar){
    int max=a[0],mx=0,pos=0;
    for(int i=0;i<ar.length;i++){
        if(a[i]>max){
            max=a[i];
            mx=0;
        }
        if(a[i]==max){
            mx++;pos=i;
        }
    }
    System.out.println("Max elements "+max);
    System.out.println("Occurs "+mx);
    System.out.println("Last occurance of "+max+"="+pos);
}
public static void minn(int[]ar){
    int min=a[0],mn=0,pos=0;
    for(int i=0;i<ar.length;i++){
        if(a[i]>min){
            min=a[i];
            mn=0;
        }
        if(a[i]==min){
            mn++;pos=i;
        }
    }
    System.out.println("Max elements "+min);
    System.out.println("Occurs "+mn);
    System.out.println("Last occurance of "+min+"="+pos);
}
}