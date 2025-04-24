package Assignment_3;
class myException extends Exception{
    myException(String s){
        super(s);
    }
}
class Student{
    String name;int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
        try {
            if(mark>100){
                throw new myException("Marks should be within 100");
            }
        } catch (myException e) {
           System.out.println(e);
        }
    }
    void display(){
        System.out.println("Name= "+name+"\nmark= "+mark);
    }
}
public class Q3 {
public static void main(String[] args) {
    Student S1=new Student("Ankita",87);
    Student S2=new Student("Shubham",110);
    S1.display();S2.display();
}
}
