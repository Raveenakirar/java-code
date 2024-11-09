public class Recursion2{
//    public static int tilingProblem(int n){
//        if (n==0||n==1){
//            return 1;
//        }
//        //vertical choice
//        int fnm1 = tilingProblem(n-1);
//        //horizontal choice
//        int fnm2 = tilingProblem(n-2);
//        int totalWays= fnm1+fnm2;
//        return totalWays;
//    }  
//    public static void main(String args[]){
//        System.out.println(tilingProblem(5));
//    }
//  output = 8 

 //remove duplicate array
// public static void removeDuplicates(String str , int idx, StringBuilder newstr,boolean map[])
// {
//    if(idx ==str.length()){
//        System.out.println(newstr);
//        return;
//    }
//    //kaam
//    char currChar= str.charAt(idx);
//    if (map[currChar-'a']==true){
//        removeDuplicates(str,idx+1,newstr,map);
//    }
//    else
//      {
//        map[currChar-'a']=true;
//        removeDuplicates(str,idx+1,newstr.append(currChar),map);   
//       }
//     }
//      public  static void main(String args[]){
//        String str = "raveena";
//        removeDuplicates(str,0,new StringBuilder(" "), new boolean[26]);
//      }
//    }
//  output =  raven
// public static int friendsPairing(int n){
//    if (n==1||n==2){
//        return n;
//    }
 //   //choise single
 //   int Fnm1= friendsPairing(n-1);
 //   // pair 
 //   int Fnm2= friendsPairing(n-2);
 //   int PairWays= (n-1)*Fnm2;
 //     //totWays
 //     int totWays = Fnm1 +PairWays;
 //     return totWays;
 //    return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
 //  }
 //     public static void main(String args[]){
 //      friendsPairing(5);
 //   }

       public static void printBinStrings(int n, int lastPlace, String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n-1, 0,str+"0");
        if (lastPlace ==0){
            printBinStrings(n-1 , 1, str+1);
        }
       }
         public static void main(String args[]){
            printBinStrings(4,0," ");
         }
    }        
  //     output = 0000, 0001,  0010 ,  0100,  0101,  1000,  0001, 0010, 0001, 0001, 0010, 0100, 0101, 1000,1001, 1010;
               
           
               
               
               
               
             
                
               
                
               
                
              
               
               
               