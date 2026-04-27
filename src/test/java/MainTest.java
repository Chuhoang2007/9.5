import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testTinhTong() {
        assertEquals(10, Main.tinhTong(5, 5));
    }
    @Test
    public void testTinhHieu() {
        assertEquals(5, Main.tinhHieu(10, 5));
    }
}