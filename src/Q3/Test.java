/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

public class Test {
     public static void main(String[] args) {
       StorePairGeneric<Integer>a =new StorePairGeneric(6,4);
       StorePairGeneric<Integer>b =new StorePairGeneric(2,2);
       StorePairGeneric<Integer>c =new StorePairGeneric(6,3);
       
         System.out.println(a.compareTo(b));
         System.out.println(b.compareTo(c));
         System.out.println(a.compareTo(c));
         System.out.println(a.equals(b));
         System.out.println(b.equals(c));
         System.out.println(a.equals(c));
     }
}
