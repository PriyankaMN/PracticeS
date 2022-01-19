import java.util.ArrayList;
import java.util.List;

public class Multipleleftrotationsofthearray {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>>();
        // A.add(5);A.add(17);A.add(100);A.add(11);
        // B.add(1);
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        B.add(2);B.add(3);
        
        int n=A.size(),k;
        
        for(int i=0;i<B.size();i++){  
            C.add(new ArrayList<Integer>());  
            k=B.get(i)%n;
            //System.out.println("k: "+k);
            for(int j=k; j<n; j++){
                C.get(i).add(A.get(j));
            }
            for(int j=0;j<k;j++){
                C.get(i).add(A.get(j));
            }
        }
        System.out.println(C);

    }
}

/*        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        ArrayList<ArrayList<Object>> C = new ArrayList<ArrayList<Object>>();
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        B.add(2);B.add(3);

        int n=A.size(),k;
        for(int i=0;i<B.size();i++){
            k=B.get(i)%2;
            for(int j=n-k;j<n;j++){
                C.get(i).add(A.get(j));
            }
            for(int j=0; j<k; j++){
                C.get(i).add(i,A.get(j));
            }
        }
        System.out.println(A); */
        

        /*        int n=A.size(),k;
        for(int i=0;i<B.size();i++){
            C.add(new ArrayList<Integer>());
            for(int j=0;j<B.size();j++){
            
            C.get(i).add(B.get(j));
        }
    }
        System.out.println(C); */