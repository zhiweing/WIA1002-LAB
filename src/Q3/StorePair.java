
package Q3;


public class StorePair implements Comparable<StorePair> {
   
    private int first, second;
    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
        }
    
    public int getFirst() {
        return first;
     }
    
    public int getSecond() {
        return second;
    }
    
    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
        }
    
    @Override
    public String toString() {
          return "first = " + first + " second = " + second;
    }
    
    @Override
    public int compareTo(StorePair other){
        return this.getFirst()-other.getFirst();
    }
    //override the object equal method to compare the first value of two objects
    public boolean equal(Object anotherObject){
        if(this==anotherObject){ //this means a reference to current object,if both reference are same means they point to same location in the memory
            return true;
        }
        if(!(anotherObject instanceof StorePair)){
            return false;
        }
        
        StorePair anotherObj=(StorePair) anotherObject;
      
         return this.getFirst()==(anotherObj.getFirst());
    }
}

