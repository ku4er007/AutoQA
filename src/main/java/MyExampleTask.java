import java.util.ArrayList;
import java.util.List;

public class MyExampleTask {
    public static void main(String[] args) {
        String e = "JavA Hillel";
        System.out.println(e);
        int i = 9;

        System.out.println(e + i++);
        System.out.println("Simple text0."+ " " + e + " " + i);
        System.out.println("Say Hi");
        System.out.println("No money no honey");
        System.out.println("I love GTA 5 text text text ...");
        System.out.println("Wait GTA 6");
        System.out.println("Simple text" + " " + e + " " + i);
        System.out.println("Say Hi");
        System.out.println("Say something");

        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        list.add(i--);
        list.add(i-- * i++);
        System.out.println(list);
        if (i <= 5) {
            System.out.println("Wrong list");
        } else System.out.println("Correct list");

        //Add some comment
        System.out.println("Metro 2033");
    }
}
