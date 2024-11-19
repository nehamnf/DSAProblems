package Easy;

public class ThreeDivisors {
    public static void main(String[] args) {
        System.out.println(isThree(25));
    }

    public static boolean isThree(int n) {
        int root= (int) Math.sqrt(n);

        if(  root * root != n){
            return false;
        }

        for( int i=2;i * i <= root;i++){
            if(root % i == 0){
                return false;
            }
        }

        return root > 1;
    }
}
