import java.util.*;

//Given an array of size N, rotate the array in clockwise by k times (just not print,but change the array elements in memory)
//eg: A = 3,-2,1,4,3,6,8 , k=3
//ans= A = 8,6,3,3,-2,1,3

// reverse complete array and then swap accordingly  (as to avoid repeating swaps like (1,2) and (2,1) or(1,1))-> optimal sol

//no. of iterations -> N/2 + k/2 + (n-k)/2 -> as i and j are approaching to eachother
//TC: O(N) SC: O(1)
public class RotatetheArray {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        int k=1;
        System.out.println("Before: "+A);
       
        int n=A.size();
        k=k%n;// to avoid repetation and going out of bound

        //reverse the complete array
        //Collections.reverse(A);  //O(n/2)
        
        //reverse complete array
        int i=0,j=n-1; //O(n/2)
        while(i<j){
           Collections.swap(A, i, j);
            i++;
            j--;
        }

        //reverse 1st k elements
        i=0;j=k-1; //O(n/2)
        while(i<j){
           Collections.swap(A, i, j);
            i++;
            j--;
        }

        //Reverse the remaining n-k elements
        i=k;  //O(n/2)
        j=n-1;
        while(i<j){
           Collections.swap(A, i, j);
            i++;
            j--;
        }


        System.out.println("After: "+A);
    }
}
