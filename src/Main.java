import java.util.Collection;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(4);
        list1.add(1);
        list1.add(6);
        list1.add(2);
        list1.add(1);
        list1.sort(2,4);
        for (int i = 0 ; i< list1.Size();i++)
        System.out.println(list1.getElement(i));
    }
}