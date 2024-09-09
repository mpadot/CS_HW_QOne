import java.util.*;
public class Collections <t>{
    public t[] arr;
    public int size;



    public Collections() {
        this.size = 10;
        this.arr = (t[]) new Object[size];

    }
    public  boolean isEmpty(){
        if(arr == null){
            return true;
        }else{
            return false;
        }
    }

    public void makeEmpty(){
        for(int i = 0; i<size; i++){
            arr[i] = null;
        }
        size=0;
    }
    public void insert(t item){
        if(size<arr.length) {
            arr[size] = item;
            size++;
        }else{
                System.out.println("No room left in the list to add " + item);
            }


    }
    public void remove(t item){
        for(int i=0; i<size;i++) {
            if (arr[i].equals(item)) {
                arr[i] = arr[size - 1];
                arr[size - 1] = null;
                size--;
            }
        }
    }
    public boolean isPresent(t item){
        for(int i=0; i<size; i++){
            if(arr[i] == item){
                return true;
            }

        }
        return false;

    }
}
