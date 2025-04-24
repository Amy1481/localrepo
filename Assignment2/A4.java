package Alpha;

public class A4 {
     public static void main(String[] args) {
     String[] Colors = new String[3];
    
     try {
    
    Colors[0] = "blue";
                Colors[1] = "green";
                Colors[3] = "red";
            } 
    catch(ArrayIndexOutOfBoundsException e) {
     System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Array index is out of bounds. Please check the array size.");
            }
     catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("An unexpected error occurred.");
            }
 }
}
