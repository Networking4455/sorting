//Count inversions: 


import java.util.*;

class count_inversion {
    
public static int mergeSort(int[] arr, int low, int high){
    int count = 0;
     if(low >= high) return count;
     int mid = (low + high)/2;
    count += mergeSort(arr, low, mid);    // left arr;
    count += mergeSort(arr, mid+1, high); // right arr;
    count += merge(arr, low, mid, high);
    return count;
 }    
    
 public static int merge(int[] arr, int low, int mid, int high){
     int count =0;
     int left = low;
     int right = mid+1;
     ArrayList<Integer> temp = new ArrayList<>();
     
     while(left <= mid && right <= high){
         if(arr[left] <= arr[right]){
         temp.add(arr[left]);
         left++;
         
         } else{
            temp.add(arr[right]);
            count += mid-left+1;
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
  return count;
 }
 
 public static int noOfInversion(int[] arr, int n){
             return mergeSort(arr, 0, n - 1);

 }
    
    
   public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = 5;
         System.out.println("Before sorting array: ");

         int result = noOfInversion(arr, n);
         System.out.println("After sorting array: ");
        System.out.println("count: "+result);

   
        }
    }
