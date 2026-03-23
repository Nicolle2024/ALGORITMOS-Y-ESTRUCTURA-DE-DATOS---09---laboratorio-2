package Ejercicios;

import clasedia16.Chocolatina;
import clasedia16.Golosina;

public class TestGen {

    public static <T> boolean exist(T[] arreglo, T elemento) {
        for (T item : arreglo) {
            if (item != null && item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        System.out.println(exist(v, "Sanchez")); // true
        Integer[] w = {12, 34, 56};
        System.out.println(exist(w, 34)); // true
        Golosina g1 = new Golosina("Caramelo", 0.5);
        Golosina g2 = new Golosina("Chicle", 0.2);

        Golosina[] golosinas = {g1, g2};
        System.out.println(exist(golosinas, new Golosina("Chicle", 0.2))); // true

        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");

        Chocolatina[] chocos = {c1, c2};
        System.out.println(exist(chocos, new Chocolatina("Milka"))); // true

            Cajoneria<Golosina> cajoneria = new Cajoneria<>(10);

            cajoneria.add(new Caja<>("Rojo", new Golosina("Caramelo", 0.5)));
            cajoneria.add(new Caja<>("Azul", new Golosina("Chicle", 0.2)));
            cajoneria.add(new Caja<>("Verde", new Golosina("Gomita", 0.3)));
            cajoneria.add(new Caja<>("Amarillo", new Golosina("Chocolate", 0.8)));
            cajoneria.add(new Caja<>("Negro", new Golosina("Toffee", 0.4)));

            System.out.println("Contenido:");
            System.out.println(cajoneria);

            System.out.println("Buscar Chicle:");
            System.out.println(cajoneria.search(new Golosina("Chicle", 0.2)));
            System.out.println("\nEliminar Gomita:");
            System.out.println(cajoneria.delete(new Golosina("Gomita", 0.3)));

            System.out.println("\nContenido final:");
            System.out.println(cajoneria);
            
            System.out.println("Cantidad de Chicle:");
            System.out.println(cajoneria.count(new Golosina("Chicle", 0.2)));
        }
    }

