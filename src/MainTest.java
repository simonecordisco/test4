import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;

class MainTest {
@Test
    void checkDayOfWeek(){
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    assertEquals("WEDNESDAY",Main.checkDayOfWeek(data));
}
    @Test
    void checkDay(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("1",Main.checkDay(data));
    }
    @Test
    void checkMonth(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("MARCH",Main.checkMonth(data));
    }
    @Test
    void checkYEAR(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("2023",Main.checkYear(data));
    }
}