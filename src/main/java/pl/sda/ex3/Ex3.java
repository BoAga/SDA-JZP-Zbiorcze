package pl.sda.ex3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex3 {
    public static class Main {

        public static void main(String[] args) {

            methodMap(mapInit());

        }

        public static void methodMap(Map<String,Integer> map){

            Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();


            while (iterator.hasNext()){
                Map.Entry<String,Integer> entry= (Map.Entry<String, Integer>) ((Iterator) iterator).next();

                if (iterator.hasNext()){
                    System.out.println("Klucz: "+entry.getKey()+", Wartość: "+entry.getValue()+", ");
                } else System.out.println("Klucz: "+entry.getKey()+", Wartość: "+entry.getValue()+". ");

            }

        }

        public static Map<String,Integer> mapInit(){
            Map<String,Integer> map=new LinkedHashMap<>();
            map.put("Java",18);
            map.put("Python",1);
            map.put("JavaScript",4);
            map.put("PHP",0);
            return map;
        }
    }
}
