import java.util.*;
public class BitMan{
   /*  public static void OddEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even number");
        } else{
            System.out.println(" odd number");
        }
    }
   */   //GETITHBIT CODE
       
     /*  public static int getIthBit(int n ,int i){
             int bitMask=1<<i;
          if((n & bitMask) ==0){
              return 0;
          }else{
              return 1;
          }
         }*/      //SETITHBIT CODE

           // public static int setIthBit(int n, int i){
           //   int bitMask=1<<i;
           //   return n|bitMask;
           //  }
           /*       //CLEARITHBIT CODE  
                   
           public static int clearIthBit(int n ,int i){
            int bitMask= ~(i<<i);
            return n & bitMask;
           }*/ /* 
          public static int updateIthBit(int n,int i,int NewBit){
            if(NewBit==0){
            n = clearIthBit(n , i);
          }
            int BitMask=NewBit<<i;
              return n|BitMask;
         }*/
        /*public static int ClearIBit(int n, int i){
            int bitMask=(~0)<<i;
            return n & bitMask;
        }
        public static boolean isPowerOfTwo(int n){
           return (n&(n-1))=0 ;
                
        }*/
        //public static void main(String args[]){
       // OddEven (4);
      // OddEven (10);
     // OddEven (12);
       //System.out.println(getIthBit(10,2));
       // System.out.println(setIthBit(10,2));
      //System.out.println(clearIthBit(10,2));
      //System.out.println(updateIthBit(10,2,1));
      // System.out.println(ClearIBit(15,2));
     // System.out.println(isPowerOfTwo(8));

 // THIS IS A AND CONDITION System.out.println(12 & 13);
 // TIHS IS A XOR CONDITION System.out.println(12^13);
 //THIS IS A NOT CONDITION System.out.println( ~5 );
 //System.out.println(12 13);
 //System.out.println(25<<2); [25*2^2 =25*4=100];
 // System.out.println(10>>2);{10=1010 and 0 is reduse so 101 is present and 101(5)value
 // and 1 reduce so 10 is present and we add 0 so 010 is the value of (2)so the ans is (2) }
   //CODE PRINT THE VALUE OF X AND Y WITH SWAPING BUT NOT USE THE VARIABLE
  /*public static void main(String args[]){
    int x=4;
    int y=3;
      System.out.println("Before swaping x =" + x + " and y ="+ y);
     //swap
      x = x ^ y;
      y = x ^ y;
      x = x ^ y;
     System.out.println("After swaping x =" + x + " and y ="+ y);*/
     public static void main(String args[]){
      /*int x=6;
      System.out.println(x + " + " + 1 + " is " + -~x);
       x=-4;
      System.out.println(x + " + " + 1 + " is " + -~x);
      x= 0;
      System.out.println(x + " + " + 1 + " is " + -~x);*/
      
      for(char ch= 'A'; ch<'Z'; ch++){
        System.out.print((char ) ( ch | ' '));
      }
   }
 }