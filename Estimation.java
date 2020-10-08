import java.util.Arrays;

public class Estimation {


    public Estimation (int arr1[]){

    }

    public static int election(int arr1[]) {
        int l = arr1.length;
        Arrays.sort(arr1);
        int k = 1;
        int t = 0;
        int maxvoice = 0;
        for (int i = 1; i < l; i++) {
            if (arr1[i] == arr1[i - 1]) {
                k++;
            } else if (arr1[i] != arr1[i - 1] && t < k) {
                t = k;
                k = 1;
                maxvoice = (int) arr1[i];
            }
        }
        return maxvoice;
    }
}

