public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,14,16,18};
        int target = 15 ;
        int first =0;
        int last = arr.length-1;


        while(first <= last){
            int mid = (first+last)/2;

            if(target>= arr[last]){
                System.out.println("your Ceiling value is "+arr[last]);
                System.out.println("Index number "+last);
                return;
            }


            else if(target == arr[mid]){
                System.out.println("Element is Found!!! in index "+ (arr[mid]) );
                System.out.println("Index number "+mid);
                return;
            }

            else if (target > arr[mid]){
                first = mid +1;

            }
            else {
                last= mid-1;

            }

        }
        System.out.println("your Ceiling value is "+arr[first]);
        System.out.println("Index number "+first);


    }
}
