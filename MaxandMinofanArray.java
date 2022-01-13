import java.util.*;

/*Input:A single line representing N followed by N integers of the array A

Output: A single line containing two space separated integers representing maximum and minimum elements of the input array.
*/

class MaxandMinofanArray{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n ;

ArrayList<Integer> list=new ArrayList<Integer>();
n=sc.nextInt();
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}

System.out.println(Collections.max(list) + " " + Collections.min(list));

}
}