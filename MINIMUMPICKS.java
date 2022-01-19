import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MINIMUMPICKS {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a,maxe=Integer.MIN_VALUE ,maxo=Integer.MAX_VALUE;
        a=sc.nextInt();
         for(int i=0; i<a;i++){
                A.add(sc.nextInt());
            }
        for(int i=0; i<a;i++){
            if(A.get(i)%2 == 0){
                if(A.get(i)>maxe){
                    maxe = A.get(i);
                }
            } 
            else {
                if(A.get(i)<maxo){
                    maxo = A.get(i);
            }}
        }
       // System.out.println("maxe: " +maxe + " maxo: " +maxo);
        System.out.println(maxe - maxo);
        
    }
}
