package tarea_2;

import java.util.HashMap;
import java.util.Map;

public enum Opcion {
    Ejercico1(1),
    Ejercicio2(2),
    Ejercicio3(3),
    Ejercicio4(4),
    Salir(5);

    private int value;
    private static Map map = new HashMap<>();

    Opcion(int value) {
        this.value = value;
    }

    static {
        for (Opcion pageType : Opcion.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Opcion valueOf(int pageType) {
        return (Opcion) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
