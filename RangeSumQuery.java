import java.util.*;

public class RangeSumQuery {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> PS = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        // A.add(5);A.add(17);A.add(100);A.add(11);
        // B.add(1);
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        B.add(new ArrayList<Integer>());
        B.get(0).add(2);
        B.get(0).add(3);

        B.add(new ArrayList<Integer>());
        B.get(1).add(1);
        B.get(1).add(4);

        System.out.println("A "+A);
        System.out.println("B "+B);
        int n=A.size();
        // int rightsum = 0; // initialize sum of whole array
        // int leftsum = 0; // initialize leftsum

        PS.add(A.get(0));

       for(int i=1;i<A.size();i++){
            PS.add(PS.get(i-1)+A.get(i));
        }
        System.out.println("PS "+PS);

        int s=A.indexOf(B.get(0).get(0)),e=A.indexOf(B.get(0).get(1));
        C.add(PS.get(e) - PS.get(s-1));

        s=A.indexOf(B.get(1).get(0));e=A.indexOf(B.get(1).get(1));
        System.out.println("s "+s+" e "+e);
        if(s!=0){
        C.add(PS.get(e) - PS.get(s-1));}
        else{C.add(PS.get(e));}

        System.out.println(C);
    }
}


/*public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        
        long[] PS = new long[A.size()];

        ArrayList<Long> C = new ArrayList<>();

        PS[0] = A.get(0);

        for(int i=1;i<A.size();i++){
            PS[i] = (PS[i-1] + A.get(i));
        }

        for(ArrayList<Integer> i: B){
            int l =i.get(0) -1;
            int r = i.get(1) -1;
            if(l == 0){
                C.add(PS[r]);
            }
            else{
                C.add(PS[r] - PS[l-1]);
            }
        }
return C;

    }
} */