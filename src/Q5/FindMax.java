
package Q5;


public class FindMax {
    
        
    
    public static void main(String[] args) {
        Integer[]intArr={1,2,3};
        System.out.println("Maximum integer:"+max(intArr));
        String[]strArr={"red","green","blue"};
         System.out.println("Max string: " + max(strArr));
        Circle[]circleArr={new Circle(3),new Circle(6.9),new Circle(5.9)};
        System.out.println("Max circle radius:"+max(circleArr).getRadius());
    }
    public static <E extends Comparable<E>>E max(E[]arr){
        E max=arr[0];
        for(E e:arr){
            if (e.compareTo(max)>0){
                max=e;
            }
        }
        return max;
    }
    
   static class Circle implements Comparable<Circle>{
        private double radius;
        
        public Circle(double r){
            this.radius=r;
        }
        
        public double getRadius(){
            return this.radius;
        }
        
        public int compareTo(Circle other){
            return Double.compare(radius, other.radius);
        }
    }
    
    
}
