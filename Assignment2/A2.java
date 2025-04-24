package Alpha;
import java.util.*;
public class A2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String str="CAR";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                for(int k=0;k<str.length();k++){
                    if(i!=j && i!=k && j!=k){
                        System.out.println(" "+str.charAt(i)+str.charAt(j)+str.charAt(k));
                    }
                }
            }
        }
        Sc.close();
    }
}
