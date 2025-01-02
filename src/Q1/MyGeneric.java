
package Q1;


public class MyGeneric<E> {
    private E e;
    
    MyGeneric(){
        
    }
    
    MyGeneric(E e){
        this.e=e;
    }
    
    public void setE(E e){
        this.e=e;
    }
    
    public E getE(){
        return this.e;
    }
    
    public static void main(String[] args) {
        MyGeneric<String>strobj=new MyGeneric<>();
        MyGeneric<Integer>intobj=new MyGeneric<>(23);
        strobj.setE("Hello World");
        intobj.setE(100);
        //I have add this comment
        System.out.println("String value:"+strobj.getE());
        System.out.println("Integer value: "+intobj.getE());
    }
}
