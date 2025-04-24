package Assignment_2;
import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int EID;
    double salary;
    Employee(String name,int age,int EID,double salary){
        super(name,age);
        this.EID=EID;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nEmployee ID: "+EID+"\nSalary: "+salary);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String Name=Sc.nextLine();
        System.out.println("Enter age: ");
        int Age=Sc.nextInt();
        System.out.println("Enter Employee ID: ");
        int EmpID=Sc.nextInt();
        System.out.println("Enter Salary: ");
        double Sal=Sc.nextDouble();
        Employee E1=new Employee(Name, Age, EmpID, Sal);
        E1.display();
        Sc.close();
    }
}
