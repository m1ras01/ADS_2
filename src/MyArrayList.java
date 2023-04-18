public class MyArrayList<E>{
     private Object[] arr;
     private int size=0;
     MyArrayList(){
         arr = new Object[5];

     }
     public void add(E element){
         if(size == arr.length){
             Object[] newArr = new Object[arr.length*2];
             for(int i = 0 ; i < arr.length;i++){
                 newArr[i] = arr[i];
             }
             arr = newArr;
         }
         else{
             arr[size] = element;
             size++;
         }
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
         if(index<0 || index>=size) throw new IndexOutOfBoundsException();
     }



}
