import java.util.*;

//Given an array of size N, return true if there exsists an equilibrium index in an array
//equilibrium index: index for which sum of left side of array is equal to sum of right side of array.
//eg: A = 3,-2,1,4,3,6,8 
//ans= -1

//Formula : [s e] = PS[e] - PS[s-1] -> eg: sum of 2nd to 5th overs: R[5] - R[1]
// If range sum is given, we sd find the prefixSum array 1st -> O(N) then use formulas accordingly to find the O/P.

//no. of iterations -> N+Q -> N for PS array and Q for operation
//TC: O(N) SC: O(N)

public class EquilibriumIndex {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        List<Integer> PS=new ArrayList<>(); 
        // A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(6);A.add(8);
        A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(-2);A.add(1);
        int n=A.size(),f=0;

        //Add 0th element to PS(prefix array) to not get into the condition of i-1 when i=0
        PS.add(A.get(0));
        int rightsum = 0;
        int leftsum = 0;

        //create a PS array PS: [3, 1, 2, 6, 9, 7, 8] from A : [3, -2, 1, 4, 3, 6, 8]
       for(int i=1;i<A.size();i++){ //O(N)
            PS.add(PS.get(i-1)+A.get(i));
        }

        //find equilib index by the use of PS in O(N) operation 
        for(int i=1;i<A.size();i++){ //O(N)
            leftsum=0;rightsum=0; //so that for each iteration the values won't continue.

                //find left sum
                //s=0;e=i-1 Formula : [s e] = PS[e] - PS[s-1]
            leftsum+=PS.get(i-1);  //O(Q)

            //find right sum
            //s=i+1,e=n-1 Formula : [s e] = PS[e] - PS[s-1]
            rightsum+= (PS.get(n-1)-PS.get(i)); //O(Q)

            if(leftsum == rightsum){
            System.out.println(1);
            f=1;
            break;}
        }

        if(f==0){
        System.out.println(-1);}
    }
}

/*O(N^2) 

        // for(int i=0;i<n;i++){ //O(N)
        //     int rightsum = 0;
        //     int leftsum = 0;
        //     //find leftsum
        //     for(int j=0;j<i;j++){ //O(N^2)
        //         leftsum+=A.get(j);
        //     }
        //     //find right sum
        //     for(int j= i+1; j<n;j++){//O(N^2)
        //         rightsum+=A.get(j);
        //     }

        //     if(leftsum == rightsum){
        //         System.out.println(i);
        //         break;
        //     }
        // }
        // System.out.println(-1);*/


    /*
    int sum = 0; // initialize sum of whole array
    int leftsum = 0; // initialize leftsum
 
    /* 
    //Find sum of the whole array 
    for (int i = 0; i < n; ++i)
        sum += arr[i];
 
    for (int i = 0; i < n; ++i)
    {
        sum -= arr[i]; // sum is now right sum for index i
 
        if (leftsum == sum)
            return i;
 
        leftsum += arr[i];
    }
 
    /* If no equilibrium index found, then return -1 */
    //return -1;
//} */