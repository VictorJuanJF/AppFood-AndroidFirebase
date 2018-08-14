package com.example.jimenez.menu.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Helper class for providing sample nombre for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Comida> ITEMS = new ArrayList<Comida>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Comida> ITEM_MAP = new HashMap<String, Comida>();

    private static final int COUNT = 0;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    public static void addItem(Comida item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    public static void  updateItem(Comida comida){
        ITEMS.set(ITEMS.indexOf(comida),comida);
        ITEM_MAP.put(comida.getId(),comida);
    }

    public static void deleteItem(Comida comida){
        ITEMS.remove(comida);
        ITEM_MAP.remove(comida);
    }

    private static Comida createDummyItem(int position) {
        return new Comida(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of nombre.
     */
    public static class Comida {
        private  String id;
        private  String nombre;
        private  String precio;

        public Comida() {
        }

        public Comida(String nombre, String precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public Comida(String id, String nombre, String precio) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return nombre;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPrecio() {
            return precio;
        }

        public void setPrecio(String precio) {
            this.precio = precio;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Comida comida = (Comida) o;
            return Objects.equals(id, comida.id);
        }

        @Override
        public int hashCode() {

            return Objects.hash(id);
        }
    }
}
