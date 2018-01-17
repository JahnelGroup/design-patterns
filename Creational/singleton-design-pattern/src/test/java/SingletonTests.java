import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.singleton.Singleton;

public class SingletonTests {

    @Test
    public void thereShouldOnlyBeOneInstanceOfTheSingletonClass() {
        Singleton obj1 = Singleton.getInstance();
        obj1.setData("Test1");
        Singleton obj2 = Singleton.getInstance();
        obj2.setData("Test2");
        assertTrue(obj1.getData().equals("Test2"));
        assertTrue(obj2.getData().equals("Test2"));
    }

}
