public class maxItemArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 3, 4, 64, 43, 13, 53, 77, 53, 21, 283};
        System.out.println("Greatest item in array: "+max(arr));
        System.out.println(arr.length);
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }
}