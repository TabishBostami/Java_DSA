public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 14, 11, 17, 18};
        int ele = 8;
        int first =0;
        int last = arr.length;
        int count = 0;

        while(first <= last){
            int mid = (first+last)/2;
            if(ele == arr[mid]){
                System.out.println("Element is Found!!! in index "+ (mid+1) );
                System.out.println("Total number of iteration "+count);

                return;
            }
            else if (ele > arr[mid]){
                first = mid +1;
                count++;
            }
            else {
                last= mid-1;
                count++;
            }

        }
    }

}



