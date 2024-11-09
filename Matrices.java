import java .util.*;
public class Matrices{
   /* public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell (" +i +", "+ j +")");
                    return true;
                }
            }
        }  System.out.println("key is not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n;i++){
          for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt(); 
            }
        } //output
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println( );
          }   search(matrix,55);
    }
}*/

                public static void printSprial(int Matrix[][]){
                  int startRow=0;
                  int startCol=0;
                  int endRow=Matrix[0].length-1;
                  int endCol=Matrix.length-1;
                  while(startRow<=endRow && startCol<=endCol){
                    //top
                    for(int j=startRow;j<=endCol;j++){
                        System.out.print(Matrix[startRow][j]+" ");
                    }    //right
                    for(int i=startRow+1;i<=endRow;i++){
                        System.out.print(Matrix[i][endCol]+" ");
                    }    //bottom
                        for (int j=endCol-1;j>=startCol;j--){
                            if(startRow==endRow){
                                break;
                               }
                            System.out.print(Matrix[endRow][j]+" ");
                        }   //left
                        for(int i=endRow-1;i>=startRow;i--){
                            if(startCol==endCol){
                                break;
                            }
                            System.out.print(Matrix[i][startCol]+" ");
                        }
                        startCol++;
                        startRow++;
                        endCol--;
                        endRow--;
                  }   System.out.println( );
               }   public static void main(String args[]){
                  int Matrix[][]={{1,2,3,4},
                                 {5,6,7,8},
                                 {9,10,11,12},
                                 {13,14,15,16}};
                                printSprial(Matrix);
               }
               } 
               //SAME CODE 
      
                 /*   public static void Spiralmatrix(int Matrix[][]){
                  int startRow=0;
                  int startcol=0;
                  int endRow=Matrix[0].length-1;
                  int endcol=Matrix.length-1;
                 while(startRow<=endRow && startcol<=endcol){
                  for(int j=startRow; j<=endcol;  j++){
                        System.out.print(Matrix[startRow][j]+" ");
                     }
                        for(int i=startRow+1; i<=endRow; i++){
                        System.out.print(Matrix[i][endcol]+" ");
                    }
                      for(int j=endcol-1; j>=startcol; j--){
                        if(startRow==endRow){
                            break;
                        }
                        System.out.print(Matrix[endRow][j]+" ");
                    }
                    for(int i=endRow-1; i>=startRow+1; i--){
                       if(startcol==endcol){
                        break;
                       }
                       System.out.print(Matrix[i][startcol]+" ");
                    }
                    startcol++;
                    startRow++;
                    endcol--;
                    endRow--;
                }
                System.out.println();
             }  public static void main(String[] args){
                   int Matrix[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16} };
                      Spiralmatrix(Matrix);
                    }
                 }     */  
                        /*       //DIAGONALSUM
                        public static int diagonalSum(int matrix[][]){
                         int sum=0;
                         for(int i=0;i<matrix.length;i++){
                           for(int j=0;j<matrix[0].length;j++){
                                 if(i==j){
                                     sum+=matrix[i][j];
                                 }
                                 else if(i+j==matrix.length-1){
                                     sum+=matrix[i][j];
                                 }
                              }
                          }           return sum;
                        
                             public static void main(String args[]){
                            int matrix[][]={
                                {1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}
                            };
                           System.out.println (diagonalSum(matrix));
                      }
                    }            // output
                                      //68   

                              //SAME OUTPUT BUT CODE DIFFERENT
                         public static int diagonalSum(int matrix[][])
                        {
                            int sum=0;
                           for(int i=0;i<matrix.length;i++)
                           {
                               //prime diagonal
                            sum+=matrix[i][i];
                             //second diagonal
                              if(i!=matrix.length-1-i)
                              {
                                sum+=matrix[i][matrix.length-i-1];
                                }
                              } return sum;
                           }  
                             public static void main(String args[]){
                            int matrix[][]={
                                {1,2,3,4,},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16}
                            };
                           System.out.println (diagonalSum(matrix));
                      }
                    }    
                              // OUTPUT
                               //68  */
                               /* 
                               public static boolean stairCaseSearch(int matrix[][],int key)
                               {
                                   int row=0;
                                   int col=matrix[0].length;
                                   while(row<matrix.length && col>0){
                                    if(matrix[i][j]==key){
                                        System.out.println("key is found "+("+row+","+col+"));
                                        return true;
                                    }
                                     else if(key<matrix[i][j]){
                                        col--;
                                     }
                                      else{
                                        row++;
                                      }
                                   }     System.out.println("key is not found ");
                                   return false;
                               }
                               public static void main(String args[]){
                                int matrix[][]={
                                    {1,2,3,4,},
                                    {5,6,7,8},
                                    {9,10,11,12},
                                    {13,14,15,16}
                                };
                                int key=15;
                                stairCaseSearch(matrix,key) ;
                          }
                        }    */     // home work
                              /*public static void main(String args[]){
                                int matrix[][]={{1,2,3,2},{1,2,5,6}};
                                int key=0;
                                for (int i=0;i<matrix.length;i++){
                                    for(int j=0;j<matrix[0].length;j++){
                                        if(matrix[i][j]==2){
                                          key++;
                                    }
                                }     
                            }     
                             System.out.println("total number of = "+ key);
                            } 
                           }    output
                                  total number of = 3
                                  */
                                  /*public static void main(String args[]){
                                    int matrix[][]={{1,2,3,4},{4,5,6,7},{1,2,3,8}};
                                    int sum=0;
                
                                        for(int i=0;i<matrix[0].length;i++){
                                           sum += matrix[2][i];
                                        }     System.out.println("total 3 row ="+ sum);
                                    }     
                                   }        output
                                         total 3 row =14 */ 
      /*public static void main(String args[]){
             int row=2;
             int col=4;
         int matrix[][]={{1,2,3,4},{4,5,6,7}};
             printSum(matrix);
            int transpose[][]= new int[col][row];
              for(int i=0;i<row;i++){
                for(int j=0; j<col;j++){
                    transpose[j][i]= matrix[i][j];
                }
            }     printSum(transpose);
        }
            public static void printSum(int matrix[][]){
                System.out.println("The matrix is: ");
             for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
         }     System.out.println( );
       }       
    }
}           output
             The matrix is: 
               1 2 3 4
               4 5 6 7
             The matrix is:
               1 4
               2 5
               3 6
               4 7  */
        
                                    
                        
