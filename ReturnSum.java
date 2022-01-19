import java.util.*;

//Given an array of size N, return elements from index s to e
//eg: A = 3,-2,1,4,3,6,8 ;  s=1,e=3
//ans= 3

//Formula : [s e] = PS[e] - PS[s-1] -> eg: sum of 2nd to 5th overs: R[5] - R[1]
// If range sum is given, we sd find the prefixSum array 1st -> O(N) then use formulas accordingly to find the O/P.

//no. of iterations -> N+Q -> N for PS array and Q for operation
//TC: O(N+Q) SC: O(N)

public class ReturnSum {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        List<Integer> PS=new ArrayList<>();
        A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(6);A.add(8);
        int s=1,e=3;

        System.out.println(A);

        PS.add(A.get(0));

       for(int i=1;i<A.size();i++){
            PS.add(PS.get(i-1)+A.get(i));
        }

        if(s==0){System.out.println(PS.get(e));}
        else{
        System.out.println(PS.get(e)-PS.get(s-1));}
    
    }
}
