public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 1 ; i < 9;i++){
            list.add(i);
        }
        System.out.println(list.getElement(1));
        for (int i = 0 ; i < 4;i++){
            System.out.println(list.getElement(i));
        }
        System.out.println(list.contains(null));
    }
}