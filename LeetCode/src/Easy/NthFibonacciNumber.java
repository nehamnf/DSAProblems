package Easy;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {

        int a=0;
        int b=1;
        int c=0;

        if( n ==0 || n==1){
            return n;
        }

        for(int i=2;i<= n;i++){
            c=a+b;
            a=b;
            b=c;
        }

        return c;
    }
}
