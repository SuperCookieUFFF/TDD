import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook pb = new PhoneBook();
        int result = pb.add();
        assertEquals(0, result);
    }
}
