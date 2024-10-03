public class mergeSort {
    public static void sortArray(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        sortArray(arr,si,mid+1);
        sortArray(arr,mid,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;   
        while(i<=mid+1 && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid+1){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }
    }

    public static void printArray(int[] arr){
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        int[] a={2,5,9,6,7};
        sortArray(a, 0, a.length-1);
        printArray(a);
    }
}
