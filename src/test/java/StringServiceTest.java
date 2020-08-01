import org.junit.jupiter.api.Test;
import pl.sda.ex1.StringService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceTest {
    @Test
    public void testGetSortedAlphabeticallyZAShouldSortCorrectly(){
        List<String> listUnsorted = new ArrayList<>();
        listUnsorted.add("aa");
        listUnsorted.add("ab");
        listUnsorted.add("za");
        listUnsorted.add("Ab");
        listUnsorted.add("aB");

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted = ss.getSortedAlhabetically(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallylistSorted = Arrays.asList("za", "ab", "aa", "aB", "Ab");

        assertEquals(manuallylistSorted, listSorted, "Is this assert expected?");


    }
}
