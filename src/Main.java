import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0 ; i < 9;i++){
            list.add(s.nextInt());
        }
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(2));
        System.out.println(list.getElement(3));
        System.out.println(list.getElement(4));
        System.out.println(list.getElement(5));
        System.out.println(list.getElement(6));
        System.out.println(list.getElement(7));
        list.clear();
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(2));
        System.out.println(list.getElement(3));
        System.out.println(list.getElement(4));
        System.out.println(list.getElement(5));
        System.out.println(list.getElement(6));
        System.out.println(list.getElement(7));
    }
}