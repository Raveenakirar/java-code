//1 | print number from n to 1 decreasing order 
   public class  RecursionBasics 
    {
//    public static void printDec(int n){
//       if (n==1)
//       {
//           System.out.println(n);
//           return ;
//       }
//        System.out.println(n+" ");
//        printDec (n-1);
//   }
//   public static void main(String args[]){
//       int n = 10;
//       printDec(n);
//   }   Output  = [10 , 9, 8, 7, 6, 5, 4, 3, 2, 1]
   
// 2 | print numbers 1 to n increasing order
//     public static void printInc(int n){
//         if(n==1){
//             System.out.println(1 + " ");
//             return ;
//         }
//         printInc(n-1);
//         System.out.println(n);
//     } 
//     public static void main (String args[]){
//        int n = 10 ;
//        printInc(n);
//     }   
//   Output = (1,2,3,4,5,6,7,8,9,10)

// 3|  public static int Fact (int n){
//    if (n==0){
//        return 1;
//    }
//     int s1=Fact(n-1);
//     int s2=n*Fact(n-1);
//     return s2;
//   }
//    public static void main(String args[]){
//        int n= 5;
//        System.out.println(Fact(n));
//    }  
// output = 120
  
// 4|  print number of SumCalculate
//     public static int calcSum(int n){
//     if (n==1){
//     return 1;
//  } 
//    int sum1=calcSum(n-1);
//    int sum2=n+calcSum(n-1);
//    return sum2;
//  }
//    public static void main (String args[]){
//     int n =5;
//     System.out.println(calcSum(n)); 
//   }  
 // output = 15
  
// 5 | print Nth Fibonacci number
//     public static int Fib(int n){
//      if (n==0 || n==1){
//       return n;
//   }
//   int num1=Fib(n-1);
//   int num2=Fib(n-2);
//   int num3=num1 + num2;
//   return num3;
//  }
//  public static void main(String args[]){
//   int n=5;
//   System.out.println(Fib(n));
//  } 
//   output = 5
 
// 6 | print array in ShortestPath
//    public static boolean isSorted(int arr[],int i){
//       if (i == arr.length-1){
//        return true;
//    }
//    if (arr[i] > arr[i+1]){
//        return false;
//    }
//     return isSorted(arr,i+1); 
// } 
// public static void main(String args[]){
//    int arr[]={1,2,3,4};
//    System.out.println(isSorted(arr,0));
// }
//  Output = true 

// 7 | WAF to find the first Occurence of an element in an array
//   public static int firstOccurence(int arr[],int key , int i){
//    if (i == arr.length){
//        return -1;
//    }
//       if (arr[i]==key){
//           return i;
//       }
//    return firstOccurence(arr,key,i+1);
//   }
//   public static void main(String args[]){
//    int arr[]={8 ,2,3,4,5,8,2,9,7};
//    System.out.println(firstOccurence(arr,11,0));
//   }
// output = -1
  public static int lastOccurence(int arr[], int key,int i){
//    if (i==arr.length){
//        return -1;
//    }
//     int isFound=lastOccurence(arr, key, i+1);
//     if(isFound == -1 && arr[i]==key)
//     {
//        return i;
//     }
//     return isFound;
//  }
//  public static void main(String args[]){
//    int arr[]={1,3,4,6,8,9,7,6,3,1};
//    System.out.println(lastOccurence(arr,3,0));
//  }
//  output = 8 
    }  