// Bubble Sort
class Question {
   void bubblesort(int arr[]) {
      int n = arr.length, temp;
      for (int i = 0; i < n - 1; i++) {
         for (int j = 1; j < n - i; j++) {
            if (arr[j - 1] < arr[j]) {
               temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
            }
         }
      }
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}

public class bubble_sort {
   public static void main(String[] args) {
      int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 0 };
      Question bQuestion = new Question();
      bQuestion.bubblesort(arr, n);

   }
}
