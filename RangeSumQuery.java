import java.util.*;

public class RangeSumQuery {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
         List<Integer> PS = new ArrayList<>();
        // List<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>>();
        // A.add(5);A.add(17);A.add(100);A.add(11);
        // B.add(1);
        A.add(1);A.add(2);A.add(3);A.add(2);A.add(1);
        //B.add(2);B.add(3);
        int n=A.size();
        // int rightsum = 0; // initialize sum of whole array
        // int leftsum = 0; // initialize leftsum

        for(int i=0;i<n;i++){
            int rightsum = 0;
            int leftsum = 0;
            //find leftsum
            for(int j=0;j<i;j++){
                leftsum+=A.get(j);
            }
            //find right sum
            for(int j= i+1; j<n;j++){
                rightsum+=A.get(j);
            }
            if(leftsum == rightsum){
                System.out.println(A.get(i));
                break;
            }
        }
            System.out.println(0);
    }
}
