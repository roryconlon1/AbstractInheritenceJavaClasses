import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DBATest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John", "JD362903B", 25000);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(250.00, databaseAdmin.payBonus(0.01), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(26250.00, databaseAdmin.raiseSalary(0.05), 0);
    }
}
