public class maxProduct{
    public static int maxSubarrayProduct(int a[]){
        int product=1, max=a[0];
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i+1;j<a.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                    product*=a[k];
                }
                System.out.println(product);
                System.out.println();
                if(max<product){
                    max=product;
                }
                product=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int array[]={0,2};
        System.out.println(maxSubarrayProduct(array));
    }
}