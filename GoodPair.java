import java.util.*;
import java.util.Scanner;
/*
Input:
First argument is an integer array A.
Second argument is an integer B.

Output:
Return 1 if good pair exist otherwise return 0.
*/

public class GoodPair {

        public static int solve(ArrayList<Integer> A, int B) {
        int n= A.size();
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n ;j++) //only upper triangle pairs
            {
                if(A.get(i)+A.get(j) == B)
                    return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        ArrayList<Integer> list = new ArrayList<>();
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        b=sc.nextInt();
        solve(list , b);
    }
}
