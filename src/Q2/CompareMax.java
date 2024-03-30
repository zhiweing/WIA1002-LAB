
package Q2;


public class CompareMax {

    public static void main(String[] args) {
      Integer intmax=maximum(2,3,1);
      System.out.println("Maximum of 2,3 and 4 are:"+intmax);
      Double doublemax=maximum(1.2,2.3,3.4);
      System.out.println("Maximum of 1.2,2.3 and 3.4 are:"+doublemax);
      String stringmax=maximum("A","B","C");
      System.out.println("Maximum of A,B and C are:"+stringmax);
      
    }
    public static<T extends Comparable<T>> T maximum(T o1,T o2,T o3){
        if(o2.compareTo(o1)>0 && o2.compareTo(o3)>0){
         return o2;
        }
      else  if(o3.compareTo(o1)>0 && o3.compareTo(o2)>0){
           return o3;
        }
      else{
          return o1;
      }
    
    }
}
