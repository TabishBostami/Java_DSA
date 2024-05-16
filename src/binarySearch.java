public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 14, 11, 17, 18,25,27,29,34,37,38,39,44,47,49};
        int ele = 25;
        int first =0;
        int last = arr.length;
        int count = 0;

        while(first <= last){
            int mid = (first+last)/2;
            if(ele == arr[mid]){
                System.out.println("Element is Found!!! in index "+ (mid) );
                System.out.println("Total number of iteration "+(count+1));

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



