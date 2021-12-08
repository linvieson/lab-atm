package builder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void testUserAttributes(){
        User user = User.builder().firstName("Oles").age(1).occupation("UCU").build();
        assertEquals(user.getFirstName(), "Oles");
        assertEquals(user.getAge(), 1);
        assertEquals(user.getOccupations().get(0), "UCU");
    }
}
