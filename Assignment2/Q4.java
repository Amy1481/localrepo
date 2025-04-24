package Assignment_2;
class Deposit{
    long principal;
    int time;
    double rate,totPrice;
    Deposit(){
        this.principal=0;
        this.time=0;
        this.rate=0.0;
        this.totPrice=0.0;
    }
    Deposit(long principal,int time,double rate){
        this.principal=principal;
        this.time=time;
        this.rate=rate;
        calcPrice();
    }
    Deposit(long principal,int time){
        this.principal=principal;
        this.time=time;
        this.rate=7.1;
        calcPrice();
    }
    Deposit(long principal,double rate){
        this.principal=principal;
        this.time=2;
        this.rate=rate;
        calcPrice();
    }
    void display(){
        System.out.println("Principal: "+principal+"\nTime: "+time+"\nRate: "+rate+"\nTotal Pp: "+totPrice);
    }
    void calcPrice(){
        this.totPrice=principal+(principal*time*rate)/100;
    }
}
public class Q4 {
    public static void main(String[] args) {
     Deposit D1=new Deposit(10000,5,7.1); 
     Deposit D2=new Deposit(20000,2);
     Deposit D3=new Deposit(5000,5.3);
     System.out.println("Deposit 1: ");
     D1.display();
     System.out.println("\nDeposit 2: ");
     D2.display();
     System.out.println("\nDeposit 3: ");
     D3.display();
    }
}
