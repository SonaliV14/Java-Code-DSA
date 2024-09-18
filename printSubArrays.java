
public class printSubArrays {
    public static void printSubArrays(int a[]){
        int n=0, max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                    sum+=a[k];
                }
                n++;
                System.out.println("Sum: "+sum);
                System.out.println();
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs: "+n);
        System.out.println("maximum sum is: "+max);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        printSubArrays(nums);
    }
}
