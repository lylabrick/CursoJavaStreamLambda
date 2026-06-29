package com.cursojavaadvanced.EjemploHashMap;

import java.util.HashMap;
import java.util.Map;

public class MiHaspMapExample {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // put: inserta o actualiza
        stock.put("teclado", 15);
        stock.put("mouse", 30);
        stock.put("monitor", 8);

        // get: O(1) promedio
        System.out.println(stock.get("mouse")); // 30

        // getOrDefault: evita NPE si la key no existe
        System.out.println(stock.getOrDefault("webcam", 0)); // 0

        // containsKey / containsValue
        System.out.println(stock.containsKey("teclado")); // true

        // actualizar con merge (típico para contadores)
        stock.merge("mouse", 5, Integer::sum); // mouse pasa a 35

        // remove
        stock.remove("monitor");

        // iterar
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}