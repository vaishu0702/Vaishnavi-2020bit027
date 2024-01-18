public class sum{
    public static void main(strings[]args){
     
     int arr[] = {2,4,5,3,1,6,8,9,7};
     for(int i =0; i<arr.length; i++){
        for (int j = 0; j<arr.length; j++){
            int k = arr[i]+ arr[j];
            if(k == 10){
                return arr[i], arr[j];
            }
        }
     }
    }
}