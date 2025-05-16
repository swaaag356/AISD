package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashTask1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Яблоко яблоко яблоко курица попкорн";
        String[] strings = text.split(" ");
        for(String str : strings) {
            map.put(str, map.get(str) == null ? 1 : map.get(str) + 1);
        }
        map.entrySet().stream().forEach(e ->System.out.println(e.getKey() + " " + e.getValue()));
    }
}
