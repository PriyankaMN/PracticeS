import java.util.*;
/* Input: First argument is a constant array A.

Output: You have to return an integer array.

*/

/*Reverse the Array : in memory */
public class ReversetheArray {

        public static void solve(List<Integer> A) {
            int n=A.size();
            int i=0,j=n-1 ;// half of them to be swaped; that is why i<j
            while(i < j){
                Collections.swap(A, i, j);
                i++;
                j--;
            }
            System.out.println(A);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        List<Integer> list = new ArrayList<>();
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        solve(list);
    }


}

/* public ArrayList<Integer> solve(final List<Integer> A) {
            ArrayList<Integer> B = new ArrayList<>(A);
            int n=B.size();
            int i=0,j=n-1 ;// half of them to be swaped; that is why i<j uuper triangle.
            while(i < j){
                Collections.swap(B, i, j);
                i++;
                j--;
            }
            return B;

        // ArrayList<Integer> B = new ArrayList<>(A);   //pass List A as argument of constructor 
        // Collections.reverse(B);
        // return B;
    } */