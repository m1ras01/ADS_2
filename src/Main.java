import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0 ; i < 9;i++){
            list.add(s.nextInt());
        }
        System.out.println(list.indexOf(2));
    }
}