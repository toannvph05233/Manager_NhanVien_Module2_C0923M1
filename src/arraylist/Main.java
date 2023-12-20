package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ManageElement<String> strings = new ManageElement<>();
        strings.add("Toàn");
        strings.add("Nam");
        strings.add("Dương");
        strings.add("Quỳnh");
        strings.add("Long");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("------------------------");

    }
}
