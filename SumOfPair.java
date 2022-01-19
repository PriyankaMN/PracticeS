import java.util.*;

//Given an array of size N, and a number K, return true if there exsists a pair a[i],a[j] : a[i]+a[j] == k and i!=j
//eg: A = 3,-2,1,4,3,6,8 ; K=10 -->ans=true
//eg: A = 3,-2,1,4,3,6,8 ; K=5 -->ans=false

// to iterate only required pairs-> optimal sol 

//no. of iterations ->N^2
//TC: O(N^2) SC: O(1)
public class SumOfPair {
    public static void main(String[] args) {

        List<Integer> A=new ArrayList<>();
        A.add(1);A.add(2);A.add(5);A.add(5);A.add(2);
        int K=10,c=0;


        for(int i=0;i<A.size();i++){
            //check j from i+1 because we choose only upper triangle and check to avoid repeated pairs to check. like (1,2) and (2,1) 
            //and eleminate diagonals to check.

            for(int j=i+1; j<A.size(); j++){ //(N+1)
                if(A.get(i)+A.get(j) == K){//(N(N))
                    System.out.println("true");
                    c++;
                    break;
                }
            }
        }
        if(c==0){
        System.out.println("false");}
    }
}
