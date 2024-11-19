package Easy;

public class GCDOfStrings {

    public static void main(String[] args) {
        System.out.println(gcd(9,3));
        System.out.println(gcdOfStrings("ABCABC","ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        if(!(str1.concat(str2).equals(str2.concat(str1)))){
            return "";
        }

        int length=gcd(str1.length(),str2.length());
        return str2.substring(0,length);
    }

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
