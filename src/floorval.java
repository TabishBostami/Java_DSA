public class floorval {
    public static void main(String[] args) {
        int[] num = {1,3,5,7,8,12,15,16};
        int target = 19;
        System.out.println(floorVal(num,target));
    }
    static int floorVal(int[] num,int target){

        int l = 0;
        int h = num.length-1;

        while(l <= h){

            int m =l +(h - l)/2;



            if(target < num[m]){
                h = m-1;

            } else if (target > num[m]) {
                l = m+1;

            }
            else if(target == num[m]){
                return m;

            }
            else{
                return l;
            }




        }
        return h;// floor value of square root
    }
}
