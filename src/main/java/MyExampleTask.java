import java.util.ArrayList;
import java.util.List;

public class MyExampleTask {
    public static void main(String[] args) {
        String e = "JavA Hillel";
        System.out.println(e);
        int i = 9;

        System.out.println(e + i++);
        System.out.println("Simple text"+ " " + e + " " + i);
        System.out.println("Say Hi");
        System.out.println("Say something");

        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        list.add(i--);
        list.add(i-- * i++);
        System.out.println(list);

    }
}
