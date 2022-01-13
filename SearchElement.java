import java.util.*;
/*Input:
First line of the input contains a single integer T.

Next, each of the test case consists of 2 lines:

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B

Output:
For each test case, print on a separate line 1 if the element exists, else print 0.
*/
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,A,B;
        List<Integer> list = new ArrayList<>();
        T=sc.nextInt();
        while(T>0){
            A=sc.nextInt();
            for(int i=0;i<A;i++){
                list.add(sc.nextInt());
            }
            //System.out.println("B");
            B=sc.nextInt();
            //boolean ans=list.contains(B);
            if(list.contains(B)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
            T--;
        }
    }
}
