

public class infinityBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 12, 14, 16, 18, 19, 25, 27, 29, 32, 36, 57, 63, 69,70,72,73,76,78,80,83,85,86,88,89,90,121,134,135,137,146,148};
        int target = 16;
        int index = ans(arr, target);
//        int index = binarySearch(arr,target,arrLenght[0],arrLenght[1]);
        System.out.println("Index of element is " + index);
    }


    static int ans(int[] arr, int target) {
        int chunk_start = 0;
        int chunk_end = 1;


            while (target > arr[chunk_end]) {
            int newStart = chunk_end + 1;
            chunk_end = chunk_end + (chunk_end - chunk_start + 1) * 2;
            chunk_start = newStart;
        }


        return binarySearch(arr,target,chunk_start,chunk_end);
    }

    static int binarySearch(int[] arr, int target, int first, int last) {
        while (first <= last) {
            int mid = first+ (last - first) / 2;

            if (target < arr[mid]) {
                last = mid - 1;

            } else if (target > arr[mid]) {
                first = mid + 1;

            } else{
                return  mid;

            }
        }
        return -1;
    }
}

