public class trappingRainwater {
    public static int trappedWater(int a[]){
        int n = a.length;
        int left[]=new int[n];
        int right[]=new int[n];

        //getting tallest left
        left[0]=a[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }

        //getting tallest right
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],a[i]);
        }

        //getting answer
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i]-a[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int containers[]={3,1,2,4,0,1,3,2};
        System.out.println("Trapped rainwater is: "+trappedWater(containers));
    }
    
}
