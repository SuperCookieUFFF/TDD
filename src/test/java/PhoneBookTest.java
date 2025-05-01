import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add();
        assertEquals(0, result);
        System.out.println("Тест 1 готов");

    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String result = phoneBook.findByNumber("1234567890");
        assertNull(result);
        System.out.println("Тест 2 готов");

    }
}

