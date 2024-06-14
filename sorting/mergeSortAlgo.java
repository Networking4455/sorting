    //Merge sort :
    
    import java.util.*;
public class mergeSortAlgo {

    
public static void mergeSort(int[] arr, int low, int high){
     if(low >= high) return;
     int mid = (low + high)/2;
     mergeSort(arr, low, mid);    // left arr;
     mergeSort(arr, mid+1, high); // right arr;
     merge(arr, low, mid, high);
 }    
    
 public static void merge(int[] arr, int low, int mid, int high){
     int left = low;
     int right = mid+1;
     ArrayList<Integer> temp = new ArrayList<>();
     
     while(left <= mid && right <= high){
         if(arr[left] <= arr[right]){
         temp.add(arr[left]);
         left++;
         
         } else{
            temp.add(arr[right]);
            right++;
         }
         
     }
     while(left <= mid){
         temp.add(arr[left]);
         left++;         
     }
     
     while(right <= high){
         temp.add(arr[right]);
         right++;
     }
     
     for(int i=low; i<=high; i++){
         arr[i] = temp.get(i-low);
     }

 }
    
    
   public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = 5;
                System.out.println("Before sorting array: ");

         mergeSort(arr, 0, n-1);
                 System.out.println("After sorting array: ");

            for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


