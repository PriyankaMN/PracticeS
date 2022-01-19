import java.util.*;
import java.util.stream.Collectors;

/*Input: 
The first argument of input contains an integer array, A.
The second argument of input contains an integer, B. 

A = [2, 4, 3, 1, 5]
 B = 3 

OUTPUT: 
Return an integer representing the answer.
 2
We need to remove 4 and 5 to make 3 the biggest element. 
*/

public class LittlePonnyandMaximumElement {

     public static void solve(List<Integer> A, int b) {
            int n=A.size(),max =b,c=0;
            //check if the element is present in array
            if(A.contains(b)){
                for(int i=0;i<n;i++){
                    if(A.get(i) >max){
                        c=c+1;
                    }
                }
                  System.out.println(c);  
                }
                else{
        System.out.println(-1);}
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        List<Integer> list = new ArrayList<>();
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        b= sc.nextInt();
        solve(list,b);
    }
}
