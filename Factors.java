import java.util.*;

// number of factors that are available for no. n
//log n times
class Factor{

    int factor(int n){
        int count = 0;
        for(int i=1; i*i < n; i++){
            if ( n % i ==0){
                count+=1;
            }
            else{
                count+=2;
            }
        }
        return count;
}


    public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    Factor factor = new Factor();
    System.out.println(factor.factor(n));
}
}