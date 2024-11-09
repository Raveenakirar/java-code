//import java.util.*;
//public class Array{
   /*public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
           marks [i]=marks[i]+1;
        }
    }
    public static void main(String arg[]){
       int marks []={55,67,89};
       update(marks);
       for(int i=0;i<marks.length;i++)
       {
        System.out.print(marks[i]+" ");
       }
       System.out.println();
    }
} 
   public static void update(int sum[]){
    for(int i=0;i<sum.length;i++){
      //int sum[] ="a+b"; 
    //}
       int a=20;
       int b=30;
       int c=a+b;
       int sum[]="c";
   }
           
     
      public static void main(String args[]){
        
        //update(sum);
        for(i=0;i<sum.length;i++){
            System.out.print(sum[] " ");
        }
         System.out.println();
      }
}*/  /*   
      //LINEAR SEARCH
     public static int linearSearch(int numbers[],int key){
        int i=0;
        for(i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        }
         return -1;
     }
      public static void main(String args[]){
        int numbers[]={2,4,5,6,7,12,33};
        int key=12;
          //int index = linearSearch(numbers,key);
        //if(index==-1)
    
            System.out.println("INDEX :" + linearSearch(numbers,key));

        // else{
           // System.out.println(" key is not index :"+ index);
        }
      }*/
      /* 
         public static int binarySearch(int numbers[],int key){
            int start=0; 
            int end=numbers.length-1;
            while (start<=end){
              int mid=(start+end)/2;
              if(numbers[mid]==key)
              {
                return mid;
              }
              if(numbers[mid]<key){
                start = mid+1;
              }
              else{
                  end=mid-1;
              }
            }
               return-1;
          }
             public static void main(String args[]){
              int numbers[]={23,34,45,56,67};
              int key=45;
              System.out.println("index for key is :"+ binarySearch(numbers,key));
             }
           } */
             /* 
               //REVERSE ARRAY
           public static void reverse(int numbers[]){
            int first=0;
            int last=numbers.length-1;
            while( first < last ){
                int temp=numbers[last];
                numbers[last]=numbers[first];
                numbers[first]=temp;
                first++;
                last--;
            }
         }  
              public static void main(String args[]){
                int numbers[]={2,4,6,8,12};
                reverse(numbers);
                for(int i=0;i<numbers.length;i++){
                    System.out.print(numbers[i]+ " ");
                }
                 System.out.println();
              }   
            } */ 
             
                /* PAIR OF TWO NUMBER

                public static void printPairs(int numbers[]){
                    for(int i=0;i<numbers.length;i++){
                        int curr=numbers[i];
                        for(int j=i+1; j<numbers.length;j++){
                         System.out.print("("+curr+","+numbers[j]+")");
                        }
                         System.out.println();
                    }
                } 
                   public static void main(String args[]){
                    int numbers[]={2,4,6,8,10};
                     printPairs(numbers);
                   }
                }
                    
                //Print SubArrays
                public static void printSubarray(int numbers[]){
                  int ts=0;
                  for(int i=0;i<numbers.length;i++){
                    int start=i;
                    for(int j=i+1;j<numbers.length;j++){
                      int end=j;
                      for(int k=start;k<=end;k++){
                        System.out.print(numbers[k]+"");
                      }
                      ts++;
                      System.out.println();
                    }
                    System.out.println();
                  }
                  System.out.println("Total Subarrays =" + ts );
                }
                 public static void main(String args[]){
                  int numbers[]={2,3,5,7,8};
                  printSubarray(numbers);
               }
            }public static void printSubarray(int numbers[]){
                  int ts=0;
                  for(int i=0;i<numbers.length;i++){
                    int start=i;
                    for(int j=i+1;j<numbers.length;j++){
                      int end=j;
                      for(int k=start;k<=end;k++){
                        System.out.print(numbers[k]+"");
                      }
                      ts++;
                      System.out.println();
                    }
                    System.out.println();
                  }
                  System.out.println("Total Subarrays =" + ts );
                }
                 public static void main(String args[]){
                  int numbers[]={2,3,5,7,8};
                  printSubarray(numbers);
               }
            }*/
                /*  sub array

            public static void maxSubarraySum(int numbers[]){
              int ts=0;
              for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i+1;j<numbers.length;j++){
                  int end=j;
                  for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+"");
                  }
                  ts++;
                  System.out.println();
                }
                System.out.println();
              }
              System.out.println("Total Subarrays =" + ts );
            }
             public static void main(String args[]){
              int numbers[]={2,3,5,7,8};
              maxSubarraySum(numbers);
           }
        }         output
                 {  
                      23
                      235
                      2357
                      23578
                      
                      35
                      357
                      3578
                      
                      57
                      578
                      
                      78

                              }  */

                              /*     find smallest and largest value

                              public static int getLargest_Smallest(int numbers[])
                              {
                                int Largest = Integer.MIN_VALUE;
                                int Smallest =Integer.MAX_VALUE ;
                                
                                for (int i=0;i<numbers.length;i++){
                                  if (Largest < numbers[i]){
                                      Largest=numbers[i];
                                  }
                                  for (int j=0;j<numbers.length;j++){
                                    if(Smallest>numbers[j]){
                                      Smallest=numbers[j];
                                    } 
                                  }
                                } 
                                  System.out.println(Smallest);
                                  return Largest;
                                //System.out.println(smallest);
                              }public static void main(String args[]){
                                int numbers[]={2,4,5,6,1,3};
                                System.out.println("largest number is =" + getLargest_Smallest(numbers));
                               // System.out.println("smallest number is =" + getlargest(numbers));
                              }
                            }  */
                  
                             /*import java.util.*;
public class ArrayR
{
    public static void main (String arg[])
    {
     for(int line=1;line<=7;line++)
   {
     for (int star=1;star<=7-line+1;star++)
   {
       System.out.print("*");
   }
     System.out.println( );
   } 
 }
}


import java.util.*;
public class ArrayR
{
    public static void main (String arg[])
    {
     for(int line=1;line<=10;line++)
   {
     for(int star=1;star<=12-line+1;star++)
   {
       System.out.print("*");
   }
      System.out.println( );
   } 
 }
}
   import java.util.*;
   public class ArrayR
   {
     public static void hollow_rectangle(int totRows,int totCols)
   {  
      for(int i=1;i<=totRows;i++)
    {
      for(int j=1;j<=totCols;j++)
      {
        if(i==1||i==totRows||j==1||j==totCols)
        {
           System.out.print("*");
        } 
          else {
              System.out.println("");
            }
       }
     }
    }
        public static void main (String args[])
      {
     // public static void main(String args[]);
        hollow_rectangle(5,7);
      }
    }
         import java.util.*;
         public class ArrayR{
          public static void half_rectangle(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                System.out.print("");
              }
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              System.out.println("");
            }
          }
           public static void main(String args[]){
            half_rectangle(6);
           }
         }
        import java.util.*;
        public class ArrayR { 
        public static void half_pyramid(int n){
          for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
           System.out.print(j);
          }
           System.out.println( );
          }
        }
        public static void main(String args[])
        {
          half_pyramid(5);
        }
      }
      import java.util.*;
      public class ArrayR{
        public static void multi_number(int n){
         int counter=1;
          for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print(counter+" ");
              counter++;
            }
            System.out.println( );
          }
        }
        public static void main (String arg[]){
          multi_number(4);
        }
      }
         import java.util.*;
         public class ArrayR{
         public static void rectangle(int n){
          for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
              if ((i+j)%2==0){
                System.out.print("1");
              }
               else{
                System.out.print("0");
               }
            }
            System.out.println();
          }
         }
           public static void main(String args[]){
             rectangle(10);
           }
        }
          import java .util.*;
          public class ArrayR{
            public static void butterfly(int n){
              for (int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                  //star
                  System.out.print("*");
                } 
                    //space
                    for (int j=1;j<=2*(n-i);j++){
                      System.out.print("");
                    }
                    //star
                    for (int j=1;j<=i;j++){
                      System.out.print("*");
                    } System.out.println( );
                   } 
                  }
                   //second butterfly
                   for(int i=n;i>=1;i--){
                    for(int j=1;j<=i;j++){
                  //star
                   System.out.print("*");
                    } 
                  //space
                   for (int j=1;j<=2*(n-i);j++){
                   System.out.print("");
                    }
                  //star
                    for (int j=1;j<=i;j++){
                     System.out.print("*");
                  }
                } System.out.println();
        
               public static void main(String args[]){
                butterfly(4);
               } 
              }*/

            
