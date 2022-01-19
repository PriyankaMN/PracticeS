import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {

    private static void solve() {
        int a,T,c=0;
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        while(T>0){
//get array elements
            a=sc.nextInt();
        if(a>2){
            for(int i=0; i<a;i++){
             
                list.add(sc.nextInt());
            }
//sort elements in array
            Collections.sort(list);
            System.out.println("list: "+ list);

            System.out.println(list.get(list.size()-2));
        }
        else{
            System.out.println(-1);
        }
        list.clear();
        T--;
}
    }
   


    public static void main(String[] args) {

        solve();
    
    }

    
    }
/*import java.lang.*;
import java.util.*;

public class Main {
    private static void solve() {
        int a,T,c=0;
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        while(T>0){
        a=sc.nextInt();
        if(a>2){
//get array elements
            for(int i=0; i<a;i++){
                list.add(sc.nextInt());
            }
//sort elements in array
            Collections.sort(list);
            //System.out.println("list: "+ list);
            


 for(int i=list.size()-2;i>=0;i--){
     if(list.get(i) != list.get(list.size()-1)){
         System.out.println(list.get(i));
         c+=1;
         break;
     }
 }
 if(c==0){System.out.println(-1);}
    }
    else{
        System.out.println(-1);
    }
    T--;
  list.clear();
  c=0;
}
   
}
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         solve();
        
    }
} */