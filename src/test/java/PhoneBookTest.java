import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @Before
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAdd() {
        phoneBook.add("Вася", "123-345");
        assertEquals("123-345", phoneBook.findByName("Вася"));
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("Вася", "123-345");
        assertEquals("Васasя", phoneBook.findByNumber("12323-345"));
        assertNull(phoneBook.findByNumber("999-999")); // Проверка на отсутствие контакта
    }

    @Test
    public void testFindByName() {
        phoneBook.add("Вася", "123-345");
        assertEquals("123-345", phoneBook.findByName("Вася"));
        assertNull(phoneBook.findByName("Петя")); // Проверка на отсутствие контакта
    }

    @Test
    public void testPrintAllNames() {
        phoneBook.add("Вася", "123-345");
        phoneBook.add("Петя", "678-901");
        phoneBook.printAllNames();
    }
}