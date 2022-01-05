import java.util.*;
public class Amstrong {

    static boolean amstrom(int n,int c){
    int rem,rev=0,sum=0;
    int org = n;
    int orgn = n;
    //System.out.println( "c " +c);
    while(org>0){
        rem = org%10;
        rev=rev*10+rem;
        sum = (int) (sum+Math.pow(rem, c));
       // System.out.println(sum);
        org=org/10;
    }
    //System.out.println(org);
    if(sum == orgn){
    return true;}
    else{
        return false;
    }
    }
    public static void main(String[] args) {
    int n,c=0,n1;
    
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    n1=n;
    while(n1 > 0){
    //rev=rev*10+rem;
    c=c+1;
    n1=n1/10;
    }

    if(c == 1){
        System.out.println(1);
    }
    else{
    for(int i=1;i<=n;i++){
        if(amstrom(i,c)){
            System.out.println(i);
        }
    }
    }
    }
}
