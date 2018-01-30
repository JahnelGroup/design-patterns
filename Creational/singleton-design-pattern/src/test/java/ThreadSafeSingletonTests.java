import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.singleton.ThreadSafeSingleton;

public class ThreadSafeSingletonTests {

    /*
     * This test proves that there is only one instance of the ThreadSafeSingleton class.
     * 
     */
    @Test
    public void thereShouldOnlyBeOneInstanceOfTheThreadSingletonClass() {
        ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
        assertTrue(obj1.equals(obj2));
    }

}
