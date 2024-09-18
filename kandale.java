
public class kandale {
    public static void kandales(int a[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cs+=a[i];
            if(cs<0){
                cs=0;
            }

            ms=Math.max(cs, ms);
        }
        System.out.println("Maximum subarray sum is: "+ms);
    }

    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kandales(num);
    }
}
