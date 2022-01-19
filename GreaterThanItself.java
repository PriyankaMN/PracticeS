import java.util.*;

//Given an array of size N, count the number of elements which have atleast one element greater then itself
//eg: -3,-2,6,8,4,8,5 --> c=5

//count of numbers that are not equal to max element -> optimal sol 

//no. of iterations ->2N
//TC: O(N) SC: O(1)
public class GreaterThanItself {
    public static void main(String[] args) {
        int count=0;
        List<Integer> A = new ArrayList<>();
        A.add(-3);A.add(-2);A.add(6);A.add(8);A.add(4);A.add(8);A.add(5);
        // A.add(1);A.add(1);A.add(2);

        //Find Max Number:
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){ //O(N)
            if(A.get(i)>max){
                max=A.get(i);
            }
        }

        //Find Count of Max Element
        for(int i=0;i<A.size();i++){ //O(N)
            if(A.get(i) == max){
                count++;
            }
        }

        System.out.println(A.size() - count);
    }
}
