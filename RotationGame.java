import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Input:
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B

Output:
Print an array of integers which is the Bth right rotation of input array A, on a separate line.
 */

public class RotationGame {

    public static void rotate(List<Integer> list, int k) {

        int n=list.size();
        k=k%n;

        List<Integer> list1 = new ArrayList<>();
        
          for(int i=n-k;i<n;i++){
                list1.add(list.get(i));
            }

        for(int i=0; i<n-k ; i++){
            list1.add(list.get(i));
        }

        for(int i=0;i<n;i++){
        System.out.print(list1.get(i)+" ");}
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a,b;
        List<Integer> list = new ArrayList<>();
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        b=sc.nextInt();
        rotate(list , b);
        list.clear();
    }


}
