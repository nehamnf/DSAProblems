package Medium;

import java.util.Arrays;

public class BulbSwitcher {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(5));

        System.out.println(Integer.toBinaryString(5));
    }

    public static int bulbSwitch(int n) {

        boolean[] bulbs= new boolean[n];
        Arrays.fill(bulbs,true);
        System.out.println(Arrays.toString(bulbs));
        Arrays.fill(bulbs,true);

        for(int i=1;i < n-1;i++){
            if(bulbs[i]){
                bulbs[i]=false;
            }else {
                bulbs[i]=true;
            }
        }

        System.out.println(Arrays.toString(bulbs));
        return 0;
    }

}
