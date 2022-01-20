import java.util.*;
/*Input:
Given an integer array A of size N. In one second you can increase the value of one element by 1.

Output:
Find the minimum time in seconds to make all elements of the array equal.

A = [2, 4, 1, 3, 2]
[2+2, 4, 1+3, 3+1, 2+2]
ans: 8
*/
public class Timetoequality {
    
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
         A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(-2);A.add(1);

        int max = Collections.max(A),sum=0;
        for(int i=0;i<A.size();i++){
            sum+=(A.get(i) - max);
        }
        System.out.println( Math.abs(sum));
    }
}
