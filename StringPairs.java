import java.util.*;

//Given a string s, count the number of pairs : 1. i<j  2.s[i] ='a' 3.s[j] ='g'

/*We are finding no of a's from left till a
particular g In a similar manner we can find
no of g's from eight till a particular a*/

public class StringPairs {
    public static void main(String[] args) {
        String s = "abcghg";
        int count_a=0,ans=0;
        //TC: O(S)
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count_a++;
            }
            else if(s.charAt(i) == 'g'){
                ans+=count_a;
            }
        }

    }
    
}


        // //BF approach //TC:O(N)
        // for(int i=0;i<s.length();i++){ 
        //     if(s.charAt(i) == 'a'){
        //         for(int j=i+1;j<s.length();j++){
        //             if(s.charAt(j) == 'g'){
        //                 c++;
        //             }
        //         }
        //     }
        // }
        // System.out.println(c);
