public class binary{
    public static int bst(int arr[], int x, int low, int high ){
        int mid = low + (high-low)/2;
    if(x == arr[mid]){
        return mid;
        }
    if(arr[mid]<x){
             low = mid+1;
        }
    else{
            high = mid-1;
        }
    return -1;
    }

    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int x =5;
        int result = bst(arr, x, 0, n-1);
        System.out.println("index of target is "+ result);
    }
}