import java.util.*;
/*for(int i = 1; i < 10000; i++){
        if(i*i==A){
            return i;
        }
    }
    return -1; */
public class SquareRootOfaNumber {
    public static void main(String[] args) {
        
    int n;
    double r;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    r =  Math.sqrt(n);
    if((r-Math.floor(r) == 0)){
        System.out.println((int)r);
    }
    else{
        System.out.println(-1);
    }
}
}
