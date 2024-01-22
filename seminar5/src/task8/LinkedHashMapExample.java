package task8;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

        // Проверяем, пуст ли LinkedHashMap
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("LinkedHashMap пустой? " + isEmpty);
    }
}