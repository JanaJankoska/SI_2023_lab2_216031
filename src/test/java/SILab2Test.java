import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test{

    @Test
    void testeverybranch(){
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        List<User> users1 = new LinkedList<>();
        users1.add(new User("Ime", "ime111", "imeprez@gmail.com"));
        users1.add(new User("janajankoska@gmail.com", "jana", "janajankoska@gmail.com"));

        List<User> users2 = new LinkedList<>();
        users2.add(new User("Ime", "ime111", "imeprez@gmail.com"));
        users2.add(new User("janajankoska@gmail.com", "jana111!@", "janajankoska@gmail.com"));

        List<User> users3 = new LinkedList<>();
        users3.add(new User("Ime", "ime111", "imeprez@gmail.com"));
        users3.add(new User("janaa@gmail.com", "jana111!@", "jana@gmail.com"));


        User user1 = new User(null, "jana", "janajankoskagmail.com");
        User user2 = new User(null, "jana111!@", "janajankoska@gmail.com");
        User user3 = new User(null, "j ana111!@", "janajankoska@gmail.com");
        User user4 = new User("janaaaa", "jana11111", "janajankoska@gmail.com");
        assertFalse(SILab2.function(user1, users1));
        assertFalse(SILab2.function(user2, users2));
        assertFalse(SILab2.function(user3, users2));
        assertFalse(SILab2.function(user4, users3));
    }

    @Test
    void testmultiplecondition(){
        User user1 = new User(null, null, null);
        RuntimeException e = assertThrows(RuntimeException.class, () -> SILab2.function(user1, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        User user2 = new User("jana", null, null);
        e = assertThrows(RuntimeException.class, () -> SILab2.function(user2, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        User user3 = new User("jana", "jana", null);
        e = assertThrows(RuntimeException.class, () -> SILab2.function(user3, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        User user4 = new User("janaaa", "jana111", "janajankoska@gmail.com");
        e = assertThrows(RuntimeException.class, () -> SILab2.function(user4, null));
        assertNotEquals("Mandatory information missing!", e.getMessage());
    }
}