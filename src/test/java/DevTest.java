import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DevTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve", "KL017391V", 42000);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(420.00, developer.payBonus(0.01), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(44100.00, developer.raiseSalary(0.05), 0);
    }
}
