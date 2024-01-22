package DZ;

/* Задание.
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут
повторяющиеся имена с разными телефонами, их необходимо считать,
как одного человека с разными телефонами. Вывод должен быть
отсортирован по убыванию числа телефонов.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {

        // Создание HashMap телефонной книги
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        //Добавление абонентов
        addSubscriber(phoneBook, "Николай", "79025628709");
        addSubscriber(phoneBook, "Павел", "79036870033");
        addSubscriber(phoneBook, "Павел", "79275649967");
        addSubscriber(phoneBook, "Николай", "79608975111");
        addSubscriber(phoneBook, "Андрей", "79298764687");
        addSubscriber(phoneBook, "Иван", "79017679801");
        addSubscriber(phoneBook, "Андрей", "79315679073");
        addSubscriber(phoneBook, "Николай", "79672167697");
        addSubscriber(phoneBook, "Максим", "79886567575");
        //Вывод данных содержащихся в телефонной книге
        System.out.println("Вывод данных из HashMap: " + phoneBook);
        System.out.println();
        printPhoneBook(phoneBook);

    }
    //Добавление новой записи в телефонную книгу
    private static void addSubscriber(Map<String, List<String>> phoneBook, String name, String phone){
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }
    //Вывод телефонной книги
    private static void printPhoneBook(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        //Сортировка абонентов
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }
}

