import java.util.Objects;

public class MyArrayList<E>{
     private Object[] arr;
     private int size=0;
     MyArrayList(){
         arr = new Object[5];

     }
     public void add(E element){
         if(size == arr.length){
             E[] newArr = (E[])new Object[arr.length*2];
             for(int i = 0 ; i < arr.length;i++){
                 newArr[i] = (E) arr[i];
             }
             arr = newArr;
         }
             arr[size++] = element;
     }
     public E getElement(int index){
        checkIndex(index);
         return (E) arr[index];
     }
     public void remove(int index){
         checkIndex(index);
         for (int i = index+1;i<size;i++){
                 arr[i-1]=arr[i];
             }
             size--;
     }
     public int Size(){
        return size;
     }
     public void checkIndex(int index){
         if(index<0 || index>=arr.length) throw new IndexOutOfBoundsException();
     }
     public boolean contains(Object o){
         if(o== null){
             for (int i = 0 ; i < size; i ++){
                 if(arr[i] == null){
                     return true;
                 }
             }
         }
         else{
             for (int i = 0 ; i < size;i++){
                 if(o.equals(arr[i])){
                     return true;
                 }

             }
         }
         return false;
     }
     public void add(E item,int index) {
         if (index >= size) {
             Object[] newArr = new Object[arr.length*20];
             for(int i = 0 ; i < arr.length;i++){
                 newArr[i] = arr[i];
             }
             arr = newArr;
             arr[index] = item;
         }
         else {
             arr[index] = item;
             size++;
         }
     }

     public boolean removeAndChecker(E item){
         for (int i = 0;i<=size;i++){
             if(Objects.equals(item,arr[i])){
                 remove(i);
                 return true;
             }
         }
         return false;
     }
    public void clear(){
         size=0;
         Object[] newArr = new Object[size];
         arr = newArr;
    }

}
