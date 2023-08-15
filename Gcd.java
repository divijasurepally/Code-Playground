//import java.util.ArrayList;
//import java.util.List;

public class Gcd{
    public static void main(String[] args) {
        int a = 120;
        int b = 80;
        int result  = GcdFunc(a,b);
        System.out.println(result+" is the GCD");


    }
    
    public static int GcdFunc(int a, int b){
        if((a%b)==0)
        {
           return b;
        }
        else if((a%b)!=0)
        {
            int r = (a % b);
            while(r>0)
            {
                a = b;
                b = r;
                r = (a % b);
            }
            

        }
        return b;
        
    }
        
}
    
    