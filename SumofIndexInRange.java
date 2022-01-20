import java.util.*;

//Given an array of size N, and Q queries (s and e), return sum of odd indexed elements from index s to e and Sum of even indexed elements from index s to e
//eg: A = 3,-2,1,4,3,6,8 ;  s=1,e=3
//ans= 3

//Formula : [s e] = PS[e] - PS[s-1] -> eg: sum of 2nd to 5th overs: R[5] - R[1]
// If range sum is given, we sd find the prefixSum array 1st -> O(N) then use formulas accordingly to find the O/P.

//no. of iterations -> N+Q -> N for PS array and Q for operation
//TC: O(N+Q) SC: O(N)

public class SumofIndexInRange {
    public static void main(String[] args) {
        
        List<Integer> A=new ArrayList<>();
        List<Integer> PSE=new ArrayList<>(); 
        List<Integer> PSO=new ArrayList<>(); 
        // A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(6);A.add(8);
        A.add(4);A.add(1);A.add(0);A.add(-2);A.add(3);A.add(2);A.add(5);
        int n=A.size(),s=1,e=5,sumo=0,sume=0;
        System.out.println(A);
        PSE.add(A.get(0));
        PSO.add(0);
        //create a PS array  from A :
       for(int i=1;i<A.size();i++){ //O(N)
        if(i%2 == 0){
            PSE.add(PSE.get(i-1)+A.get(i));
        }
        else{
            PSE.add(PSE.get(i-1));
        }
        if(i%2 != 0){
            PSO.add(PSO.get(i-1)+A.get(i));
        }
        else{
            PSO.add(PSO.get(i-1));
        }
        }

        //now by usinf Formula, we can solve any question for odd or even indexed element

        System.out.println("PSE "+PSE+" PSO "+PSO);














        //Add 0th element to PS(prefix array) to not get into the condition of i-1 when i=0
//         PS.add(A.get(0));
//         while(s<=e){
//             if(s%2 == 0){sume+=A.get(s);
//             s++;}
//             else{sumo+=A.get(s);
//             s++;}
//         }
// System.out.println("e "+sume+" o "+sumo);
    }
}
