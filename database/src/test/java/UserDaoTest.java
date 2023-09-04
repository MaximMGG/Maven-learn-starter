import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.test.database.dao.UserDao;
import com.test.entity.User;

public class UserDaoTest {
    

    @Test
    void userDaoTest() {
        Optional<User> user = new UserDao().findById(1L);

        assertTrue(user.isPresent());
    }
}
