package pl.sda.ex1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringService {
    public List<String> getSortedAlhabetically(List<String> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

        public List<String> getSortedAlhabeticallyCaseInsensitive(List<String> list){
            Collections.sort(list, Comparator.comparing((String s) -> toString().toLowerCase()).reversed());
            return list;
    }
}
