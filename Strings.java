import java.util.*;
  public class Strings{
    //public static void printLetters(String str){
      /*for(int i=0;i<str.length;i++){
        System.out.println(str.charAt(i)+ " ");
      } 
        System.out.println();
    }
  
       //char arr[]={'a','b','c','d'};
         /*  String str="abcd";
        String str2= new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
    }
    }   String FullName="tony stark";
           System.out.println(FullName.length());
        }
    }         */  
      /*  String firstName = "Raveena";
       String lastName = "kirar";
       String fullName = firstName +" "+ lastName;
       System.out.println(fullName);

     */// public static float getShortestPath(String path)
           // int X2= x*x;
           // int Y2= y*y;
           // return(float)Math.sqrt(x2+y2);
           // }
           /* public static void main(String args[]){  
             String s1 = "raveena";
             String s2 = "raveena";
             String s3 = new String("raveena");
             if (s1==s2){
              System.out.println("String are equal");
             }else{
              System.out.println("String are not equal");
             } if(s1==s3){
              System.out.println("String are equal");
             }else{
              System.out.println("String are not equal");
             }
          }        
         }    

             if (s1.equals(s3)){
              System.out.println("String are equal");
             }else{
              System.out.println("String are not equal");
             }
            }
          }       OUTPUT
               String are equal
          */
         /*
         public static boolean ispalindrame (String str){
          for  (int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
              return false;
            }
          }
           return true;
         }
             public static void main(String args[]){
              String str ="racecar";
              System.out.println(ispalindrame(str));
             }
            } */ 
             
              //FIND 4 DIRECTION EAST WEST NORTH SOUTH

            /*  public static float getShortestPath(String path){
                int x=0;
                int y=0;
                for (int i=0; i<path.length(); i++){
                  char dir =path.charAt(i);
                  //south
                  if (dir == 's'){
                    y--;
                  }
                  //west
                 else if(dir =='w'){
                    x--;
                  }
                  //north
                  else if(dir =='n'){
                    y++;
                  }
                  //east
                  else{
                    x++;
                  }
                }
                   int x2=x*x;
                   int y2=y*y;
                   return (float)Math.sqrt(x2+y2) ;
              }    public static void main(String args[]){
                    String path= "wnwneeesenesennn";
                    System.out.println(getShortestPath(path));
              }
            } */ 
               /*  public static String substring(String str,int si ,int ei){
                  String substr = "";
                  for(int i=si; i<ei; i++){
                     substr += str.charAt(i);
                  } return substr;
                }  public static void main(String args[])
                  { String str="HELLOWORLD";
                    System.out.println(substring(str,0,8));
                }
              }  */
                  public static void main(String args[]){
                    String fruits[] = {"apple","banana","mnago","orange"};
                    String largest = fruits[0];
                    for(int i=1; i<fruits.length; i++){
                      if(largest.compareTo(fruits[i])<0){
                          largest = fruits[i];
                      }
                    }
                    System.out.println(largest);
                  }
                }