//               import java.util.*;
//               public class ArrayR{
//               public static void printSubarrays(int numbers[]){
//                   int last=numbers.length; 
//                   int ts=0;
//                   for(int i=0;i<numbers.length;i++){
//                       int start=i;
//                       for(int j=i;j<numbers.length;j++){
//                           int end=j;
//                           for(int k=start;k<=end;k++){
//                               System.out.print(numbers[k]+"");
//                           }
//                           ts++;
//                             System.out.println();
//                       }
//                             System.out.println();
//                    }
//                   System.out.println("total Subarray="+ts);
//                 }
//                     public static void main(String arg[]){
//                     int number[]={2,4,6,8,10};
//                     printSubarrays(numbers);
//                  }
//               }    
//               import java.util.*;
// public class ArrayS
// {
   // public static void printArray(int number){
      //int arg=(2,4,6,8);  
       // for(int i=0;i<=n;i++)
       //{
        //int i=sum+arg;
         //System.out.println(sum +"c");
         //}
      
 //   public static void main(String arg[]){
       // int a=4;
        //int b=10;
        //int c=(a+b);
//        int arg=(2,4,6,8);  
//        for(int i=0;i<=n;i++)
//       {
//        int i=sum+arg;
//         //System.out.println(sum +"c");
//         }
//        System.out.print(i);
//    }
//  }
      
  import java.util.*;
public class Array{
public static void printSubArrays(int numbers[]){
    int last=numbers.length; 
    int ts=0;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+"");
            }
            ts++;
              System.out.println();
        }
              System.out.println();
     }
    System.out.println("total Subarray="+ts);
  }
      public static void main(String args[]){
      int numbers[]={2,4,6,8,10};
      printSubArrays(numbers);
   }
}
  
    
  
                           
