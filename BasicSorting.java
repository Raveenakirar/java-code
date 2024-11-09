  //sorting are many type
  // 1 bubble sort 
  // 2 selection sort
  // 3 insertion sort
  // 4 counting sort
  /*  
   BUBBLESORT   SELECTION  INSERTION     
   8,5,1,3,7    8,5,1,3,7  8,5,1,3,7                
   5,8,1,3,7    1,5,8,3,7  8,5,1,3,7
   5,1,8,3,7    1,3,8,5,7  5,8,1,3,7
   5,1,3,8,7    1,3,5,8,7  1,5,8,3,7
   5,1,3,7,8    1,3,5,7,8  1,3,5,8,7
                           1,3,5,7,8
   */

   import java.util.*;
   public class BasicSorting{
     /* public static void bubbleSort(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            for (int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                //Swap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }  
          public static void printArr(int arr[]){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }    System.out.println();
          }
            public static void main(String args[]){
                int arr[]={5,4,1,3,2};
                bubbleSort(arr);
                printArr(arr);
            }
        }        OUTPUT BUBBLE SORT  
                 
        PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
        1 2 3 4 5 
        PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
        5 4 3 2 1 
          
               public static void bubbleSort(int arr[]){
                for(int turn=0; turn<arr.length-1; turn++){
                    for (int j=0; j<arr.length-1-turn; j++){
                        if(arr[j]<arr[j+1]){
                         //swwap
                         int temp =arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                        }
                    }
                }
               }     public static void printArr(int arr[]){
                  for(int i=0;i<=arr.length;i++){
                    System.out.print(arr[i] +" ");
                  }      System.out.println();
               } 
               public static void main(String args[]){
                int arr[]={3,6,2,1,8,7,4,5,3,1};
                bubbleSort(arr);
                printArr(arr);
               }
            }            PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                             8 7 6 5 4 3 3 2 1 1 
               */
           /*
             public static void SelectionSort(int arr[])
             {
                for(int i=0;i<arr.length-1;i++){
                    int minpos=i;
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[minpos]>arr[j]){
                            minpos=j;
                        }
                    }   int temp=arr[minpos];
                        arr[minpos]=arr[i];
                        arr[i]=temp; 
                }
             }

          public static void printArr(int arr[]){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }    System.out.println();
          }
            public static void main(String args[]){
                int arr[]={5,4,1,3,2};
                SelectionSort(arr);
             //   bubbleSort(arr);
                printArr(arr);
            }
        }          OUTPUT SelectionSort

                PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                  1 2 3 4 5 
                  
                     public static void SelectionSortion(int arr[]){
                      for(int turn=0;turn<arr.length-1;turn++){
                        int minPos= turn;
                        for (int j=turn+1; j<arr.length;j++){
                          if(arr[minPos] >arr[j]){
                             minPos = j;
                          }
                        }
                          //swap
                          int temp=arr[turn];
                          arr[turn]=arr[minPos];
                          arr[minPos]=temp;
                        }
                      }
                      public static void printArr(int arr[]){
                        for(int i=0;i<=arr.length;i++){
                            System.out.print(arr[i] +" ");
                        }System.out.println(" ");
                     }  public static void main(String args[]){
                        int arr[]={3,6,2,1,8,7,4,5,3,1};
                        SelectionSortion(arr);
                        printArr(arr);
                     }             
                     }           
                     output
                     1 1 2 3 3 4 5 6 7 8
                     */
                            //  insertionSort
                  /*  public static void insertionSort(int arr[]){
                    for (int i=0;i<arr.length;i++){
                        int curr=arr[i];
                        int prev=i-1;
                        while(prev>=0 && arr[prev]>curr)
                        {
                            arr[prev+1]=arr[prev];
                            prev--;
                        }
                        arr[prev+1]=curr;
                    }
                   }
                     public static void printArr(int arr[]){
                       for(int i=0; i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                       }   
                       System.out.println();
                   }    
                     public static void main(String args[]){
                        int arr[]={5,4,1,3,2};
                        insertionSort(arr);
                        printArr(arr);
                     }
                }              
                            output insertionSort
                            PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                            5 4 3 2 1 
                            PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                            1 2 3 4 5 
                      */ 
                         
                      /*  public static void insertionSort(Integer arr[]){
                        for (int i=0;i<arr.length;i++){
                            int curr=arr[i];
                            int prev=i-1;
                            while(prev>=0 && arr[prev]>curr)
                            {
                                arr[prev+1]=arr[prev];
                                prev--;
                            }
                            arr[prev+1]=curr;
                        }
                       }
                         public static void printArr(Integer arr[]){
                           for(int i=0; i<arr.length;i++){
                            System.out.print(arr[i]+" ");
                           }   
                           System.out.println();
                       }    
                         public static void main(String args[]){
                           Integer arr[]={5,4,1,3,2};
                            Arrays.sort(arr,0,3,Collections.reverseOrder());
                             printArr(arr);
                         }
                    }         output
                            PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                             5 4 1 3 2 */

                              /*
                              public static void countingSort(int arr[]){
                                int largest= Integer.MIN_VALUE;
                                for(int i=0;i<arr.length;i++){
                                    largest=Math.max(largest,arr[i]);
                                }
                                int count[]=new int [largest+1];
                                for(int i=0;i<arr.length;i++){
                                    count[arr[i]]++;
                                }
                                //sorting
                                int j=0;
                                for(int i=0;i<count.length;i++){
                                    while(count[i]>0){
                                        arr[j]=i;
                                        j++;
                                        count[i]--;
                                    }
                                }
                             } public static void printArr(int arr[]){
                                for(int i=0; i<arr.length;i++){
                                 System.out.print(arr[i]+" ");
                                }   
                                System.out.println();
                            }    
                             public static void main(String args[]){
                                int arr[]={1,4,1,3,2,4,3,7};
                                countingSort(arr);
                                 printArr(arr);
                             }
                            }            output
                                  PS C:\Users\HP\Desktop\hello.java> java BasicSorting.java
                                  1 1 2 3 3 4 4 7 */
