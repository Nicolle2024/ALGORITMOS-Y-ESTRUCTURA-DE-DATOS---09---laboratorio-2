package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria<T> implements Iterable<Caja<T>> {

    private ArrayList<Caja<T>> cajas = new ArrayList<>();
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
    }

    public void add(Caja<T> caja) {
        if (caja == null) {
            throw new IllegalArgumentException("La caja no puede ser null");
        }

        if (cajas.size() < tope) {
            cajas.add(caja);
        } else {
            throw new RuntimeException("No caben más cajas");
        }
    }

    @Override
    public Iterator<Caja<T>> iterator() {
        return cajas.iterator();
    }

    public String search(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            T contenido = cajas.get(i).getContenido();

            if (contenido != null && contenido.equals(elemento)) {
                return "Posición: " + i +
                       ", Color: " + cajas.get(i).getColor();
            }
        }
        return "No se encontró";
    }

    public T delete(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            T contenido = cajas.get(i).getContenido();

            if (contenido != null && contenido.equals(elemento)) {
                cajas.remove(i);
                return contenido;
            }
        }
        return null;
    }
    public int count(T elemento) {
        int contador = 0;

        for (Caja<T> caja : cajas) {
            if (caja.getContenido().equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }


    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cajas.size(); i++) {
            resultado.append("Posición: ").append(i)
                     .append(" | Color: ").append(cajas.get(i).getColor())
                     .append(" | Objeto: ").append(cajas.get(i).getContenido())
                     .append("\n");
        }

        return resultado.toString();
    }
}