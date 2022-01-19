import java.util.*;

//Given an array of size N, reverse the array using constant space (just not print,but change the array elements in memory)
//eg: A = 3,-2,1,4,3,6,8 
//ans= A = 8,6,3,4,1,-2,3

// swap elements where i=0-> i++(till i<j) and j=n->j--(till i<j)  (as to avoid repeating swaps like (1,2) and (2,1) or(1,1))-> optimal sol

//no. of iterations -> N/2 -> as i and j are approaching to eachother
//TC: O(N) SC: O(1)

public class ReverseAnArray {

    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        System.out.println("Before: "+A);
        int i=0,j=A.size()-1;

        while(i<j){
           Collections.swap(A, i, j);
            i++;
            j--;
        }

        System.out.println("After: "+A);
    }
}
