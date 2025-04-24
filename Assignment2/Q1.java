package Assignment_2;
import java.util.Scanner;
class Person{
    String name;
    int age;
    public void setdata(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name=Sc.nextLine();
        System.out.println("Enter age: ");
        this.age=Sc.nextInt();
        Sc.close();
    }
    void datadisplay(){
        System.out.println("Name= "+this.name+"\nAge= "+this.age);
    }
}
public class Q1 {
public static void main(String[] args) {
    Person P1=new Person();
    Person P2=new Person();
    P1.name="Rohan";P1.age=20;
    P2.setdata();
    System.out.println("Personal information- \nName:  \tAge:");
    P1.datadisplay();
    P2.datadisplay();
    if(P1.age<P2.age){
        System.out.println(P1.name+" is younger than"+P2.name);
    }
    else{
        System.out.println(P1.name+"is older");
    }
}
}
