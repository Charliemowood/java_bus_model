import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;

@Before
public void before() {
 bus = new Bus(56);
 person = new Person();
}

@Test
public void hasNumber() {
  assertEquals(56, bus.getNumber());
}



}
