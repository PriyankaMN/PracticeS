import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> E = new ArrayList<>();
        List<Integer> O = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T,a;
        T=sc.nextInt();
        while(T>0){
            a=sc.nextInt();
            for(int i=0;i<a;i++){
                A.add(sc.nextInt());
            }

            for(int i=0;i<a;i++){
                //System.out.println("i: "+A.get(i));
                if(A.get(i)%2 == 0){
                    E.add(A.get(i));
                }
                else{
                    O.add(A.get(i));
                }
            }
            
            if(O.size()>0){
                for(int i =0;i<O.size();i++){
            System.out.print(O.get(i)+" ");}}

            System.out.println();
            if(E.size()>0){
                for(int i =0;i<E.size();i++){
            System.out.print(E.get(i)+" ");}}
            System.out.println();
            O.clear();
            E.clear();
            A.clear();
            T--;
        }

    }
}
