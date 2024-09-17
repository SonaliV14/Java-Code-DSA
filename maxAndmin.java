public class maxAndmin {
    public static void max_min(int a[]){
        int max=a[0],min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }

        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is: "+min);
    }
    public static void main(String[] args) {
        int a[]={2,5,6,8,10,3};
        max_min(a);
    }
}
