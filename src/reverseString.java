public class reverseString {
    public static void main(String[] args) {
        String a = "Tabish";
        int i = a.indexOf('i');
        String c ="";
        int ln = a.length();

        for(int j =i;j>=0;j--){
            c=c+a.charAt(j);
        }

        for(int k=i+1;k<ln;k++){
            c=c+a.charAt(k);
        }
        System.out.println(c);


    }
}
