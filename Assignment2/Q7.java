package Assignment_2;
interface Detailinfo{
    void display();
    void count();
}
class Person implements Detailinfo{
    String name;
    static int maxCount;
    Person(String name){
        this.name=name;
    }
    void Count(){
        maxCount=this.name.length();
    }
    void Display(){
        System.out.println("Name- "+name+"\nNo of characters present in the name- "+maxCount);
    }
}
public class Q7 {
public static void main(String[] args) {
    Person P1=new Person("Subrajit");
    P1.Count();
    P1.Display();
}
}
