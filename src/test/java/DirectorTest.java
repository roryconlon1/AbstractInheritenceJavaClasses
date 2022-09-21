import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Big Boss Man", "AA000001A", 250000, "Firing Cunts", 5.23);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(2500, director.payBonus(0.01), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(262500, director.raiseSalary(0.05), 0);
    }

    @Test
    public void canSeeBudget(){
        assertEquals(5230000.00, director.getBudget(), 0);
    }

    @Test
    public void canAlterBudget(){
        assertEquals(5334600, director.newBudget(1.02), 0.1);
    }
}
