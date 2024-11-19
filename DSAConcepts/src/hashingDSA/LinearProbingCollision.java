package hashingDSA;

import java.util.Arrays;

public class LinearProbingCollision {
    public static void main(String[] args) {

        int[] arr= new int[]{9,99,999,9999};
        linearProbing(10,arr,4);
    }

    static int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int[] result = new int[hash_size];
        Arrays.fill(result, -1);

        for (int i = 0; i < sizeOfArray; i++) {
            int value = arr[i];
            int hash = value % hash_size;


            if (result[hash] == -1) {
                result[hash] = value;
            } else {
                while (result[hash] != -1 && result[hash] != arr[i]) {
                    hash = (hash + 1) % hash_size;
                }
                result[hash] = value;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
