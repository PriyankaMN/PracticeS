import java.util.*;

/*
Given an array A of N integers, find all leaders.

Leader: a leader strictly greater than all ele to it's right
TC :O(N) SC:O(N)
 */
public class LeadersInarray {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(7);A.add(5);
        
        int max = A.get(A.size()-1),c=1;
        for(int i=A.size()-1; i>=0; i--){
            if(A.get(i)>max){
                max=A.get(i);
                c++;
            }
        }
        System.out.println(c);
    }
}
