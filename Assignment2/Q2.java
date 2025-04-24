package Assignment_2;
import java.util.Scanner;
class Complex{
    int real;
    int imag;
    void setdata(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your values:");
        real=Sc.nextInt();
        imag=Sc.nextInt();
        Sc.close();
    }
    void display(){
        System.out.println(real+" + i"+imag);
    }
    public Complex add(Complex C1,Complex C2){
     Complex sum=new Complex();
     sum.real=C1.real+C2.real;
     sum.imag=C1.imag+C2.imag;
     return sum;
    }    
}