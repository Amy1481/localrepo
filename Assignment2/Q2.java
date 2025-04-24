package Assignment_1;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Weight in kg= ");
    double wt=Sc.nextDouble();
    System.out.println("Height in m= ");
    double ht=Sc.nextDouble();
    double bmi=((double)wt/Math.pow(ht,2));
    System.out.println("BMI= "+bmi);
    System.out.println("Category= ");
    if(bmi<18.5){
        System.out.println("Underweight");
    }
    else if(bmi<=24.9){
        System.out.println("Normal weight");
    }
    else if(bmi<=29){
        System.out.println("Overweight");
    }
    else{
        System.out.println("Obese");
    }
    Sc.close();
}
}
