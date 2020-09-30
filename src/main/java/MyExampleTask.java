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
        System.out.println("Say Hiiii");
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
        System.out.println("Metro 2033 and Last light 2");
        System.out.println("God of War");
        System.out.println("God of War 2");
        System.out.println("God of War 33333");
        String f = "God of War 20";
        System.out.println(f);
        int r;
        double ui;
        String test;
        double test2;
        test2 =56;
        String qwe = "rty";
    }
}
