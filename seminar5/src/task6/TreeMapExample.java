package task6;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);
        ageMap.put("Олег", 26);

        // Получаем наибольший ключ, меньший или равный "Мария"
        String floorKey = ageMap.floorKey("Мария");
        System.out.println("Наибольший ключ, меньший или равный 'Мария': " + floorKey);

        // Получаем наименьший ключ, больший или равный "Мария"
        String ceilingKey = ageMap.ceilingKey("Мария");
        System.out.println("Наименьший ключ, больший или равный 'Мария': " + ceilingKey);

        // Получаем наименьший ключ, строго больший "Мария"
        String higherKey = ageMap.higherKey("Мария");
        System.out.println("Наименьший ключ, строго больший 'Мария': " + higherKey);

        // Получаем наибольший ключ, строго меньший "Мария"
        String lowerKey = ageMap.lowerKey("Мария");
        System.out.println("Наибольший ключ, строго меньший 'Мария': " + lowerKey);


    }
}
