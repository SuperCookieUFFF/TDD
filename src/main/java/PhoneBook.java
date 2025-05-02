import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook; // Создаём мапу ключ-значение для удобного поиска

    public PhoneBook() {
        this.phoneBook = new HashMap<>(); // Инициализируем мапу
    }

    // Метод для добавления контакта
    public void add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    // Метод для поиска имени по номеру телефона
    public String findByNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null; // Возвращаем null, если номер телефона не найден
    }

    // Метод для поиска номера телефона по имени
    public String findByName(String name) {
        return phoneBook.get(name);
    }

    // Метод для вывода всех имён
    public void printAllNames() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name);
        }
    }
}