import java.util.ArrayList;
import java.util.List;
//Time complexity 0(N) 
public class Removing {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        //list.add(1);
        int evenSum=0 , oddSum=0;
        
        if(list.size() == 1){
            System.out.println(1);
        }
        else if(list.size() == 2){
            System.out.println(0);
        }
        else{
        for(int i=0;i<list.size();i++){
            if(i%2 == 0){ evenSum+= list.get(i);}
            else{oddSum+= list.get(i);}

        } 
    }

    int kEvenSum=0;
    int kOddSum=0;
    int res=0;

    for(int i=0;i<list.size();i++){

        if(i%2==0){
                if((evenSum - (list.get(i)+kEvenSum) + kOddSum) == ((oddSum-kOddSum) + kEvenSum)){
                res++;
            }

            kEvenSum+=list.get(i);
        }
        else{
                if((oddSum - (list.get(i)+kOddSum) + kEvenSum) == (kOddSum + (evenSum-kEvenSum))){
                res++;
            }
            kOddSum+=list.get(i);
        }

    }

    System.out.println( res);


    }
}
