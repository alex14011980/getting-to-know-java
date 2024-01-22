package task2;

import java.util.HashSet;
import java.util.Iterator;

class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);

        }
    }
}



