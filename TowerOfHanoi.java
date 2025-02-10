public class TowerOfHanoi {
    public static void main(String[] args) {
        //you are given a three rods and  n disc statcked on one rod in a incresaing order of size from top to des
        //ONLY ONE DISC CAN BE MOVED AT A TIME
        //a larger disc cannot be placed on a smaller disc;
        //you can use three rods./...
        //T(1)=1
        //TC=O(2^n)
        //SC=O(n);
        //algorithm
        //move  n-1 disks from source to des
        //move the nyj disk direactly source to des
        //mobve n-1 from axiluaru to des

        int n=3;
        tower(n, 'A', 'B', 'C');
    }
    public static void tower(int n,char src,char aux,char des){
        if(n==1){
            System.out.println("Move disk 1 from "+src+" to "+des);
            return ;
        }
        tower(n-1, src, des,aux);
        System.out.println("Move disk "+n+" 1 from "+src+" to "+des);
        tower(n-1,aux, src, des);
    }
}
