package Ejercicio567;

import Ejercicios.Caja;
import Ejercicios.Cajoneria;
import clasedia16.Golosina;

public class TestGen {

    public static void main(String[] args) {

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
    }
}

