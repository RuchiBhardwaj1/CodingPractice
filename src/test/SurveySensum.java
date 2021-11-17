package test;

public class SurveySensum {

    
    public void multiplicationOfNumber(int b, int a) {



        int mul =  multiply(b,a,0);
        int fact =0;

        if(b>a){
            fact = factorial(b);
        }
        else {
            fact = factorial(a);
        }
        System.out.println(mul);
        System.out.println(fact);
        System.out.println(multiply(mul,fact,0));
    }

    public int multiply(int b, int a,int val) {
        if(a <= 0) return val;
        return multiply(b,a-1,val+b);
    }

    public int factorial(int a){

        if(a==0)
            return 1;
        else{
            return (a*factorial(a-1));
        }
    }

    public static void main(String[] args) {
        
        SurveySensum s = new SurveySensum();
        s.multiplicationOfNumber(2,5);
    }

}
