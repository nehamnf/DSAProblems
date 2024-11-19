package Easy;

public class CountDigitsThatDivideNumber {

    public static int countDigits(int num) {

        int tempNum=num;

        int count=0;
        while (tempNum > 0){
            int rem=tempNum % 10;
            if(num % rem ==0){
                count=count+1;
            }
            tempNum=tempNum/10;
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
}
