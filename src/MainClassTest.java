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

    @Test
    public void testGetClassNumber() {

        int a = 45;
        int b = main.getClassNumber();
        Assert.assertTrue("Ошибка!!! Ожидаемое значение меньше 45", a < b);
    }

    @Test
    public void testGetClassString() {
        String a = "Hello";
        String b = "hello";
        String c = main.getClassString();

        Assert.assertTrue("В возвращаемой строке нет Hello или hello", c.contains(a) || c.contains(b));
    }

}