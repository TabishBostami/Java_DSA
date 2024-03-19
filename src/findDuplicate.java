public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};


        for(int i=0;i<=arr.length-1;i++){
            int count = 1;
            for(int j=i+1;j<=arr.length-1;j++){

                if(arr[i]==arr[j] && arr[i]!=0 ){
                    count++;
                    arr[j]=0;
                }

            }
            if(arr[i]!=0){
                System.out.println(arr[i]+" - "+count);
            }



        }

    }
}
