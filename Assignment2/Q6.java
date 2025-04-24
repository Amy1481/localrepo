package Assignment_2;
abstract class Mark{
    int mDSA,mICP;
    double percent;
    Mark(int mDSA,int mICP){
        this.mDSA=mDSA;
        this.mICP=mICP;
    }
    abstract void percent();
}
class CSE extends Mark{
    int algodesign;
    CSE(int mDSA,int mICP,int algodesign){
        super(mDSA, mICP);
        this.algodesign=algodesign;
    }
    void getpercent(){
        percent=(mDSA+mICP+algodesign)/3.0;
        System.out.println("CSE student scores= "+percent);
    }
}
class NONCSE extends Mark{
    int Mechanics;
    NONCSE(int mDSA,int mICP,int Mechanics){
        super(mDSA, mICP);
        this.Mechanics=Mechanics;
    }
    void getpercent(){
        percent=(mDSA+mICP+Mechanics)/3.0;
        System.out.println("NON CSE student scores= "+percent);
    }
}
public class Q6 {
    public static void main(String[] args) {
        CSE C1=new CSE(45,67,78);C1.getpercent();
        NONCSE C2=new NONCSE(89,67,72 );C2.getpercent();
    }

}
