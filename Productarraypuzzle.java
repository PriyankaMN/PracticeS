import java.util.*;
/*Given an array of integers A, find and return the product array of same size where i'th eement of the product array will be equal to the product of all the elements divided by the i'th element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.

 Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]*/
public class Productarraypuzzle {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
         A.add(3);A.add(-2);A.add(1);A.add(4);A.add(3);A.add(-2);A.add(1);

          int mul=1;
        
        for(int i=0;i<A.size();i++){
            mul*=A.get(i);
        }
        System.out.println(mul);
        ArrayList<Integer> PS = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            if(A.get(i) != 0){
            PS.add(mul/A.get(i));}
            
        }
        System.out.println(PS); 
    }
}
