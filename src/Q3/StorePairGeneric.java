
package Q3;


public class StorePairGeneric <T extends Comparable<T>>implements Comparable<StorePairGeneric<T>>{
    private T first,second;
    public StorePairGeneric(T first,T second){
        this.first=first;
        this.second=second;
    }
    
    public T getFirst(){
        return this.first;
    }
    
    public T getSecond(){
        return this.second;
    }
    
    public void setPair(T first,T second){
        this.first=first;
        this.second=second;
    }
    public String toString(){
        return "first= "+first+" second= "+second;
    }
    @Override
    public int compareTo(StorePairGeneric<T>other){
       return this.getFirst().compareTo(other.getFirst());
    }
    
      public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        StorePairGeneric<T> anotherObj=(StorePairGeneric<T>)obj;
        return anotherObj.getFirst().equals(this.getFirst());
      }
}
    

