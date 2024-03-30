
package Q6;


public class MinMaxTwoArray {
    public static void main(String[] args) {
   Integer[][]numbers={{4,5,6},{1,2,3}};
   System.out.println("Minimum:"+min(numbers));
   System.out.println("Maximum:"+max(numbers));
    }
    
    public static <E extends Comparable<E>> E min(E[][]list){
        E min=list[0][0];
        for(E[]row:list){
            for(E column:row){
                if(column.compareTo(min)<0){
                    min=column;
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max=list[0][0];
        for(E[]row:list){
            for(E column:row){
                if(column.compareTo(max)>0){
                    max=column;
                }
            }
        }
        return max;
    }
    
   
}
