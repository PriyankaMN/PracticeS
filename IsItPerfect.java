//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
import java.util.*;
public class IsItPerfect {

    static void isitperfect(int[] n){
       int sum=0;
        for(int i = 0; i <= n.length-1 ; i++){
            sum = 0;
            //System.out.println("i "+ i);
            for(int j = 1; j < n[i] ; j++ ){
               // System.out.println("j " +j);
                if( n[i]% j ==0){
                    sum+=j;
                }
                //System.out.println("sum "+ sum);
            }
            if(sum == n[i]){
                 System.out.println( "YES");
              
                }
            else{
                    System.out.println( "NO");
                    
                }
            }
        }
    public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    int[] n= new int[a];
    for(int i=0; i<a; i++){
        n[i] =sc.nextInt();
    }
      isitperfect(n);
    }

    /*Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while(N-- > 0)
        {
            int A = sc.nextInt();
            
            long sum = 0;
            for (int i = 1; i < A;i++){
                if(A % i == 0){
                    sum += i;
                }
            }
            if(sum == A){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } */
}
