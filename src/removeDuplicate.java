public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,1,2,3,4};

        for(int i =0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<= arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;

                }
            }
        }
        System.out.println("After removing duplicate data");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
