package pl.sda.ex4;

import java.util.*;

public class Storage {

        //utwórz prywatne pole typu Map
        private Map<String, List<String>> map = new HashMap<>();

        //dodaj do mapy klucze i wartości
        public void addToStorage(String key, String value) {
            if(map.containsKey(key)){
                map.get(key).add(value);
            } else {
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }

        //wypisz wartości pod zadanym kluczem
        public void printValue(String key) {
            System.out.println(this.map.get(key));
        }

        //wypisz klucze, które zawierają zadaną wartość
        public void findValues(String value) {
            Set<Map.Entry<String, List<String>>> entries = map.entrySet();
            List<String> keys = new ArrayList<>();
            for (Map.Entry<String, List<String>> entry : entries) {
                if (entry.getValue().contains(value)) {
                    keys.add(entry.getKey());
                }
            }
            System.out.println(keys.toString());
        }

        @Override
        public String toString() {
            return "Storage" + map;
        }
    }


