public class mergeSortedArrays{
    
    public static void merge(int nums1[], int n, int nums2[], int m){
        int t1[]=fixArray(nums1, n);
        int t2[]=fixArray(nums2, m);
        int result[]= new int[t1.length + t2.length];
        int end1=t1.length-1, end2= t2.length-1;
        int i=0,j=0,k=0;

        while(i<=end1 && j<=end2){
            if(t1[i]<t2[j]){
                result[k]=t1[i];
            }else{
                result[k]=t2[j];   
            }
            i++;j++;k++;
        }

        while(i<=end1){
            result[k++]=t1[i++];
        }

        while(j<=end2){
            result[k++]=t2[j++];
        }
     printArray(result);

    }

    public static int[] fixArray(int arr[], int n){
        int temp[]=new int[n];
        for(int i=0,k=0;i<n;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        return temp;
    }

    public static void compareArrays(int temp1[], int temp2[]){
        int start1=0, start2=0;
        int end1=temp1.length;
        int end2=temp2.length;
        int result[]=new int[temp1.length+temp2.length];
        int k=0, i=0;
        while(start1<=end1 && start2<=end2){
            if(temp1[i]<temp2[i]){
                result[k]=temp1[i];
                i++; k++;
            }
        }
        printArray(result);
    }

    public static void printArray(int a[]){
        for(int e:a){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,5,6,0,0};
        int arr2[]={2,4,9,3,0,2,1};
        merge(arr1, arr1.length, arr2, arr2.length);
    }
}