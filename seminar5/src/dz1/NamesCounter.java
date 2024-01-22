package dz1;

import java.util.*;

class NamesCounter {
    private final HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        String[] employees = names(name);


    }

    private String[] names(String name) {
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        Map<String, Integer> nameCount = new HashMap<>();
        String[] employees;
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        // Сортировка имен по популярности с использованием TreeMap
        TreeMap<String, Integer> sortedNames = new TreeMap<>(
                (name1, name2) -> nameCount.get(name2).compareTo(nameCount.get(name1))
        );
        sortedNames.putAll(nameCount);
        }

    }

