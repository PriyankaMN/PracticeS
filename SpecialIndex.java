import java.util.*;

//Given an array of size N, count the no. of special index in the array.
//special Index  is an index after removing which, sum of all odd induviduals elements == sum of all even induvidual elements
//eg: A = 4,3,2,7,6,-2;  
//if we remove 4, then here the index changes. now the sum of odd indexed element == the sum of even indexed element.
//ans= 3

//Formula : [s e] = PS[e] - PS[s-1] -> eg: sum of 2nd to 5th overs: R[5] - R[1]
// If range sum is given, we sd find the prefixSum array 1st -> O(N) then use formulas accordingly to find the O/P.

//no. of iterations -> N+Q -> N for PS array and Q for operation
//TC: O(N) SC: O(N)

public class SpecialIndex {
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

        int ans=0;
        //now by usinf Formula, we can solve any question for odd or even indexed element
        for(int i=0;i<n;i++){

            if(i==0){            
            //sum of even indexed ele after removal of index i
            sume = PSE.get(i) + (PSO.get(n-1) - PSO.get(i));
            //sum of odd indexed ele after removal of index i
            sumo = PSE.get(i) + (PSE.get(n-1) - PSE.get(i));
            if(sume == sumo){ans++;}}

            else{
            //sum of even indexed ele after removal of index i
            sume = PSE.get(i-1) + (PSO.get(n-1) - PSO.get(i));
            //sum of odd indexed ele after removal of index i
            sumo = PSE.get(i-1) + (PSE.get(n-1) - PSE.get(i));
            if(sume == sumo){ans++;}}

        }

        System.out.println("PSE "+PSE+" PSO "+PSO);
        System.out.println(ans);

    }
}
