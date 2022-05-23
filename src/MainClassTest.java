import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass main = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int a = 14;

        int b = main.getLocalNumber();
        Assert.assertEquals("Ошибка!!! Ожидаемое значение не равно 14", a, b);
    }

}