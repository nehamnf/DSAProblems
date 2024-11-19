package Medium;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {


        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i*i <=n ;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                        System.out.println(j);
                        isPrime[j] = false;
                }
            }
        }

        int count=0;
        for(int i =2;i < isPrime.length;i++) {
            if(isPrime[i]) {
                System.out.println("---"+i);
                if(i != n) {
                    count = count + 1;
                }
            }
        }
        return count;

    }
}
