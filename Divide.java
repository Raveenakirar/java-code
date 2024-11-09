// Divide & Conqure
public class Divide{
    public static void printArr(int arr[]){
        for(int i=0; i<=arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
           public static void margeSort(int arr[], int si , int ei){
            int mid = si + (si - ei)/2;
             margeSort (arr , si , mid);
             margeSort ( arr , mid+1, ei);
             marge     (arr ,si , mid , ei);
        }
           public static void marge(int arr[], int si , int mid, int ei){
            int temp[] =new int[ei - si +1];
            int i = si;
            int j= mid+1;
            int k= 0; 
            while (i <= mid && j <=ei){
                if (arr[i] < arr[j]){
                   temp[k] =arr[i];
                   i++;
                } else{
                    temp[k] = arr[j];
                    j++;
                }
                   k++;
            }
            while( i <= mid){
                temp[k++] =arr[i++];
            }
            while(j <= ei){
                temp[k++] =arr[j++];
            }
            for(k=0, i= si; k< temp.length; k++ , i++){
                arr[i] = temp[k];
            }
        }   
      public static void main (String args[]){
        int arr[] = {1, 3, 5, 6, 9, 1, 4 , 2,6};
         margeSort (arr , 0 , arr.length-1);
         printArr(arr);
    }
}