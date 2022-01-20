package eecs1022.tutorial.counter;

import org.junit.Test;

import eecs1022.tutorial.counter.model.Counter;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestCounter {
    @Test
    public void test_Counter1() {
        Counter c = new Counter(23);
        assertEquals(23, c.getValue());

        c.increment();
        assertEquals(24, c.getValue());

        c.decrement();
        assertEquals(23, c.getValue());
    }
}