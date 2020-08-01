package pl.sda.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SDAHashSetTest {

    @Test
    public void showCase(){
        SDAHashSet<Integer> set = new SDAHashSet<>();
        set.add(1);
        System.out.println(set.contains(1));

        assertEquals(0, set.size());

        assertTrue(set.isEmpty());

        assertEquals(5, set.getOperationCounter());

    }
}
