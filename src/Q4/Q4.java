/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;


public class Q4 {
  public static void main(String[] args) {
      Integer[] intArray = {5,3,7,1,4,9,8,2};
      String[] strArray = {"red", "blue", "orange", "tan"};
      System.out.println(minmax(intArray));
      System.out.println(minmax(strArray));
  }  
  
  
     public static <T extends Comparable<T>>String minmax(T[]array){
         T min=array[0];
         T max=array[0];
         
         for(int i=1;i<array.length;i++){
             if(array[i].compareTo(min)<0){
                 min=array[i];
             }
             if(array[i].compareTo(max)>0){
                 max=array[i];
             }
         }
         
         return "Min="+min+" Max="+max;
     }
}
