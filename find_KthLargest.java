public class find_KthLargest {
    public static void sortArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static int findKthLargest(int arr[], int k){
        sortArray(arr);
        int n=arr.length;
        return arr[n-k];
     }

    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        findKthLargest(nums, 2);
    }

}
