package SextosEjercicios;

import java.util.HashMap;
import java.util.Map;

public class ejer5{
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("a", 1);
        originalMap.put("b", 2);
        originalMap.put("c", 3);

         System.out.println("HashMap original: " + originalMap);

         HashMap<Integer, String> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("HashMap invertido: " + invertedMap);
    }
}
