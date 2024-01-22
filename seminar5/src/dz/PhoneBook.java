package dz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNum);
// Введите свое решение ниже


    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        Set<Map.Entry<String, ArrayList<Integer>>> entries = phoneBook.entrySet();
        return phoneBook;
    }
}
// Не удаляйте этот класс - он нужен для

