package Assignment_1;
public class Q4 {
public static void main(String[] args) {
    char ar[]={'C','A','R','B','O','N'};
    for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar.length;j++){
            for(int k=0;k<ar.length;k++){
                for(int l=0;l<ar.length;l++){
                    for(int m=0;m<ar.length;m++){
                        for(int n=0;n<ar.length;n++){
                            if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n){
                                System.out.println(" "+ar[i]+ar[j]+ar[k]+ar[l]+ar[m]+ar[n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
}
