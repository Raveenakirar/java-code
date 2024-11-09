import java.util.*;
public class OOPS{
public static void main(String args[]){
Pen p1 = new Pen();
p1.setColor("Blue");
System.out.println(p1.getColor());
p1.setTip(5);
System.out.println(p1.getTip());
p1.setColor("yellow");
System.out.println(p1.getColor());
 }  
  class Pen{
    private String Color;
    private int Tip;
    String getColor(){
      return this.Color;
    } 
    int getTip(){
      return this.Tip;
    }
      void setColor(String newColor)
      {
        this.Color =newColor;
      } 
       void setTip(int Tip)
      {
        this.Tip =  Tip;
      }
    } 
   }   
    // class student{
    //String name;
    //int age;
    //float percentage;
    //void caicPercentage(int phy, int chem , int math);
    //int phy = 40;
    //int chem = 60;
    //int math = 80;
    //{
    //    Percentage=(phy +  chem + math)/3;
    //    System.out.println(caicPercentage);
    //}

  