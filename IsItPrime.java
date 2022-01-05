import java.util.*;
/*int i,flag=0;
        Scanner sc = new Scanner(System.in);
        long  n=sc.nextInt();
        if(n==0||n==1){  
        System.out.println("NO");      
        }else{  
        for(i=2;i*i<=n;i++){      
        if(n%i==0){      
        System.out.println("NO");      
        flag=1;      
        break;      
        }      
    }      
    if(flag==0)  
    { System.out.println("YES"); } 
} */

/*Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
    
        boolean flag = true;
        for(int i = 2; i < A; i++){
            if(A % i == 0){
                flag = false;
                break;
            }
        }
            
            
        if(flag == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
    */

public class IsItPrime {

    String isitprime(long n){
        if(n == 0 || n==1){
            return "NO";
        }
        for(int i=2; i*i<= n ;i=+2){
            if(n%i == 0){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
    long n;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    IsItPrime isitprime = new IsItPrime();
    System.out.println(isitprime.isitprime(n));
    }
    
}
