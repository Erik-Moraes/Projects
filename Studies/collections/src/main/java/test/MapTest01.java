package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {

        Map <String, String> map = new HashMap<>();
        map.put("tec", "teclado");
        map.put("mouze", "mouse");
        map.put("pc", "computador");
        map.put("tela", "monitor");

        System.out.println(map);;

    }
}
