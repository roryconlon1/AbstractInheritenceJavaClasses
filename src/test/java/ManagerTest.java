import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Paul", "PY839230B", 34000, "Accounting");
    }

    @Test
    public void canGiveBonus(){
        assertEquals(340.00, manager.payBonus(0.01), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(35700.00, manager.raiseSalary(0.05), 0);
    }

    @Test
    public void cannotRaiseMinusSalary(){
        assertEquals(34000.00, manager.raiseSalary(-0.05), 0);
    }

    @Test
    public void canChangeName(){
        assertEquals("John", manager.setName("John"));
    }

    @Test
    public void cannotChangeNameToEmptyString(){
        assertEquals("Paul", manager.setName(""));
    }

}
