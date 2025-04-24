package Assignment_2;
import java.util.Scanner;
class Product{
  int prodID,p,q;
  static int TotalP;
  Product(int prodID,int p,int q){
  this.prodID=prodID;
  this.p=p;
  this.q=q;
  TotalP+=this.p;
  }
void display(){
    System.out.println(prodID+"\t        "+p+"\t      "+q);
 }
}
public class Q3 {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the Quantity: ");
    int n=Sc.nextInt();
    Product P[]=new Product[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter Product ID,Price,Quantity: ");
        int prodID=Sc.nextInt();
        int p=Sc.nextInt();
        int q=Sc.nextInt();
        P[i]=new Product(prodID, p, q);
    }
   System.out.println("Product Id\tPrice\tQuantity: ");
   for(int i=0;i<n;i++){
    P[i].display();
   }
   System.out.println("Total Price: "+Product.TotalP);
   Sc.close();
 }
}
