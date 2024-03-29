import java.util.*;

/*  Input:
    First argument is an integer array A.
    Second argument is an integer B.

    Output:
    Return an integer denoting the maximum possible sum of elements you picked.

    A = [5, -2, 3 , 1, 2]
    B = 3
 */

//no. of iterations -> N+Q -> N for PS array and Q for operation
//TC: O(N) SC: O(N)

public class Pickfrombothsides {
     public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        int B=3;
        int maxSum=0, curSum=0, n =list.size(), i=B, j=n-1;;
        
        //take array sum
        for(int k=0;k<B;k++){
            curSum+=list.get(k);
        }
        maxSum = curSum;

         while(B > 0){
            curSum -= list.get(--i);
            curSum += list.get(j--);

            maxSum = Math.max(curSum, maxSum);
            B--;
        }

         System.out.println(maxSum);
     }

//             int maxSum=0, curSum=0, n =list.size();
//         int i=0, j= n-1;
//         int B2=B;
//         //take array sum
//         while(B-- >0){
//             curSum+=list.get(i);
//             i++;
//         }

//         maxSum = curSum;
// System.out.println(i);
        

//         while(B2 > 0){
//             curSum -= list.get(--i);
//             curSum += list.get(j--);

//             maxSum = Math.max(curSum, maxSum);
//             B2--;
//         }

//          System.out.println (maxSum);
//     }
    
}
