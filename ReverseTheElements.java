
import java.util.*;

//Given an array of size N, and two indexes s and e. Reverse the elements of the array from s to e. (just not print,but change the array elements in memory)
//eg: A = 3,-2,1,4,3,6,8 , s=3 ,e=5
//ans= A = 3,-2,1,6,3,4,8

// swap elements where i=s-> i++(till i<j) and j=e->j--(till i<j)  (as to avoid repeating swaps like (1,2) and (2,1) or(1,1))-> optimal sol

//no. of iterations -> [e-s+1]/2 ->N/2 -> as i and j are approaching to eachother
//TC: O(N) SC: O(1)

public class ReverseTheElements {

    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        int s=2,e=4;
        System.out.println("Before: "+A);
        int i=s,j=e;

        while(i<j){
           Collections.swap(A, i, j);
            i++;
            j--;
        }

        System.out.println("After: "+A);
    }
}

