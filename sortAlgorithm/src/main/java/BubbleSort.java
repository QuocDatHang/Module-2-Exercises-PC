import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 24, 6, 2, 15, 3, 25, 32};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
