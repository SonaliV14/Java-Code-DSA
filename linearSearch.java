public class linearSearch {
    public static int linearsearch(int a[],int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[]={1,4,5,6,3,9};
        int index=linearsearch(nums, 5);
        System.out.println(index);
    }
}
