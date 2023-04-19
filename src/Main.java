public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 1 ; i < 9;i++){
            list.add(i);
        }

        list.add(9);
        System.out.println(list.getElement(10));

    }
}