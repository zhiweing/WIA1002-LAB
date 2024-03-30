
package Q4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngzhi
 */
public class Q04 {
     public static void main(String[] args) {
     List<Integer>list1=new ArrayList<>();
     list1.add(4);
     list1.add(6);
     list1.add(7);
    
     List<String>list2=new ArrayList<>();
     list2.add("HI");
     list2.add("Bye");
     list2.add("zai");
     
   
         System.out.println("Size of list 1:"+getSize(list1));
         System.out.println("Size of list 2:"+getSize(list2));
         list1.clear();
         System.out.println(list1);
}
     public static int getSize(List<?>list){
         return list.size();
     }
     public static void clear(List<?>list){
         list.clear();
     }
}
