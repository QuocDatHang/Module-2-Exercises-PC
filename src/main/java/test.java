public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 15, 9, 10, 17, 16};
        total(arr);
    }
    //Tính tổng các số nguyên tố trong mảng

    public static boolean isPerfectSquare(int number) {
        boolean isPerfect = false;
        for (int j = 1; j <= number; j++) {
            if (j * j == number) {
                isPerfect = true;
                break;
            }
            if (j * j > number) {
                isPerfect = false;
                break;
            }
        }
        return isPerfect;
    }

    public static void total(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                total += arr[i];
            }
        }
        System.out.println(total);
    }
}
